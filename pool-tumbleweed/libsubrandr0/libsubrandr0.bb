SUMMARY = "Library to render non-ASS subtitles"
DESCRIPTION = "Subtitle rendering library for rendering non-ASS subtitles"
LICENSE = "MPL-2.0"

PV = "1.4.0"

RPM_NAME = "libsubrandr0-1.4.0-1.3.aarch64.rpm"
RPM_HASH = "0d02697296464b3553f0b1f6f190f3412e67dbbc21e77c62e7a6f5202960506c84e599b1aa708e90c13736d9b704b3ded2540f49b1d7f1d7c400f03536552a00"

RPROVIDES:${PN} += "libsubrandr.so.0 \
libsubrandr0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgcc-s.so.1 \
libharfbuzz.so.0 \
libm.so.6"

inherit rpm
