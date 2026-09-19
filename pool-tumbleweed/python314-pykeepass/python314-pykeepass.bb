SUMMARY = "Low-level library to interact with keepass databases"
DESCRIPTION = "This library allows you to write entries to a KeePass database"
LICENSE = "GPL-3.0-only"

PV = "4.1.1.post1"

RPM_NAME = "python314-pykeepass-4.1.1.post1-1.5.noarch.rpm"
RPM_HASH = "cc084ce21cf80e20bba98414d3afea584b9ddf816877e5298828bf8856c52f93485fa9fb3f67fc5fddb655da468d26c150869f0f1f6c4526dc944bfb685b4e89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pykeepass \
python314-pykeepass \
python3dist-pykeepass"

RDEPENDS:${PN} += "python-abi \
python314-argon2-cffi \
python314-construct \
python314-lxml \
python314-pycryptodomex"

inherit rpm
