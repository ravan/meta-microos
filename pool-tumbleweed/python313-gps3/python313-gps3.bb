SUMMARY = "Python interface for gpsd"
DESCRIPTION = "Python interface for gpsd."
LICENSE = "MIT"

PV = "0.33.3+git.20171101"

RPM_NAME = "python313-gps3-0.33.3+git.20171101-2.5.noarch.rpm"
RPM_HASH = "80102cbf11827129e0a0d401e899274e012f75de4e09b61a98e0047a9921cc1fec758e0f146ac1efe0ca39b2f94cd0d9af578f8fe7a6c7d3422d2234c45d4329"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gps3 \
python3.13dist-gps3 \
python313-gps3 \
python3dist-gps3"

RDEPENDS:${PN} += "python-abi"

inherit rpm
