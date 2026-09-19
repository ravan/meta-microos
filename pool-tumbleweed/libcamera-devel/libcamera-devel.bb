SUMMARY = "Development for libcamera, a camera support library"
DESCRIPTION = "libcamera is an experimental camera user-space API. \
 \
This subpackage contains the header files."
LICENSE = "CC-BY-SA-4.0 & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.7.2"

RPM_NAME = "libcamera-devel-0.7.2-1.2.aarch64.rpm"
RPM_HASH = "eb7312e8fdcf01e45ca4de610bb55e8ca1f892ab78ce246728b9915be44a0d9d8cfa672a0ff61b05891a023bece3ea8bdc53ab1e03f9a10fce2d6439976de873"

RPROVIDES:${PN} += "libcamera-devel \
pkgconfig-libcamera \
pkgconfig-libcamera-base"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libcamera-base0-7 \
libcamera0-7 \
pkgconfig-libcamera-base"

inherit rpm
