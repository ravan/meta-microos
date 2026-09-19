SUMMARY = "Low-level library to interact with keepass databases"
DESCRIPTION = "This library allows you to write entries to a KeePass database"
LICENSE = "GPL-3.0-only"

PV = "4.1.1.post1"

RPM_NAME = "python313-pykeepass-4.1.1.post1-1.5.noarch.rpm"
RPM_HASH = "53ff2205ef0997a8e2566ca7889eefea612d864540fb3d5ec3daba15ab7f6f5ca74acc392863fce4b45f1445e8d1dba980e836e8264e0705c55cd4a2c3cde40e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pykeepass \
python3.13dist-pykeepass \
python313-pykeepass \
python3dist-pykeepass"

RDEPENDS:${PN} += "python-abi \
python313-argon2-cffi \
python313-construct \
python313-lxml \
python313-pycryptodomex"

inherit rpm
