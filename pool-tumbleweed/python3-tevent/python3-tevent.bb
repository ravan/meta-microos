SUMMARY = "Python3 bindings for the Tevent library"
DESCRIPTION = "This package contains the python bindings for the Tevent library."
LICENSE = "LGPL-3.0-or-later"

PV = "0.17.1"

RPM_NAME = "python3-tevent-0.17.1-1.5.aarch64.rpm"
RPM_HASH = "2dbbf5828b650ccfdd8fd232bda6cec08a03241ac13950d48428de861030364605707ff5d3d4f7948feaf8c26071e2a7254970e75d41f5b4961c2ddad36cb51b"

RPROVIDES:${PN} += "python3-tevent"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtalloc.so.2 \
libtevent.so.0 \
libtevent0 \
python-abi"

inherit rpm
