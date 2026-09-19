SUMMARY = "GNU D compiler runtime library"
DESCRIPTION = "Runtime library for the GNU D language."
LICENSE = "BSL-1.0"

PV = "13.5.0+git10516"

RPM_NAME = "libgphobos4-13.5.0+git10516-1.1.aarch64.rpm"
RPM_HASH = "954fa33fb338d35e7cb913492ecccb85aa847a68cd35e8a9f5cd88309792f0a242dfe66753d5ba5db1bbc40df1f12813eab5d54c5325a379e87fd1b8672ef2d0"

RPROVIDES:${PN} += "libgphobos.so.4 \
libgphobos4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
