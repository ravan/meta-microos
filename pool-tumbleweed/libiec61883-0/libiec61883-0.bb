SUMMARY = "An isochronous streaming media library for IEEE 1394"
DESCRIPTION = "This library is an implementation of IEC 61883, part 1 (CIP, plug \
registers, and CMP), part 2 (DV-SD), part 4 (MPEG2-TS), and part 6 \
(AMDTP). Outside of IIDC, nearly all FireWire multimedia devices use \
IEC 61883 protocols. \
 \
The libiec61883 library provides a higher level API for streaming DV, \
MPEG-2 and audio over Linux IEEE 1394. This includes both reception and \
transmission. It uses the new 'rawiso' API of libraw1394, which \
transparently provides mmap-ed DMA for efficient data transfer. It also \
represents the third generation of I/O technology for Linux 1394 for \
these media types thereby removing the complexities of additional \
kernel modules, /dev nodes, and procfs. It also consolidates features \
for plug control registers and connection management that previously \
existed in experimental form in an unreleased version of libavc1394."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.0"

RPM_NAME = "libiec61883-0-1.2.0-9.5.aarch64.rpm"
RPM_HASH = "a16b492caa96ca375a974260c9356285813687a1b5acb6a09a481512abfcc8f8d67ac7c229d15306fbc6b3a2997d3393476921de2d2a621e00f01b4696ae868c"

RPROVIDES:${PN} += "libiec61883-0 \
libiec61883.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libraw1394.so.11"

inherit rpm
