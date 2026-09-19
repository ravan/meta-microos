SUMMARY = "Python driver for MongoDB"
DESCRIPTION = "The PyMongo distribution contains tools for interacting with MongoDB \
database from Python.  The bson package is an implementation of \
the BSON format for Python. The pymongo package is a native Python \
driver for MongoDB. The gridfs package is a gridfs \
implementation on top of pymongo."
LICENSE = "Apache-2.0"

PV = "4.17.0"

RPM_NAME = "python314-pymongo-4.17.0-1.1.aarch64.rpm"
RPM_HASH = "fff8879ac9fd4bbc4cf939f02b051f5a5d2731ef038fecc5b4a3fd637e357774ea73979958180cca5b7023e8f907c539cdd1ed8f2b77311eeccb5745c698be40"

RPROVIDES:${PN} += "python3.14dist-pymongo \
python314-pymongo \
python3dist-pymongo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python314-dnspython"

inherit rpm
