SUMMARY = "Python bindings for the libmount library"
DESCRIPTION = "This package contains the Python bindings for util-linux libmount \
library."
LICENSE = "GPL-2.0-or-later"

PV = "2.42.2"

RPM_NAME = "python313-libmount-2.42.2-2.1.aarch64.rpm"
RPM_HASH = "73a2fdbf63c3009041d3fb1ce5859ba3ad8d7b4e86724940906c3de4ddd45f7fb8d70acfcead2b246893c66d299f837b4e3353a6fe400e72b15216ff16674c05"

RPROVIDES:${PN} += "python3-libmount \
python313-libmount"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmount.so.1 \
permissions \
python-abi"

inherit rpm
