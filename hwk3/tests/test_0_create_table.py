import unittest
from src.main import commit

class Test0(unittest.TestCase):
    def test_0_drop_table_if_exist(self) :
        print("Dropping student table if exist...")
        query = "DROP TABLE IF EXISTS student"
        result = commit(query, [])
        
    # setup test date from sql file and also sample posts
    def test_1_create_table(self) :
        print("Setting up student table...")
        query = "CREATE TABLE student(id SERIAL PRIMARY KEY, firstName VARCHAR(40) NOT NULL, lastName VARCHAR(40) NOT NULL, age INT, address VARCHAR(80), email VARCHAR(40))"
        result = commit(query, [])

if __name__ == '__main__':
    unittest.main()