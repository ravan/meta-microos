SUMMARY = "Python wrapper for eduVPN shared library"
DESCRIPTION = "The python wrapper for the eduVPN common Go shared library."
LICENSE = "MIT"

PV = "5.0.3"

RPM_NAME = "python314-eduvpn-common-5.0.3-1.1.noarch.rpm"
RPM_HASH = "6f2d16e4756dfff7f7e7980192931ba61790788216d0f26e814040784983dba22f4593ff9cd9810326bc1417a463ae3381de0e636a15caf72448c3c9921e1d0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-eduvpn-common \
python314-eduvpn-common \
python3dist-eduvpn-common"

RDEPENDS:${PN} += "eduvpn-common \
python-abi"

inherit rpm
