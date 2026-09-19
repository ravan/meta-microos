SUMMARY = "VBI Decoding Library"
DESCRIPTION = "VBI stands for Vertical Blanking Interval, a gap between the image data \
transmitted in an analog video signal. This gap is used to transmit AM \
modulated data for various data services like Teletext and Closed \
Caption. \
 \
The zvbi library provides routines to read from raw VBI sampling \
devices, to demodulate raw to sliced VBI data, and to interpret the \
data of several popular services."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.2.45"

RPM_NAME = "libzvbi0-0.2.45-1.1.aarch64.rpm"
RPM_HASH = "8673798bfd96dd1e123c5edeaca89f032afecc5355e5dfabf77c31c3b5dc7ff3fd157cefa3ed7f6d860f81b6d72edf3efe2d6359184f25e5dc40f4b290c30581"

RPROVIDES:${PN} += "libzvbi.so.0 \
libzvbi0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libpng16.so.16"

inherit rpm
