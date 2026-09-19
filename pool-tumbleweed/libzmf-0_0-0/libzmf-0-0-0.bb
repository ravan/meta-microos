SUMMARY = "An ZMF generator library"
DESCRIPTION = "libzmf is a library for generating Zoner documents. It is directly \
pluggable into import filters based on librevenge."
LICENSE = "MPL-2.0"

PV = "0.0.2"

RPM_NAME = "libzmf-0_0-0-0.0.2-2.8.aarch64.rpm"
RPM_HASH = "9ef0064d43ba6146a466f020488a23ff2d9f82afcdff9538214eeb9e7d146d26c5768d2123c83d3abfad71bee954587fff3beb689f063f1a312ad6930c0272cd"

RPROVIDES:${PN} += "libzmf-0-0-0 \
libzmf-0.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libicuuc.so.78 \
libm.so.6 \
libpng16.so.16 \
librevenge-0.0.so.0 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
