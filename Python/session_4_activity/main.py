
def get_class_teacher(teacher_id, teachers_dict):
    """
    :param teacher_id: int
    :param teachers_dict: dict()
    :return teacher_name: string
    """
    teacher_name = teachers_dict[teacher_id]
    return teacher_name

raw_data = '5957276,Hadi Yap,Interface Design,25;9273408,Efrat Henriksen,Interface Design,22;5069877,Henrikki Salazar,Artificial Intelligence,10;9919992,Aurelianus Das,Data Modelling with SQL and Python,15;7295548,Dalia Milovanovic,Data Modelling with SQL and Python,13;5069877,Henrikki Salazar,Discrete Mathematics,20;7295548,Dalia Milovanovic,Discrete Mathematics,18;7295548,Dalia Milovanovic,Programming in C#,13;7295548,Dalia Milovanovic,Programming in C#,17;9919992,Aurelianus Das,Programming in Java,17;9919992,Aurelianus Das,Programming in Java,19;5957276,Hadi Yap,Master Microsoft Office,12'
raw_classes = raw_data.split(';')
teachers = dict()
classes = list()


for raw_class in raw_classes:
    temp = raw_class.split(',')
    teachers[temp[0]] = temp[1]
    class_ = [temp[0], temp[2], temp[3]]

    classes.append(class_)

for class_ in classes:
    for info in class_:
        print(info)
    print("\n")

teacher_name = get_class_teacher('5957276', teachers)
help(get_class_teacher)
print(teacher_name)


# sets
set_A = {1,2,3,4,5,6}
set_B = {5,6,7,8,9,0}
in_A_not_B = set_A.difference(set_B)

in_A_or_B = set_A.symmetric_difference(set_B)
print(in_A_or_B)
print(in_A_not_B)

# ranges
sequence = range(1,21)
for item in sequence:
    print(item)

# slices
print("\n")
print(raw_data[0:7])

for item in sequence[4::-1]:
    print(item)

