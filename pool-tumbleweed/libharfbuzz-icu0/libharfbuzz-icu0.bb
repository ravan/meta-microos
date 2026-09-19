SUMMARY = "ICU integration into the HarfBuzz OpenType text shaping engine"
DESCRIPTION = "HarfBuzz is an OpenType text shaping engine. \
This package contains the ICU library."
LICENSE = "MIT"

PV = "14.4.0"

RPM_NAME = "libharfbuzz-icu0-14.4.0-1.1.aarch64.rpm"
RPM_HASH = "6f5bc529c2ba0a56f5c37cc9ac4fe96e1db3698014c52624a499602ab2bba73c39ce6e0fa81b0a9d8b68f86be8b12610d905a4c24a19001f7f97fffb9e24cc8e"

RPROVIDES:${PN} += "libharfbuzz-icu.so.0 \
libharfbuzz-icu0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libharfbuzz.so.0 \
libicuuc.so.78"

inherit rpm
