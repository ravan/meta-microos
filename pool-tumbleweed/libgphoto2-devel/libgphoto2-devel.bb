SUMMARY = "Development headers for libgphoto2"
DESCRIPTION = "gPhoto (GNU Photo) is a set of libraries for previewing, retrieving, \
and capturing images from a range of supported digital cameras to your \
local hard drive. \
 \
These are its development libraries and headers."
LICENSE = "LGPL-2.1-or-later"

PV = "2.5.34"

RPM_NAME = "libgphoto2-devel-2.5.34-1.3.aarch64.rpm"
RPM_HASH = "6da3a993a7057ad15acf5f0e9c3f7c3ec32c4df98ca63683be53807a8206f4de3ab7a486469332da0944f43c2906f325dce7a1d0f3e8722f8ed4b25c96bdec12"

RPROVIDES:${PN} += "libgphoto2-devel \
pkgconfig-libgphoto2 \
pkgconfig-libgphoto2-port"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libexif-devel \
libgphoto2-6 \
libgphoto2-port12 \
libusb-1-0-devel \
pkgconfig-libexif \
pkgconfig-libgphoto2-port"

inherit rpm
