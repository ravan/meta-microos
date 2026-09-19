SUMMARY = "Development files for libavc1394, a library to the AV/C specification"
DESCRIPTION = "libavc1394 is a programming interface to the AV/C (Audio/Video \
Control) specification. Applications use the library to control the \
tape transport mechanism on DV camcorders. However, there are many \
devices and functions of devices that can be controlled via AV/C."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "0.5.4"

RPM_NAME = "libavc1394-devel-0.5.4-20.9.aarch64.rpm"
RPM_HASH = "1ae80594be8f40dc8f88f1a0a6eba8b3af69d2847b3da51616fb9b7e4e330061a2e42bccc7ecc84cd6dda7c17b867c439f821d9859a259f388dba463d21235e1"

RPROVIDES:${PN} += "libavc1394-devel \
pkgconfig-libavc1394"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libavc1394-0 \
pkgconfig-libraw1394"

inherit rpm
