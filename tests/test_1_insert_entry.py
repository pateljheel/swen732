import unittest
from src.main import commit

class Test1(unittest.TestCase):
    # setup test date from sql file and also sample posts
    def test_0_insert_entry(self) :
        print("Inserting entry in the student table...")
        query = "INSERT INTO student(firstname, lastname, age, address, email) VALUES(%s, %s, %s, %s, %s) RETURNING *"
        result = commit(query, ['Mona the', 'Octocat', 9, '88 Colin P Kelly Jr St, San Francisco, CA 94107, United States', 'octocat@github.com'])

if __name__ == '__main__':
    unittest.main()