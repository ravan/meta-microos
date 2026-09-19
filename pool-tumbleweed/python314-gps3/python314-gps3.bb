SUMMARY = "Python interface for gpsd"
DESCRIPTION = "Python interface for gpsd."
LICENSE = "MIT"

PV = "0.33.3+git.20171101"

RPM_NAME = "python314-gps3-0.33.3+git.20171101-2.5.noarch.rpm"
RPM_HASH = "1a27e3f7318f49ed84c34ac1c53607dd423d986b72737e1c4a8fa0d7d75155aa80b2ff84b9b78fe5938818e201d9ae5b58c28e7924f47539be47ace97a5d2db2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-gps3 \
python314-gps3 \
python3dist-gps3"

RDEPENDS:${PN} += "python-abi"

inherit rpm
