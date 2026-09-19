SUMMARY = "A Wayland-native application launcher, similar to rofi's drun mode"
DESCRIPTION = "A Wayland-native application launcher, similar to rofi's drun mode."
LICENSE = "MIT"

PV = "1.14.0"

RPM_NAME = "fuzzel-1.14.0-1.7.aarch64.rpm"
RPM_HASH = "af126dbfd35c3cdd1898d89db9f0180c452339582bc4efc7de654380463c3661e26b2cd9cff6d2b15d5f9e40ee46d60a6132aa4620dc84096d280b5697475d59"

RPROVIDES:${PN} += "config-fuzzel \
fuzzel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfcft.so.4 \
libfontconfig.so.1 \
libm.so.6 \
libpixman-1.so.0 \
libpng16.so.16 \
libresvg.so.0.48 \
libwayland-client.so.0 \
libwayland-cursor.so.0 \
libxkbcommon.so.0"

inherit rpm
