SUMMARY = "GNU Modula-2 compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Modula-2 language."
LICENSE = "BSL-1.0"

PV = "15.3.0+git11272"

RPM_NAME = "libm2cor20-15.3.0+git11272-1.4.aarch64.rpm"
RPM_HASH = "ca0f7edb40d7c410f47bc7523e50b11e641476706faceb5f9df2be2c408dc71ca942635e44c7dedf9e4ff373c15cacdd9822bddd9127fb1ae9f5332bd5587fba"

RPROVIDES:${PN} += "libm2cor.so.20 \
libm2cor20"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
