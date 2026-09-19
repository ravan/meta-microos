SUMMARY = "Python ODBC API"
DESCRIPTION = "pyodbc is a Python 3.x module that allows you to use ODBC \
to connect to almost any database. \
 \
It implements the Python Database API Specification v2.0, but \
additional features have been added to simplify database programming \
even more."
LICENSE = "MIT"

PV = "5.3.0"

RPM_NAME = "python313-pyodbc-5.3.0-1.4.aarch64.rpm"
RPM_HASH = "840e57ee27244a44707f50a8513b854495097b8560b12bc2a9f0ea8ba15e6220441467e08ae6d763cd9ab13d02f16ad3fb5804cf7a6ed95c22c3d42ed23afb3d"

RPROVIDES:${PN} += "python3-pyodbc \
python3.13dist-pyodbc \
python313-pyodbc \
python3dist-pyodbc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libodbc.so.2 \
libstdc++.so.6 \
python-abi"

inherit rpm
