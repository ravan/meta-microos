SUMMARY = "Development files for glusterfs"
DESCRIPTION = "GlusterFS is a clustered file-system capable of scaling to several \
petabytes. \
 \
This package provides development files such as headers and library \
links."
LICENSE = "GPL-2.0-only | LGPL-3.0-or-later"

PV = "11.1"

RPM_NAME = "glusterfs-devel-11.1-4.10.aarch64.rpm"
RPM_HASH = "caaa0289a0582fd84053f80e3abf22ec10bd304defb864c576498486780fe492d71f5279c878503e991e9fc7a51afe6f2556811bbdba5daa2cace651299784a5"

RPROVIDES:${PN} += "glusterfs-devel \
pkgconfig-glusterfs-api \
pkgconfig-libgfchangelog"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glusterfs \
libacl-devel \
libgfapi0 \
libgfchangelog0 \
libgfrpc0 \
libgfxdr0 \
libglusterfs0 \
pkgconfig-uuid"

inherit rpm
