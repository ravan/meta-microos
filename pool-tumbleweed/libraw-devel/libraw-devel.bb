SUMMARY = "Development files for libraw"
DESCRIPTION = "LibRaw is a library for reading RAW files obtained from digital photo \
cameras (CRW/CR2, NEF, RAF, DNG, and others). \
 \
LibRaw is based on the source codes of the dcraw utility, where part of \
drawbacks have already been eliminated and part will be fixed in future."
LICENSE = "CDDL-1.0 | LGPL-2.1-only"

PV = "0.22.2"

RPM_NAME = "libraw-devel-0.22.2-1.1.aarch64.rpm"
RPM_HASH = "443d40613d187f122583d3d76c832f545be1d5f0c0f1e68d5dcb0b96cb88958040f25a0ad79523c21a265a0b1c0bad1db01685bef656a5903af57de3c0382443"

RPROVIDES:${PN} += "libraw-devel \
pkgconfig-libraw \
pkgconfig-libraw-r"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libraw25 \
pkgconfig-lcms2"

inherit rpm
