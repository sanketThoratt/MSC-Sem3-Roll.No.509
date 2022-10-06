import mysql.connector as m

# database which you want to backup
db = 'school'

connection = m.connect(host='localhost', user='root',password='sanket9014', database='school')
cursor = connection.cursor()

# Getting all the table names
cursor.execute('SHOW TABLES;')
table_names = []
for record in cursor.fetchall():
	table_names.append(record[0])

backup_dbname = db + '_backup'
try:
    cursor.execute(f'CREATE DATABASE {backup_dbname}')
except:
    pass

cursor.execute(f'USE {backup_dbname}')
  
for table_name in table_names:
    cursor.execute(
        f'CREATE TABLE {table_name} SELECT * FROM {db}.{table_name}')
print("Backup Created")

