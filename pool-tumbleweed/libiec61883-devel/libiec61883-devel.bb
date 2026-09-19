SUMMARY = "Development files for libiec61883"
DESCRIPTION = "This library is an implementation of IEC 61883, part 1 (CIP, plug \
registers, and CMP), part 2 (DV-SD), part 4 (MPEG2-TS), and part 6 \
(AMDTP). Outside of IIDC, nearly all FireWire multimedia devices use \
IEC 61883 protocols. \
 \
The libiec61883 library provides a higher level API for streaming DV, \
MPEG-2 and audio over Linux IEEE 1394."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.0"

RPM_NAME = "libiec61883-devel-1.2.0-9.5.aarch64.rpm"
RPM_HASH = "bfcca86ea604e986927aed41afc48ac4fa82e8bd2ffd80736b7184734c33c2f2646f4ccdb4ab582d6ca16a9575ee35e1e79ae529191debc690337f0ef39e4841"

RPROVIDES:${PN} += "libiec61883-devel \
pkgconfig-libiec61883"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libiec61883-0 \
pkgconfig-libraw1394"

inherit rpm
