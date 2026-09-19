SUMMARY = "Python driver for MongoDB"
DESCRIPTION = "The PyMongo distribution contains tools for interacting with MongoDB \
database from Python.  The bson package is an implementation of \
the BSON format for Python. The pymongo package is a native Python \
driver for MongoDB. The gridfs package is a gridfs \
implementation on top of pymongo."
LICENSE = "Apache-2.0"

PV = "4.17.0"

RPM_NAME = "python313-pymongo-4.17.0-1.1.aarch64.rpm"
RPM_HASH = "12ad378c9dcb325146a51d61ba4e741f7de98579c3c99700f96d596fb7cd74844fb6fcf231405a2c969a2535a258416fe48a9d874642aa8fd37563c3a0384b5b"

RPROVIDES:${PN} += "python3-pymongo \
python3.13dist-pymongo \
python313-pymongo \
python3dist-pymongo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python313-backports.zstd \
python313-dnspython"

inherit rpm
