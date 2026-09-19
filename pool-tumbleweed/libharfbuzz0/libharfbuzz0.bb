SUMMARY = "An OpenType text shaping engine"
DESCRIPTION = "HarfBuzz is an OpenType text shaping engine."
LICENSE = "MIT"

PV = "14.4.0"

RPM_NAME = "libharfbuzz0-14.4.0-1.1.aarch64.rpm"
RPM_HASH = "566ba7d7d01029d207144951a829b704de0008c0d6768d8a7177a65e418e046a0a0327213bbd02f5ae5da707c16812d7369d8b4430314207e2e35df4337ca4d7"

RPROVIDES:${PN} += "libharfbuzz.so.0 \
libharfbuzz0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfreetype.so.6 \
libglib-2.0.so.0 \
libgraphite2.so.3 \
libm.so.6"

inherit rpm
