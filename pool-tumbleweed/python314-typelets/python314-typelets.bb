SUMMARY = "Type hints and utility objects for Python and Django projects"
DESCRIPTION = "A collection of type hints and small utility objects for use in Python \
and Django projects."
LICENSE = "MIT"

PV = "1.1"

RPM_NAME = "python314-typelets-1.1-1.2.noarch.rpm"
RPM_HASH = "a9494143137491269e46775015bfddce6213928fa73a37443aaab73e43428ef4f0ca69ef4515da0a2e7d496fbc102d4cf99f7d91c1fa0d9343d06b1153f1a2fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-typelets \
python314-typelets \
python3dist-typelets"

RDEPENDS:${PN} += "python-abi \
python314-typing-extensions"

inherit rpm
