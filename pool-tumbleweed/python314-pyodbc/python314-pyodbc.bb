SUMMARY = "Python ODBC API"
DESCRIPTION = "pyodbc is a Python 3.x module that allows you to use ODBC \
to connect to almost any database. \
 \
It implements the Python Database API Specification v2.0, but \
additional features have been added to simplify database programming \
even more."
LICENSE = "MIT"

PV = "5.3.0"

RPM_NAME = "python314-pyodbc-5.3.0-1.4.aarch64.rpm"
RPM_HASH = "b5d87067465eb6f5dd14f4ad9c463b9fce25cf4dad2244052a841b36243c9b180e74fa643fe44028ba142030cbaad4985602a2f5ebc1b24b960945d06695df91"

RPROVIDES:${PN} += "python3.14dist-pyodbc \
python314-pyodbc \
python3dist-pyodbc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libodbc.so.2 \
libstdc++.so.6 \
python-abi"

inherit rpm
