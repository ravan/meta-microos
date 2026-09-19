SUMMARY = "Panorama Tools Back-End Library"
DESCRIPTION = "Development files for library for working with panoramas."
LICENSE = "GPL-2.0-or-later"

PV = "2.9.23"

RPM_NAME = "libpano-devel-2.9.23-1.4.aarch64.rpm"
RPM_HASH = "370e31830bd906386da019155fc94f199269f99ec2d604b4a4c77b49032331aef5335bc31d2207d0f5b22e0d12adec0bd1e1f82376f6b0ca356543add93b7cf5"

RPROVIDES:${PN} += "libpano-devel \
pkgconfig-libpano13"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libpano13-3"

inherit rpm
