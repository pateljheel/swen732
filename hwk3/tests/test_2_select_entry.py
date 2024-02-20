import unittest
from src.main import get_all

class Test1(unittest.TestCase):
    # setup test date from sql file and also sample posts
    def test_0_select_entry(self) :
        print("Fetching entries from the student table...")
        query = "SELECT * FROM student"
        result = get_all(query, [])
        self.assertEqual(len(result), 1)

if __name__ == '__main__':
    unittest.main()