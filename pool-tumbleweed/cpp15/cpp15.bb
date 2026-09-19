SUMMARY = "The GCC Preprocessor"
DESCRIPTION = "This Package contains just the preprocessor that is used by the X11 \
packages."
LICENSE = "GPL-3.0-or-later"

PV = "15.3.0+git11272"

RPM_NAME = "cpp15-15.3.0+git11272-1.4.aarch64.rpm"
RPM_HASH = "1357145d59dbb3a817fa660d545a9acbab791d64af4702308d9c8bb3af0f5796697a47cfea7883690593a73b1c8f46c068ae33315c25096112d883d829ee5d6a"

RPROVIDES:${PN} += "cpp15"

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
