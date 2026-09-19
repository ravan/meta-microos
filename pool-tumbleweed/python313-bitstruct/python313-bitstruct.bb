SUMMARY = "Interpret strings as packed binary data"
DESCRIPTION = "This module is intended to have a similar interface as the python struct \
module, but working on bits instead of primitive data types (char, int, ...)."
LICENSE = "MIT"

PV = "8.22.1"

RPM_NAME = "python313-bitstruct-8.22.1-1.6.aarch64.rpm"
RPM_HASH = "acab684d61679b712bade3751223740bd91282bab3a2d769ad46f2e0c4e2ff2c7c72c0990ac12e99bca75fccbf63134e44590d7dfe00e7f111b31df53c1d7425"

RPROVIDES:${PN} += "python3-bitstruct \
python3.13dist-bitstruct \
python313-bitstruct \
python3dist-bitstruct"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
