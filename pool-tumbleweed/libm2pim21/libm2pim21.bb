SUMMARY = "GNU Modula-2 compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Modula-2 language."
LICENSE = "BSL-1.0"

PV = "16.2.0+git9497"

RPM_NAME = "libm2pim21-16.2.0+git9497-3.1.aarch64.rpm"
RPM_HASH = "f0f804e2a79e27b756e3cd3f82f9a9114f7fe3de63a5262636b0b516b5e00cc0c72b9947098c0871d6ec6412ee99b90cc345b52c4aa4b967f3259f96a744c86d"

RPROVIDES:${PN} += "libm2pim.so.21 \
libm2pim21"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libm.so.6"

inherit rpm
