SUMMARY = "Packet creation and parsing module for Python"
DESCRIPTION = "A packet creation / parsing module for Python, with definitions for \
the basic TCP/IP protocols."
LICENSE = "BSD-3-Clause"

PV = "1.9.8"

RPM_NAME = "python313-dpkt-1.9.8-2.5.noarch.rpm"
RPM_HASH = "064f93bd33dcb3b0a0b2e3c70cf5390936e6d45065e241c868354692978ef27d73aad5403b481de993139f325700df0ce303d35c834b1b63bc3ce140b8ada7f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dpkt \
python3.13dist-dpkt \
python313-dpkt \
python3dist-dpkt"

RDEPENDS:${PN} += "python-abi"

inherit rpm
