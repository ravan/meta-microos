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

PV = "1.1.1"

RPM_NAME = "python312-PyMySQL-1.1.1-1.3.noarch.rpm"
RPM_HASH = "c6879e7a94e80f93bdc8b4c2f5e56d89cc47e5d57c4e53392426d3acc4108abd5b4b7e288c94b5dea4bf7b3d4a7b59ba8d88dd6537c52c42e56d3b88a047bf3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.12dist-pymysql \
python312-PyMySQL \
python3dist-pymysql"

RDEPENDS:${PN} += "python-abi \
python312-cryptography"

inherit rpm
