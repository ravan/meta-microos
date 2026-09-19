SUMMARY = "GNU Modula-2 compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Modula-2 language."
LICENSE = "BSL-1.0"

PV = "16.2.0+git9497"

RPM_NAME = "libm2min21-16.2.0+git9497-3.1.aarch64.rpm"
RPM_HASH = "1006d517c3d734d44e548ee58b7e7959deed9683d0a70e345620715a513e6a1696927d53d9520812bbb6833f29f835e9715282b8b1710b942809396df2c801e3"

RPROVIDES:${PN} += "libm2min.so.21 \
libm2min21"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
