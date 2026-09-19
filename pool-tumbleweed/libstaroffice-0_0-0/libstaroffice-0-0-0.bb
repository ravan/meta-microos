SUMMARY = "A library for import of StarOffice documents"
DESCRIPTION = "libstaroffice is a library for import of StarOffice documents."
LICENSE = "LGPL-2.1-or-later & MPL-2.0"

PV = "0.0.7"

RPM_NAME = "libstaroffice-0_0-0-0.0.7-3.20.aarch64.rpm"
RPM_HASH = "a9be74a52a624e9e8073b89d6029d224842fe36c575eb45ee9617e88ddfcf20d916cc4ed52657a5d086b7e4dc203e07515068062027f81f795aee2defce0084a"

RPROVIDES:${PN} += "libstaroffice-0-0-0 \
libstaroffice-0.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
librevenge-0.0.so.0 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
