SUMMARY = "Fast and well tested serialization library"
DESCRIPTION = "Fast and well tested serialization library"
LICENSE = "Apache-2.0"

PV = "3.22"

RPM_NAME = "python313-mashumaro-3.22-2.1.noarch.rpm"
RPM_HASH = "f656bd267d2953dfb6cee281d41e5259338afa1fe59770691ae8f3a04dca1ac23b676ab088c631e9c92d91b88a4b15724ddc9924423c26d0698c36aa1f167334"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mashumaro \
python3.13dist-mashumaro \
python313-mashumaro \
python3dist-mashumaro"

RDEPENDS:${PN} += "python-abi \
python313-typing-extensions"

inherit rpm
