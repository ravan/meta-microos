SUMMARY = "Python interface for SEGGER J-Link"
DESCRIPTION = "Python interface for SEGGER J-Link."
LICENSE = "Apache-2.0"

PV = "2.0.1"

RPM_NAME = "python314-pylink-square-2.0.1-1.2.noarch.rpm"
RPM_HASH = "4fd8ab3d0cbf405aa5c55b2d653dbfbeeae4db3576f911c5c04bb0ddd14a93e2e982267bf8bb7836e2bbe1770295182d394c2236ab9fe46efca5e3e61c197a08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pylink-square \
python314-pylink-square \
python3dist-pylink-square"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-psutil \
python314-six \
update-alternatives"

inherit rpm
