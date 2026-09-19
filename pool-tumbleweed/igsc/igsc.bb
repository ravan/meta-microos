SUMMARY = "Intel Graphics System Controller Firmware Update Utility"
DESCRIPTION = "Intel Graphics System Controller (igsc) Firmware Update Utility and \
library."
LICENSE = "Apache-2.0"

PV = "1.3.1"

RPM_NAME = "igsc-1.3.1-1.1.aarch64.rpm"
RPM_HASH = "b7e396055f470b5d6cc1260a2e5075bce1fd766453400b14ba5471f994bcc916dc63570c758196cfff1962731619b1c45e67ccb3eb74ae68b883eac3d39ee204"

RPROVIDES:${PN} += "igsc \
libigsc.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmetee.so.6.0.2.0 \
libudev.so.1"

inherit rpm
