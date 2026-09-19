SUMMARY = "Atomic Simulation Environment"
DESCRIPTION = "Atomic Simulation Environment"
LICENSE = "LGPL-2.1-or-later"

PV = "3.29.0"

RPM_NAME = "python313-ase-3.29.0-1.1.noarch.rpm"
RPM_HASH = "c66e659dbffbdfd44c22ccaf358aa6850f008bcafd501fbc250dad2bb1e1e8a938a2c5ed3d5ebeae1a078b92fda2b4a0ee0aa49d875a59027ab6975a3ba0acb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ase \
python3.13dist-ase \
python313-ase \
python3dist-ase"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-matplotlib \
python313-numpy \
python313-scipy \
python313-typing-extensions"

inherit rpm
