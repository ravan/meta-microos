SUMMARY = "GNU GCC Algol 68 compiler runtime library"
DESCRIPTION = "Runtime library for the GNU GCC Algol 68 language."
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0+git9497"

RPM_NAME = "libga68-2-16.2.0+git9497-3.1.aarch64.rpm"
RPM_HASH = "7a881eb6fc63782aa06e17796b39e6b03c1445e1a73a2074ddd6c7cfde5f6b3a502d0813be97e73dcec2ea4e68c83421b5f2f1f9c5a75386fc8079db4504d502"

RPROVIDES:${PN} += "libga68-2 \
libga68.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
