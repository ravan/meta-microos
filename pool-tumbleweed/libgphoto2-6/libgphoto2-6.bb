SUMMARY = "A Digital Camera Library"
DESCRIPTION = "gPhoto (GNU Photo) is a set of libraries for previewing, retrieving, \
and capturing images from a range of supported digital cameras to your \
local hard drive. It does not support digital cameras based on the USB \
storage protocol as those can be mounted by Linux directly. \
 \
As of this time, gPhoto supports around 1700 cameras, listed on: \
 \
https://gphoto.sourceforge.io/proj/libgphoto2/support.php \
 \
or by running \
 \
gphoto2 --list-cameras"
LICENSE = "LGPL-2.1-or-later"

PV = "2.5.34"

RPM_NAME = "libgphoto2-6-2.5.34-1.3.aarch64.rpm"
RPM_HASH = "dbb277bb30730b0364102269c413ea671db016a4c49ff9d9b8d9c446f126647df7b38609fcfb20e201c5b869e24f7f2f79888fcbb419d5bf707d933117c3782d"

RPROVIDES:${PN} += "libgphoto2-6 \
libgphoto2.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libexif.so.12 \
libgd.so.3 \
libgphoto2-port.so.12 \
libjpeg.so.8 \
libltdl.so.7 \
libm.so.6 \
libxml2.so.16 \
udev"

inherit rpm
