SUMMARY = "Pure Python MySQL Driver"
DESCRIPTION = "This package contains a pure-Python MySQL client library. Documentation on the \
MySQL client/server protocol can be found here: \
http://forge.mysql.com/wiki/MySQL_Internals_ClientServer_Protocol \
 \
The goal of pymysql is to be a drop-in replacement for MySQLdb and work on \
CPython 2.3+, Jython, IronPython, PyPy and Python 3. We test for compatibility \
by simply changing the import statements in the Django MySQL backend and running \
its unit tests as well as running it against the MySQLdb and myconnpy unit tests."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python314-PyMySQL-1.2.0-1.2.noarch.rpm"
RPM_HASH = "09ad36ccc9f4d79b7cc1a295ec51fc14b0dd815e636ab76f81154f39edfa502f6b481b7f0bad6dfae609f1798fdffc6f2eba645f2920a5e6ce1dfbcba74693be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pymysql \
python314-PyMySQL \
python3dist-pymysql"

RDEPENDS:${PN} += "python-abi \
python314-cryptography"

inherit rpm
