SUMMARY = "1394-based Digital Camera Control library"
DESCRIPTION = "This library provides functionality for controlling any camera that \
conforms to the 1394-Based Digital Camera Specification (which can be \
found at http://www.1394ta.org/Download/Technology/Specifications/Camera120.pdf). \
It utilizes the low-level functionality provided by libraw1394 to \
communicate with the camera."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2.7"

RPM_NAME = "libdc1394-26-2.2.7-2.9.aarch64.rpm"
RPM_HASH = "7f59ac781609d5e83effbae97c31de9eb9a76b6cf97db74bb572e3e0fb86223bc146aa200e7e21b44b02d509a90518b2cae8ce27689bfb8d0ae2d0b4a4bc5dc1"

RPROVIDES:${PN} += "libdc1394-26 \
libdc1394.so.26"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libraw1394.so.11 \
libusb-1.0.so.0"

inherit rpm
