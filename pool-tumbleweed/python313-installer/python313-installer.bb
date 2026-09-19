SUMMARY = "A library for installing Python wheels"
DESCRIPTION = "A library for installing Python wheels."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python313-installer-1.0.1-1.2.noarch.rpm"
RPM_HASH = "174d0594cba0640b128b5bbdb161805aa3f09f9c4d82d08c04e1989b3690310bbd0c33c4d97fd4ee66ee3f06f5d309fc9804cf136d7d0edf3d88b52c2d2f40d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-installer \
python3.13dist-installer \
python313-installer \
python3dist-installer"

RDEPENDS:${PN} += "python-abi"

inherit rpm
