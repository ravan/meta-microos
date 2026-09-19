SUMMARY = "Python ORM for config files"
DESCRIPTION = "Python ORM for config files."
LICENSE = "LGPL-3.0-only"

PV = "0.1.83"

RPM_NAME = "python314-reconfigure-0.1.83-1.10.noarch.rpm"
RPM_HASH = "457d0c068863b24ab4cecef15512809bab9c8646b56b75ee3fc02e857626a76d22f08c0641b3afc230763a9e8ce01f7016c1849c6c9416944dcd6a5836374dc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-reconfigure \
python314-reconfigure \
python3dist-reconfigure"

RDEPENDS:${PN} += "python-abi \
python314-chardet"

inherit rpm
