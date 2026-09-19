SUMMARY = "Port drivers for the libgphoto2 digital camera library"
DESCRIPTION = "gPhoto (GNU Photo) is a set of libraries for previewing, retrieving, \
and capturing images from a range of supported digital cameras to your \
local hard drive. It does not support digital cameras based on the USB \
storage protocol as those can be mounted by Linux directly. \
 \
This package contains the port drivers (e.g. the USB drivers, the PTP/IP \
driver)."
LICENSE = "LGPL-2.1-or-later"

PV = "2.5.34"

RPM_NAME = "libgphoto2_port12-2.5.34-1.3.aarch64.rpm"
RPM_HASH = "cb25f96f4b9f4c462ed498e33401435aa54dcf3a1775005c090e0cd749c0408ec1aa0f36a583a5ee3a2e3957fa0da57efed5e7952611a0b1fb9b37d6026e349d"

RPROVIDES:${PN} += "libgphoto2-port.so.12 \
libgphoto2-port12"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libltdl.so.7 \
libusb-1.0.so.0"

inherit rpm
