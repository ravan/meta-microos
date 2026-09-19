SUMMARY = "Utility to list the resource database of an X application"
DESCRIPTION = "The appres program prints the resources seen by an application (or \
subhierarchy of an application) with the specified class and instance \
names. It can be used to determine which resources a particular \
program will load."
LICENSE = "X11"

PV = "1.0.7"

RPM_NAME = "appres-1.0.7-1.9.aarch64.rpm"
RPM_HASH = "04902fdefcb30d98c7a193a55e627dd93d98407768a077abd2f0ffea24a1e3d9a395c9995d2895a57845a0a34e80a7777cfb8a5f0c396818b95dc871f168b9fb"

RPROVIDES:${PN} += "appres"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXt.so.6 \
libc.so.6"

inherit rpm
