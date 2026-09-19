SUMMARY = "Tools from the HarfBuzz text shaping software"
DESCRIPTION = "HarfBuzz is an OpenType text shaping engine. \
This package provides a set of tools for HarfBuzz."
LICENSE = "MIT"

PV = "14.4.0"

RPM_NAME = "harfbuzz-tools-14.4.0-1.1.aarch64.rpm"
RPM_HASH = "0476278e12221475808033e44ed5afa43e58f1aaafdc0f03827b7ecdcf259bce7e87910a49517e50aaae3a1662bdc336c4041851f075bda5832e456a04a23b4b"

RPROVIDES:${PN} += "harfbuzz-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libfreetype.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libharfbuzz-cairo.so.0 \
libharfbuzz-gobject.so.0 \
libharfbuzz-raster.so.0 \
libharfbuzz-subset.so.0 \
libharfbuzz-vector.so.0 \
libharfbuzz.so.0 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
