SUMMARY = "Line clipping tool"
DESCRIPTION = "Line clipping: Cohen-Sutherland"
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python314-pylineclip-1.0.0-3.5.noarch.rpm"
RPM_HASH = "f9641e6268182f9cde1f7c68533d22332059727a542532ff5069b8256ae4c25af3ad5a62ed60b8a457c886b6b77542757e14cb544b436c8127784c0523528102"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pylineclip \
python314-pylineclip \
python3dist-pylineclip"

RDEPENDS:${PN} += "python-abi"

inherit rpm
