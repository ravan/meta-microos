SUMMARY = "Libraries, includes and more to develop PhysicsFS applications"
DESCRIPTION = "Development package for libphysfs, a library to provide abstract access to \
various archives."
LICENSE = "(CPL-1.0 | LGPL-2.1-or-later) & Zlib"

PV = "3.2.0"

RPM_NAME = "libphysfs-devel-3.2.0-1.14.aarch64.rpm"
RPM_HASH = "94513f0ca3afe312b4fef8774fbff6feecd217767794d4eb607418ed47e59f8c3a37f76a9a73a1824738edf216b1c87f650ba5d8b7f0c0cb364f555b4fd95d3e"

RPROVIDES:${PN} += "cmake-PhysFS \
libphysfs-devel \
physfs-devel \
pkgconfig-physfs"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libphysfs1"

inherit rpm
