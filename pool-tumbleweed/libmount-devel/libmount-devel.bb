SUMMARY = "Development files for libmount"
DESCRIPTION = "Files to develop applications using the libmount library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.42.2"

RPM_NAME = "libmount-devel-2.42.2-2.1.aarch64.rpm"
RPM_HASH = "4f8fca922f0eadf6b9850696bbd844d4a22d781120ee4e844eef3cfa051d2fab77ef6c8e442e8b2b0ee024c0f16ae054db141ef39d93bf581eaf8ea8d15878a0"

RPROVIDES:${PN} += "libmount-devel \
pkgconfig-mount"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libblkid-devel \
libeconf-devel \
libmount1 \
libselinux-devel \
pkgconfig-blkid \
pkgconfig-libselinux"

inherit rpm
