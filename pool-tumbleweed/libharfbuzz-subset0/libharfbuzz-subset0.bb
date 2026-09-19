SUMMARY = "An OpenType text shaping engine"
DESCRIPTION = "HarfBuzz is an OpenType text shaping engine. \
This package contains the subset library"
LICENSE = "MIT"

PV = "14.4.0"

RPM_NAME = "libharfbuzz-subset0-14.4.0-1.1.aarch64.rpm"
RPM_HASH = "5f6a6649ab94b3b0b6974312561a62d86d15a2cb5719927232c80de99c41ada10275a018b77ac91531575f85d37204fbb5d4e19913f4c8c0189eaf97b1557586"

RPROVIDES:${PN} += "libharfbuzz-subset.so.0 \
libharfbuzz-subset0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libharfbuzz.so.0"

inherit rpm
