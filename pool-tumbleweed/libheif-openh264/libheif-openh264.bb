SUMMARY = "Plugin OpenH264 decoder in HEIF"
DESCRIPTION = "This plugin provides the OpenH264 decoder to libheif. Packaged separately \
so that the libraries it requires are not pulled in by default by libheif."
LICENSE = "LGPL-3.0-only & MIT"

PV = "1.23.4"

RPM_NAME = "libheif-openh264-1.23.4-1.1.aarch64.rpm"
RPM_HASH = "26560a8dc7b8d240bcbb00e4f3dc7da5a47f9db719f5eb68fca32e6c2f853d91aa09563118b68c64715fee874f0c65755af3d61545ff74fb3f222698105574d9"

RPROVIDES:${PN} += "libheif-openh264 \
libheif-openh264dec.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libheif.so.1 \
libheif1 \
libopenh264.so.8 \
libstdc++.so.6"

inherit rpm
