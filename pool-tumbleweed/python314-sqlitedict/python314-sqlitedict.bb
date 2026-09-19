SUMMARY = "Persistent dict in Python backed by sqlite3"
DESCRIPTION = "A wrapper around Python's sqlite3 database with a Pythonic \
dict-like interface and support for multi-thread access."
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "python314-sqlitedict-2.1.0-1.10.noarch.rpm"
RPM_HASH = "3d1a40908af82afc5687b8514a65176c5f99084b0af254911812326f08511f339da7d8f77e13abe1ebcb0eb5f195e754f9eecb4ea746929cfe259ab8763d0678"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sqlitedict \
python314-sqlitedict \
python3dist-sqlitedict"

RDEPENDS:${PN} += "python-abi \
python314"

inherit rpm
