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

RPM_NAME = "python311-PyMySQL-1.1.1-1.3.noarch.rpm"
RPM_HASH = "b9e03dd5b57c8c781d328b4f278a9acbe9530873fce384a6bccc0b109eeea8a5eca55c7db8cd9da56d293b10ea91061e52f9e2336855df1ae267a392c0eab214"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyMySQL \
python3.11dist-pymysql \
python311-PyMySQL \
python3dist-pymysql"

RDEPENDS:${PN} += "python-abi \
python311-cryptography"

inherit rpm
