SUMMARY = "A pytest plugin for managing processes across test runs"
DESCRIPTION = "This will provide a xprocess fixture which can be used to ensure that \
external processes on which your application depends are up and running \
during testing. You can also use it to start and pre-configure \
test-specific databases (i.e. Postgres, Couchdb)."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "python314-pytest-xprocess-1.0.2-3.5.noarch.rpm"
RPM_HASH = "f5a1442db50ac2a2ca97fe76bef7b58c0e6827c157df846a7ced8a9e57ebfbc4e58b67fd296e11045ad46f2ad6cbf46e36b46a669da1580405d9599c3fcd6696"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-xprocess \
python314-pytest-xprocess \
python3dist-pytest-xprocess"

RDEPENDS:${PN} += "python-abi \
python314-psutil \
python314-pytest"

inherit rpm
