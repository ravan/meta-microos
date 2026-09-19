SUMMARY = "GNU Modula-2 compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Modula-2 language."
LICENSE = "BSL-1.0"

PV = "16.2.0+git9497"

RPM_NAME = "libm2iso21-16.2.0+git9497-3.1.aarch64.rpm"
RPM_HASH = "104e81946953293942ccae7dbd4ae07b729d517aa80623ffd863b82f2f284f1d0551cb4b396566554c5ebbfc0ef468174b5dfab6026a71a8d2f0a555943209ab"

RPROVIDES:${PN} += "libm2iso.so.21 \
libm2iso21"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libm.so.6"

inherit rpm
