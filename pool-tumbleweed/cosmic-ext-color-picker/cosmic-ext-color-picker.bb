SUMMARY = "A Color Picker for COSMIC desktop"
DESCRIPTION = "A Color Picker for COSMIC desktop Desktop Environment."
LICENSE = "GPL-3.0-only"

PV = "1.1.0"

RPM_NAME = "cosmic-ext-color-picker-1.1.0-1.10.aarch64.rpm"
RPM_HASH = "bae1271041f2dedc5c5e265eb3ef157fdf1ad69f266968b4cf1f0aa49514971b9f4ee8ee2b8168463fc84176ff8e8d4ee2722b71928b3364ae8dbb57866256cf"

RPROVIDES:${PN} += "cosmic-ext-color-picker"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libxkbcommon.so.0"

inherit rpm
