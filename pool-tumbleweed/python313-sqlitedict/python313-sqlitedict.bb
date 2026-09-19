SUMMARY = "Persistent dict in Python backed by sqlite3"
DESCRIPTION = "A wrapper around Python's sqlite3 database with a Pythonic \
dict-like interface and support for multi-thread access."
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "python313-sqlitedict-2.1.0-1.10.noarch.rpm"
RPM_HASH = "ff74902ea4f46a623858a96f98578a9e11a5555215afb0d16deb2c038c020e73f765f8982ae94a0291d29e89a9ee5a536886ce80bcf2c616e3e1a5e5d9fce8a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sqlitedict \
python3.13dist-sqlitedict \
python313-sqlitedict \
python3dist-sqlitedict"

RDEPENDS:${PN} += "python-abi \
python313"

inherit rpm
