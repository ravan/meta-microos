SUMMARY = "Tools for the gwenhywfar multi-platform helper library"
DESCRIPTION = "Gwenhywfar is a base library used to provide OS abstraction functions \
for Linux, FreeBSD, OpenBSD, NetBSD, and Windows. It also includes \
some often needed functions (for example, for handling and parsing of \
configuration files, reading and writing of XML files, and interprocess \
communication)."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.14.1"

RPM_NAME = "gwenhywfar-tools-5.14.1-1.3.aarch64.rpm"
RPM_HASH = "b5d1d820e899d52c3bd9713f34eaf6e5a79be4a691c49d2a29697b26920648507004c72672bd9285e2611075578b6786ccccc0ee7ae2382fcc5b429b94929c29"

RPROVIDES:${PN} += "gwenhywfar-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgwenhywfar.so.79 \
libgwenhywfar79 \
libssl.so.3"

inherit rpm
