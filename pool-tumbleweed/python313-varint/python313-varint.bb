SUMMARY = "Library for encoding variable length integer data"
DESCRIPTION = "varints are a common encoding for variable length integer data, \
used in libraries such as sqlite, protobuf, v8, and more."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "python313-varint-1.0.2-2.5.noarch.rpm"
RPM_HASH = "2c890101557fbda9e8088cb81abb7807d81fe8e85e94ef2c18f87a8705c093279a2b9c93846b1a62e707f47f5f312539218eb723303f0e718b024cb5f7d44f1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-varint \
python3.13dist-varint \
python313-varint \
python3dist-varint"

RDEPENDS:${PN} += "python-abi"

inherit rpm
