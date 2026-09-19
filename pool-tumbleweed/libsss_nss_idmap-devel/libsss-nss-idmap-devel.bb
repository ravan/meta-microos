SUMMARY = "Development files for the FreeIPA idmap library"
DESCRIPTION = "A utility library for FreeIPA to map Windows SIDs to Unix user/group IDs."
LICENSE = "LGPL-3.0-or-later"

PV = "2.13.1"

RPM_NAME = "libsss_nss_idmap-devel-2.13.1-2.1.aarch64.rpm"
RPM_HASH = "b17e839f71c7959240cd11cadcb849730436a600437e8dea09b4a6e0e154e3a4545f16917d7fb7613cd9f4fca0ce300885c9fb6d31f64e834f5e8cad3623f3a8"

RPROVIDES:${PN} += "libsss-nss-idmap-devel \
pkgconfig-sss-nss-idmap"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsss-nss-idmap0"

inherit rpm
