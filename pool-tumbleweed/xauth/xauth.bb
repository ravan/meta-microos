SUMMARY = "Utility to edit and display the X authorization information"
DESCRIPTION = "The xauth program is used to edit and display the authorization \
information used in connecting to the X server."
LICENSE = "MIT"

PV = "1.1.5"

RPM_NAME = "xauth-1.1.5-1.4.aarch64.rpm"
RPM_HASH = "63f49f246ba8ae64279c6f1a3d8c685ee12317d4247daa06a10e034c52d4edb1fa0f01faab01025904253e87fede2f595ebfba247ac1170ab697aa469478e299"

RPROVIDES:${PN} += "xauth \
xorg-x11-xauth"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXau.so.6 \
libXext.so.6 \
libXmuu.so.1 \
libc.so.6"

inherit rpm
