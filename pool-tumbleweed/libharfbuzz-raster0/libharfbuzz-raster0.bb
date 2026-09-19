SUMMARY = "An OpenType text shaping engine"
DESCRIPTION = "%{Summary}."
LICENSE = "MIT"

PV = "14.4.0"

RPM_NAME = "libharfbuzz-raster0-14.4.0-1.1.aarch64.rpm"
RPM_HASH = "aec9aadd0136d744eae9976ee3ac65e4fabf7535af7316823f094bb990e810dba7d1bd9b7c47b04a8b09e7dded23d49e731dddf18b35ea7bd3cb562e257ed472"

RPROVIDES:${PN} += "libharfbuzz-raster.so.0 \
libharfbuzz-raster0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libharfbuzz.so.0 \
libm.so.6 \
libpng16.so.16"

inherit rpm
