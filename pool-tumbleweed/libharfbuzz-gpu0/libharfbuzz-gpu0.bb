SUMMARY = "GPU wrapper around the HarfBuzz OpenType text shaping engine"
DESCRIPTION = "HarfBuzz is an OpenType text shaping engine. \
This package contains the gpu library."
LICENSE = "MIT"

PV = "14.4.0"

RPM_NAME = "libharfbuzz-gpu0-14.4.0-1.1.aarch64.rpm"
RPM_HASH = "3b8f3012435a5ae1b49c2cc9a8d39aeea313e6183edcaab9110b7fb62ea8b45b76f7cb161bd12d4e621a1ea4610ee7d390fe6439fefcb41b2073817059e439d0"

RPROVIDES:${PN} += "libharfbuzz-gpu.so.0 \
libharfbuzz-gpu0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libharfbuzz.so.0 \
libm.so.6"

inherit rpm
