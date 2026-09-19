SUMMARY = "Python Object-Document Mapper for working with MongoDB"
DESCRIPTION = "MongoEngine is an ORM-like layer on top of PyMongo. \
MongoEngine is a Python Object-Document Mapper for working with MongoDB \
built on top of PyMongo."
LICENSE = "MIT"

PV = "0.29.3"

RPM_NAME = "python314-mongoengine-0.29.3-1.3.noarch.rpm"
RPM_HASH = "a0e9aa3dc94877741af720f6fc7cb249a3c6c4e5ee99e0b6c67041e0e04cf2c37d89a7b9db55ff840335302c065983143f318c49c375a1df847e25b54a40042c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-mongoengine \
python314-mongoengine \
python3dist-mongoengine"

RDEPENDS:${PN} += "python-abi \
python314-blinker \
python314-pymongo"

inherit rpm
