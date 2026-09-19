SUMMARY = "Remote Desktop Viewer Client"
DESCRIPTION = "FreeRDP is a client-side implementation of the Remote Desktop Protocol (RDP) \
following the Microsoft Open Specifications. This package provides the client \
application."
LICENSE = "Apache-2.0"

PV = "2.11.7"

RPM_NAME = "freerdp2-2.11.7-8.4.aarch64.rpm"
RPM_HASH = "09d955af4b1539064a572011bb15265d2a2d0b90a501ae9930153f3fc051780c6f4f1798ea25e70d302c5f95abeb9382a9865e4d948ed18a3517c413c757af50"

RPROVIDES:${PN} += "freerdp2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXcursor.so.1 \
libXext.so.6 \
libXfixes.so.3 \
libXi.so.6 \
libXinerama.so.1 \
libXrandr.so.2 \
libXrender.so.1 \
libc.so.6 \
libfreerdp-client2.so.2 \
libfreerdp2-2 \
libfreerdp2.so.2 \
libm.so.6 \
libwinpr2.so.2"

inherit rpm
