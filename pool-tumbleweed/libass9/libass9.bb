SUMMARY = "Library for SSA/ASS-formatted subtitle rendering"
DESCRIPTION = "libass is a subtitle renderer for the ASS/SSA \
(Advanced Substation Alpha/Substation Alpha) subtitle \
format. It is mostly compatible with VSFilter."
LICENSE = "ISC"

PV = "0.17.5"

RPM_NAME = "libass9-0.17.5-1.3.aarch64.rpm"
RPM_HASH = "b2424fffe9de30f8fea6ce267dfe84d7f713f519cf2cee13bad91307fbf8f544659b54ef13c348365056afc8da142a40cee157f85c7d530b15d1fa38df716a67"

RPROVIDES:${PN} += "libass.so.9 \
libass9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfontconfig.so.1 \
libfreetype.so.6 \
libfribidi.so.0 \
libharfbuzz.so.0 \
libm.so.6 \
libunibreak.so.6"

inherit rpm
