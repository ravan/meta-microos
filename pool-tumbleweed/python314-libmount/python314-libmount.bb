SUMMARY = "Python bindings for the libmount library"
DESCRIPTION = "This package contains the Python bindings for util-linux libmount \
library."
LICENSE = "GPL-2.0-or-later"

PV = "2.42.2"

RPM_NAME = "python314-libmount-2.42.2-2.1.aarch64.rpm"
RPM_HASH = "90ae5fc884214af730359cc47c9fd5d7037ecedc76753e3222e7e88c544ba19ad75a2b1448e2fc0e4eaf65dd030d8c7e998f6fd0a32668b7d7c0c809191ee847"

RPROVIDES:${PN} += "python314-libmount"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmount.so.1 \
permissions \
python-abi"

inherit rpm
