SUMMARY = "Git Object Database"
DESCRIPTION = "GitDB is a pure-Python git object database"
LICENSE = "BSD-3-Clause"

PV = "4.0.12"

RPM_NAME = "python313-gitdb-4.0.12-2.5.noarch.rpm"
RPM_HASH = "78cf0736701c95bc5367def75f13be8c242bbe26fb2fcd9f929dd236c390ecd8fc71e92eed53ad06c73655257836a667a96aeae624f86926f3be22c0385dc244"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gitdb \
python3-gitdb2 \
python3.13dist-gitdb \
python313-gitdb \
python313-gitdb2 \
python3dist-gitdb"

RDEPENDS:${PN} += "python-abi \
python313-smmap"

inherit rpm
