SUMMARY = "A Wayland terminal emulator"
DESCRIPTION = "A Wayland terminal emulator."
LICENSE = "MIT"

PV = "1.28.0"

RPM_NAME = "foot-1.28.0-1.1.aarch64.rpm"
RPM_HASH = "08d46ff92ac1febd21d27d3a685fbdd000326268ea41eda8b4f8d980ee07f38f1a78dcf6e84bdc9a4c681d16304835a52e7f929d4a9c4d463186a44ad7ecc816"

RPROVIDES:${PN} += "foot"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfcft.so.4 \
libfontconfig.so.1 \
libm.so.6 \
libpixman-1.so.0 \
libutf8proc.so.3 \
libwayland-client.so.0 \
libwayland-cursor.so.0 \
libxkbcommon.so.0 \
terminfo"

inherit rpm
