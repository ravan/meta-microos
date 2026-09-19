SUMMARY = "Development for libacm, an audio decoder library"
DESCRIPTION = "Decoder library for InterPlay ACM audio files. \
This subpackage contains the header files for libacm."
LICENSE = "MIT"

PV = "1.5"

RPM_NAME = "libacm-devel-1.5-1.1.aarch64.rpm"
RPM_HASH = "95473c4cc221ab36083173c4c343a485b441cfd12a9d51c013900805a90be738d2f5ba5ee551a8b19f8512f91a47345661b23d96bd5ef4e9abcddb88a95ccac7"

RPROVIDES:${PN} += "libacm-devel \
pkgconfig-libacm"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libacm.so.1 \
libacm1 \
libao.so.4 \
libc.so.6"

inherit rpm
