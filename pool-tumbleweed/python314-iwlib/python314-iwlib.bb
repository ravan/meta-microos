SUMMARY = "Python module to interface with iwlib"
DESCRIPTION = "Python-iwlib is a package for interfacing with iwlib, providing an implementation to \
the wireless tools in Linux. \
 \
It provides scanning, setting the ESSID of a device, and getting the current \
configuration back from a device."
LICENSE = "GPL-2.0-only"

PV = "1.7.0"

RPM_NAME = "python314-iwlib-1.7.0-1.4.aarch64.rpm"
RPM_HASH = "5529443ec69b2e3b88acfc7a2bbbc06bf0e5baa4971ee4c11a2b7ec8090e1939cc4445e55aed215d5c272c185c8695632d085b75c3826a4d214cd48c41f15651"

RPROVIDES:${PN} += "python3.14dist-iwlib \
python314-iwlib \
python3dist-iwlib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libiw.so.30 \
python-abi \
python314-cffi"

inherit rpm
