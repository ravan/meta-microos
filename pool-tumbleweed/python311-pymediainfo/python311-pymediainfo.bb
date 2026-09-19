SUMMARY = "Python wrapper for the mediainfo library"
DESCRIPTION = "This module is a Python wrapper for the mediainfo library."
LICENSE = "MIT"

PV = "7.0.1"

RPM_NAME = "python311-pymediainfo-7.0.1-1.4.noarch.rpm"
RPM_HASH = "5106270fc38ebb378f8528594276176b09c88447e0fba4ae57c08e898a88ca069604c74d354a1c3e8c4b0e8ec520d7008d449b07c9caed8d7805b02287e484d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pymediainfo \
python311-pymediainfo \
python3dist-pymediainfo"

RDEPENDS:${PN} += "libmediainfo0 \
python-abi"

inherit rpm
