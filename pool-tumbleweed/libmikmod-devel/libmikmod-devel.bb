SUMMARY = "Development files for MikMod Sound Library"
DESCRIPTION = "This package contains files needed for compiling programs using \
libmikmod. \
 \
Libmikmod is a portable sound library, capable of playing samples as \
well as module files. It was originally written by Jean-Paul Mikkers \
(MikMak) for DOS. It supports OSS /dev/dsp, ALSA, and Esound and can \
also write wav files. Supported file formats include mod, stm, s3m, \
mtm, xm, and it."
LICENSE = "LGPL-2.1-or-later"

PV = "3.3.14"

RPM_NAME = "libmikmod-devel-3.3.14-1.1.aarch64.rpm"
RPM_HASH = "2a8067c3d7644d0e49f4cb041a3a1a193d570270390b086b752e9469904c55a252f1fef513e389d91d6dcfdb2bc587c6f6b805eeee58ec4ec4719053efe3167d"

RPROVIDES:${PN} += "libmikmod-devel \
pkgconfig-libmikmod"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
glibc-devel \
libmikmod3"

inherit rpm
