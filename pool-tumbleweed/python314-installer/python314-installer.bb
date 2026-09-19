SUMMARY = "A library for installing Python wheels"
DESCRIPTION = "A library for installing Python wheels."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python314-installer-1.0.1-1.2.noarch.rpm"
RPM_HASH = "48b409b02c7f0c292833a977f5e29fcda831740bec1eaeed23da2eddb24d327062d8463806c8c94875a808167cd9061ca8ac08668875fbebee33c5fccc75781f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-installer \
python314-installer \
python3dist-installer"

RDEPENDS:${PN} += "python-abi"

inherit rpm
