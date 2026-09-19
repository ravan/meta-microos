SUMMARY = "Xserver SUID Wrapper"
DESCRIPTION = "This package contains an SUID wrapper for the Xserver."
LICENSE = "MIT"

PV = "21.1.24"

RPM_NAME = "xorg-x11-server-wrapper-21.1.24-1.2.aarch64.rpm"
RPM_HASH = "0de964755e7bef43414d547f60be61ba9baa1c3d71a746a6d76eba5c90c6af8ed18bd968a74c228dbee63d9118feb3f6336111f41ead5fb275a7173a1c98149d"

RPROVIDES:${PN} += "xorg-x11-server-wrapper"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
permissions \
xorg-x11-server"

inherit rpm
