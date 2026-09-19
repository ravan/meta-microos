SUMMARY = "Fast and well tested serialization library"
DESCRIPTION = "Fast and well tested serialization library"
LICENSE = "Apache-2.0"

PV = "3.15"

RPM_NAME = "python312-mashumaro-3.15-1.2.noarch.rpm"
RPM_HASH = "3c9c2198b5f7db929ae0347653f382a95ef9a299916141ed1a917202ffcc3df6d91214ca50b8b33ab705f5fec86ff2c62d2946e7b1c9e475f2aa6394632e0001"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.12dist-mashumaro \
python312-mashumaro \
python3dist-mashumaro"

RDEPENDS:${PN} += "python-abi \
python312-typing-extensions"

inherit rpm
