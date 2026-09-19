SUMMARY = "A python wrapper for libpamtest"
DESCRIPTION = "If you plan to develop python tests for a PAM module, you can use this \
library, which simplifies testing of modules. This subpackage includes \
the header files for libpamtest"
LICENSE = "GPL-3.0-or-later"

PV = "1.1.8"

RPM_NAME = "python3-libpamtest-1.1.8-1.4.aarch64.rpm"
RPM_HASH = "48f2498bc35c7809580b56253453220ab82230dc4c7dc0d3c0c9b15c3aee70773c4bcf9feb92d87fb5234deebaf77f14118c8d9eeb1053041c8710c486276e11"

RPROVIDES:${PN} += "python3-libpamtest"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpamtest.so.0 \
libpamtest0 \
libpython3.13.so.1.0 \
pam-wrapper \
python-abi"

inherit rpm
