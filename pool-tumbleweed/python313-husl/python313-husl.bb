SUMMARY = "A Python implementation of the 'Human-friendly HSL' (HSLuv) color model"
DESCRIPTION = "A Python implementation of HUSL (revision 3)."
LICENSE = "MIT"

PV = "4.0.3"

RPM_NAME = "python313-husl-4.0.3-4.5.noarch.rpm"
RPM_HASH = "96b5d06a31dcd3fc3d2c05103725f3eab619e2751d06649f67d3d79eb25d020c29c3fa17150b55221489d4372667f2c3a06db4f48c3ce82afc3ef0182b0aba4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-husl \
python3.13dist-husl \
python313-husl \
python3dist-husl"

RDEPENDS:${PN} += "python-abi"

inherit rpm
