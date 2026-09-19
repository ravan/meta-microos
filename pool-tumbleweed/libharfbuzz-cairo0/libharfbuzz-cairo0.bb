SUMMARY = "Cairo integration into the HarfBuzz OpenType text shaping engine"
DESCRIPTION = "HarfBuzz is an OpenType text shaping engine. \
This package contains the Cairo library."
LICENSE = "MIT"

PV = "14.4.0"

RPM_NAME = "libharfbuzz-cairo0-14.4.0-1.1.aarch64.rpm"
RPM_HASH = "ae4ffce596a8d5c1cf65a1d7dca6985b6c56d356c19c38b098fc0da1bf4a45b841bf7fada62381d02ebada4d892834d66f3c3260f145369f1aceaafc43ce2635"

RPROVIDES:${PN} += "libharfbuzz-cairo.so.0 \
libharfbuzz-cairo0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libharfbuzz.so.0 \
libm.so.6"

inherit rpm
