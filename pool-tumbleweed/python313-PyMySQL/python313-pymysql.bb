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

RPM_NAME = "python313-PyMySQL-1.2.0-1.2.noarch.rpm"
RPM_HASH = "2ab37dcb7112b3a1160a644c65511becfc1955afbcf1c02044fc077a24da63d61311b1382b483a5e0696b71f628992db1bd45b24b0bfab83ee06100d513cb7d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyMySQL \
python3.13dist-pymysql \
python313-PyMySQL \
python3dist-pymysql"

RDEPENDS:${PN} += "python-abi \
python313-cryptography"

inherit rpm
