SUMMARY = "GNU Modula-2 compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Modula-2 language."
LICENSE = "BSL-1.0"

PV = "15.3.0+git11272"

RPM_NAME = "libm2pim20-15.3.0+git11272-1.4.aarch64.rpm"
RPM_HASH = "962450d568544c8b088dfc3738ef1763ac6b8443f4fdc303c46d762737b10a31b0e5fc605b689f3dc7f5a70a24af954bf2237ed375deaa19b6fd043cd60b9872"

RPROVIDES:${PN} += "libm2pim.so.20 \
libm2pim20"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libm.so.6"

inherit rpm
