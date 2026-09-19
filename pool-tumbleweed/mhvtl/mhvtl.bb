SUMMARY = "Virtual Tape Library system"
DESCRIPTION = "A Virtual Tape & Library system. \
 \
This package is composed of a KMP (mhvtl), which is also a psuedo HBA."
LICENSE = "GPL-2.0-only"

PV = "1.72_release+13.928fc784016a"

RPM_NAME = "mhvtl-1.72_release+13.928fc784016a-1.40.aarch64.rpm"
RPM_HASH = "073afa51d6535c5150dbce323c54e31947e8f62c947133bb3d64753b8747266baa92a8049f85fbdce57f8a7875392bcfd86099822475e98c2f341b21c1b83487"

RPROVIDES:${PN} += "config-mhvtl \
firmware-mhvtl/mhvtl-kernel.tgz \
libvtlcart.so \
libvtlscsi.so \
mhvtl"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1 \
mhvtl-kmp \
module-init-tools \
sg3-utils"

inherit rpm
