SUMMARY = "Utilities jointly used by devpi-server and devpi-client"
DESCRIPTION = "Utilities jointly used by devpi-server and devpi-client."
LICENSE = "MIT"

PV = "4.1.1"

RPM_NAME = "python314-devpi-common-4.1.1-1.2.noarch.rpm"
RPM_HASH = "95c21a3f7fa0994ad44d4fa512d3371033afb58af033a5ed85f4d5ec2cf8729738b1eea0330ea028b3af56b329a34314ac432d15703cd222b8bef9a3f07e6ad3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-devpi-common \
python314-devpi-common \
python3dist-devpi-common"

RDEPENDS:${PN} += "python-abi \
python314-lazy \
python314-packaging-legacy \
python314-requests"

inherit rpm
