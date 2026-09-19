SUMMARY = "A Digital Camera Utility"
DESCRIPTION = "gPhoto (GNU Photo) is a command line tool for previewing, retrieving, \
and capturing images from a range of supported digital cameras to your \
local hard drive. It does not support digital cameras based on the USB \
storage protocol, because those can be mounted by Linux directly. Find \
the list of supported cameras at the following URL: \
 \
https://gphoto.sourceforge.io/proj/libgphoto2/support.php \
 \
or by running \
 \
gphoto2 --list-cameras"
LICENSE = "GPL-2.0-or-later"

PV = "2.5.32"

RPM_NAME = "gphoto-2.5.32-2.2.aarch64.rpm"
RPM_HASH = "0827005593eb4a6b70085bb5a875e42de47b3c63372f115b4bcde21605d00080f54af8fa73c0bf7085813aa9eb98a7d7d01fb89be174e2c4c34d6ed0f737d624"

RPROVIDES:${PN} += "gphoto"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcdk.so.6.3.4 \
libexif.so.12 \
libgphoto2-port.so.12 \
libgphoto2.so.6 \
libncurses.so.6 \
libpopt.so.0 \
libreadline.so.8"

inherit rpm
