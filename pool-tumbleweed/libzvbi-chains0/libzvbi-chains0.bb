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

RPM_NAME = "libzvbi-chains0-0.2.45-1.1.aarch64.rpm"
RPM_HASH = "6e222cbd05d8229353e9c77e53a4f88b1c49e68f0d00b19c5bbe1796645d7c37527f27466fbd78e006ecab50f8f122c886c26f28c419bcf4b3f9a8f9ff3bb856"

RPROVIDES:${PN} += "libzvbi-chains.so.0 \
libzvbi-chains0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
