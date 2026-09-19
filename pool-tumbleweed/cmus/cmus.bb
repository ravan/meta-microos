SUMMARY = "Text-mode music player"
DESCRIPTION = "C* Music Player is a small and fast text mode (ncurses-based) music player \
for Unix-like operating systems."
LICENSE = "GPL-2.0-only"

PV = "2.12.0"

RPM_NAME = "cmus-2.12.0-3.6.aarch64.rpm"
RPM_HASH = "a6a8a9e1f6cbad1a50e56ad55c23a60d21b25c9cc9b8bf354dce5d65c8775f19ae4db0c5010de5e5ed3ef5001183a200b0ae91dd51557ea55b5b531941f5bc00"

RPROVIDES:${PN} += "cmus \
config-cmus"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libdiscid.so.0 \
libm.so.6 \
libncursesw.so.6 \
libsystemd.so.0 \
libtinfo.so.6"

inherit rpm
