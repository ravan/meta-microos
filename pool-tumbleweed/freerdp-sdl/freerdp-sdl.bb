SUMMARY = "Remote Desktop Viewer Client"
DESCRIPTION = "FreeRDP is a client-side implementation of the Remote Desktop Protocol (RDP) \
following the Microsoft Open Specifications. This package provides the \
sdl-based client application."
LICENSE = "Apache-2.0"

PV = "3.31.0"

RPM_NAME = "freerdp-sdl-3.31.0-1.1.aarch64.rpm"
RPM_HASH = "deb01cf66386fc3855e5de9c19337a8e51be580ad9f6163933a2c5a89728a360762ef675846ed406489a9defa43cd97e2fd444e6d8e773fa9b8c5749be82d123"

RPROVIDES:${PN} += "freerdp-sdl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL3-ttf.so.0 \
libSDL3.so.0 \
libc.so.6 \
libfreerdp-client3.so.3 \
libfreerdp3.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libwinpr3.so.3"

inherit rpm
