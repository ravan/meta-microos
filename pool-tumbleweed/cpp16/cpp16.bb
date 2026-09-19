SUMMARY = "The GCC Preprocessor"
DESCRIPTION = "This Package contains just the preprocessor that is used by the X11 \
packages."
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0+git9497"

RPM_NAME = "cpp16-16.2.0+git9497-3.1.aarch64.rpm"
RPM_HASH = "2bebad0bed50d2a172195eefb9e43f9505de37bb8d6ce458209cda3382164f5125664f88c15d3a1efce8a6aa16a9a9efe3263e8cad254f2abd82df1986d3ffa4"

RPROVIDES:${PN} += "cpp16"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
