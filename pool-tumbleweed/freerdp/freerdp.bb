SUMMARY = "Remote Desktop Viewer Client"
DESCRIPTION = "FreeRDP is a client-side implementation of the Remote Desktop Protocol (RDP) \
following the Microsoft Open Specifications. This package provides the client \
application."
LICENSE = "Apache-2.0"

PV = "3.31.0"

RPM_NAME = "freerdp-3.31.0-1.1.aarch64.rpm"
RPM_HASH = "06909e38378dea91a45c75bc74903be400b506861d49eabd6524bb23f4ca966b2c395d9173c00736c9deb657b465326c791664dd70a7c3f8104ef48a6b3eab7b"

RPROVIDES:${PN} += "freerdp"

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
libfreerdp-client3.so.3 \
libfreerdp3-3 \
libfreerdp3.so.3 \
libm.so.6 \
libwinpr3.so.3"

inherit rpm
