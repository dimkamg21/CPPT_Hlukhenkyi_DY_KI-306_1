import os
import struct
import math
import sys

def size_input():
    while True:
        try:
            size = int(input("Введіть розмір квадратної матриці: "))
            if size <= 0:
                print("Розмір повинен бути більшим за 0")
                continue
            return size
        except Exception as ex:
            print(f"{ex} Введіть ціле число")


def filler_input():
    while True:
        try:
            filler = input("Введіть символ для заповнення матриці: ")
            if len(filler) != 1:
                print("Введіть 1 символ")
                continue
            return filler
        except Exception as ex:
            print(ex)


# def generate_array(size, filler):
#     arr = []
#     for i in range(size):
#         row = [' '] * size
#         if i <= size // 2:
#             row[i:size - i] = [filler] * (size - 2 * i)
#         else:
#             row[size - i - 1:i + 1] = [filler] * (2 * (i - size // 2) + 1)
#         arr.append(row)
#     return arr

def generate_array(size, filler):
    arr = []
    for i in range(size):
        row = [' '] * size
        if i == size // 2:
            row[i:size - i] = ['*'] * (size - 2 * i)
        elif i < size // 2:
            row[i:size - i] = [filler] * (size - 2 * i)
        else:
            row[size - i - 1:i + 1] = [filler] * (2 * (i - size // 2) + 1)
        arr.append(row)
    return arr

def print_array(arr):
    for row in arr:
        print(''.join(row))

def write_middle_rows_to_file(arr, filename):
    middle_index = len(arr) // 2
    with open(filename, 'w') as f:
        for i in range(middle_index - 1, middle_index + 2):
            f.write(''.join(arr[i]) + '\n')


size = size_input()
filler = filler_input()
arr = generate_array(size, filler)
print_array(arr)

write_middle_rows_to_file(arr, 'middle_row.txt')
