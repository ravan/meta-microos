SUMMARY = "A daemon that responds to brightness keys by changing the backlight level"
DESCRIPTION = "While there are tools that can be configured to adjust brightness illum adjusts \
brightness as soon as you install and enable it. \
 \
It uses exponential brightness stepping which happens to work well with many \
screens and is hard to achieve with a plain shell script bound to a key with \
more generic tool."
LICENSE = "AGPL-3.0-only"

PV = "0.5"

RPM_NAME = "illum-0.5-1.11.aarch64.rpm"
RPM_HASH = "25b18dc45ddee04d074138424639385577f3b418eea543b99ec95d3dda20879f70607c1141b7efa3bb1cfa768262f6959ccc1f40cdb5d215c8ca5b7d3670542b"

RPROVIDES:${PN} += "illum"

RDEPENDS:${PN} += "libasan.so.8 \
libc.so.6 \
libev.so.4 \
libevdev.so.2 \
libubsan.so.1 \
libudev.so.1"

inherit rpm
