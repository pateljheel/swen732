import psycopg2

def get_conn():
    return psycopg2.connect(dbname='postgres',
                            user='postgres',
                            password='postgres',
                            host='localhost',
                            port='5432')

def get_one(sql, args={}):
    conn = get_conn()
    cur = conn.cursor()
    cur.execute(sql, args)
    one = cur.fetchone()
    conn.close()
    return one

def get_all(sql, args=None):
    conn = get_conn()
    cur = conn.cursor()
    cur.execute(sql, args)
    list_of_tuples = cur.fetchall()
    conn.close()
    return list_of_tuples

def commit(sql, args={}):
    conn = get_conn()
    cur = conn.cursor()
    result = cur.execute(sql, args)
    conn.commit()
    conn.close()
    return result
