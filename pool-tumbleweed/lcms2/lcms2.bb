SUMMARY = "Little CMS Engine - A color management library and tools"
DESCRIPTION = "Littlecms is a small speed optimized color management engine. \
Little CMS intends to be a small-footprint color management engine \
with a special focus on accuracy and performance. It uses the International \
Color Consortium standard (ICC), which is the modern standard when \
regarding to color management. The ICC specification is widely used and is \
referred to in many International and other de-facto standards."
LICENSE = "MIT"

PV = "2.19.1"

RPM_NAME = "lcms2-2.19.1-1.3.aarch64.rpm"
RPM_HASH = "834d7e3e8a0ed34220e4b2e861d2f40a1f9cd9ff01e415cda068a0b155464723ae2f172cc4b358bec23456b2c194ccdee9e054adba51ebb3b76008fb6b5baa34"

RPROVIDES:${PN} += "lcms2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjpeg.so.8 \
liblcms2.so.2 \
libtiff.so.6"

inherit rpm
