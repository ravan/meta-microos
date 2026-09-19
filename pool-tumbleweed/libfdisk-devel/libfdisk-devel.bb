SUMMARY = "Development files for the filesystem detection library"
DESCRIPTION = "Files needed to develop applications using the library for filesystem \
detection."
LICENSE = "LGPL-2.1-or-later"

PV = "2.42.2"

RPM_NAME = "libfdisk-devel-2.42.2-2.1.aarch64.rpm"
RPM_HASH = "76a4247fadf353d393e89d0f30ec81140a2b4b77502c666dc5af0739797f4c3f5d37c49e71c76ca958bb6d3a8ff28fc3fd54001022c059d68627f124003202d5"

RPROVIDES:${PN} += "libfdisk-devel \
pkgconfig-fdisk"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libblkid-devel \
libfdisk1 \
libuuid-devel \
pkgconfig-blkid \
pkgconfig-uuid"

inherit rpm
