SUMMARY = "An OpenType text shaping engine"
DESCRIPTION = "%{Summary}."
LICENSE = "MIT"

PV = "14.4.0"

RPM_NAME = "libharfbuzz-vector0-14.4.0-1.1.aarch64.rpm"
RPM_HASH = "cae5aaae98ab3a7a4e713208270516b0d1b61f67abc99d05a0f9cb46d0ef0d0115a2bd7892b587bb98065f531a5114e9262f797c1cab21b9d99393b8e4ab6b66"

RPROVIDES:${PN} += "libharfbuzz-vector.so.0 \
libharfbuzz-vector0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libharfbuzz.so.0 \
libm.so.6 \
libz.so.1"

inherit rpm
