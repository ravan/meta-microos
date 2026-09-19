SUMMARY = "Python Object-Document Mapper for working with MongoDB"
DESCRIPTION = "MongoEngine is an ORM-like layer on top of PyMongo. \
MongoEngine is a Python Object-Document Mapper for working with MongoDB \
built on top of PyMongo."
LICENSE = "MIT"

PV = "0.29.3"

RPM_NAME = "python313-mongoengine-0.29.3-1.3.noarch.rpm"
RPM_HASH = "0fd9379826e7d1ffde87e4614ae19b917b5d312a8832a215d24b0a77165831923bd1443c6f76f15635221643f6eb4d680d365fc66fc27e049487016109180a7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mongoengine \
python3.13dist-mongoengine \
python313-mongoengine \
python3dist-mongoengine"

RDEPENDS:${PN} += "python-abi \
python313-blinker \
python313-pymongo"

inherit rpm
