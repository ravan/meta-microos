SUMMARY = "Development files for AVFS, an archive look-inside filesystem"
DESCRIPTION = "This package includes the development file for the package avfs. \
AVFS is a filesystem which enables all programs to look inside archived or \
compressed files, or access remote files without recompiling the programs \
or changing the kernel."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.2.0"

RPM_NAME = "avfs-devel-1.2.0-3.5.aarch64.rpm"
RPM_HASH = "d461ffec4e161375e3af95896ef089a88990b4a4f3eab1e1dbed7e358ee2fa2d678d4f5748154cb5d4472bf18a9bd3bc3b62989bcf058336dd314deae70f11c4"

RPROVIDES:${PN} += "avfs-devel \
pkgconfig-avfs"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libavfs1"

inherit rpm
