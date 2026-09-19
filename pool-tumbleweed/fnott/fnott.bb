SUMMARY = "Lightweight notification daemon for Wayland"
DESCRIPTION = "Lightweight notification daemon for Wayland."
LICENSE = "MIT"

PV = "1.8.0"

RPM_NAME = "fnott-1.8.0-1.7.aarch64.rpm"
RPM_HASH = "3230bd3f76d925b6eca9ff399bee3393584973d5f6cad6bf35b0f82dcb26944e9b4b3655fae4c17ddcbfca99d386d98c0d6d5ed693c78797035643bf18a6466a"

RPROVIDES:${PN} += "config-fnott \
fnott"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libfcft.so.4 \
libfontconfig.so.1 \
libm.so.6 \
libpixman-1.so.0 \
libpng16.so.16 \
libwayland-client.so.0 \
libwayland-cursor.so.0"

inherit rpm
