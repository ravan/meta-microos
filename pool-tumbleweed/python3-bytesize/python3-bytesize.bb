SUMMARY = "Python 3 bindings for LibBytesize"
DESCRIPTION = "This package contains Python 3 bindings for LibBytesize making the use of \
the library from Python 3 easier and more convenient."
LICENSE = "LGPL-2.1-only"

PV = "2.12"

RPM_NAME = "python3-bytesize-2.12-1.6.aarch64.rpm"
RPM_HASH = "54a9aa4258a6daf857b61ef5e1ac4c7e4e1992098e70046a935e0814a1954d0da177fb0c802834e33edc2803acc0b11210bc03ca49f24ba3746cfd5924a813f1"

RPROVIDES:${PN} += "python3-bytesize"

RDEPENDS:${PN} += "libbytesize1 \
python-abi"

inherit rpm
