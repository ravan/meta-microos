SUMMARY = "Pathlib-compatible object wrapper for zip files"
DESCRIPTION = "A pathlib-compatible Zipfile object wrapper."
LICENSE = "MIT"

PV = "4.1.0"

RPM_NAME = "python313-zipp-4.1.0-1.2.noarch.rpm"
RPM_HASH = "db761c011367861a33f842d8d459d49d4273d79f660ee8028dc546dd349c4cf53f2402d615e9d816bcc8072f15d96a41f8e46b6acbcf703c6f23ec5206f341a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zipp \
python3.13dist-zipp \
python313-zipp \
python3dist-zipp"

RDEPENDS:${PN} += "python-abi"

inherit rpm
