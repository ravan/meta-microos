SUMMARY = "Remote Desktop Viewer Client"
DESCRIPTION = "FreeRDP is a client-side implementation of the Remote Desktop Protocol (RDP) \
following the Microsoft Open Specifications. This package provides the \
wayland-based client application."
LICENSE = "Apache-2.0"

PV = "3.31.0"

RPM_NAME = "freerdp-wayland-3.31.0-1.1.aarch64.rpm"
RPM_HASH = "99480ac129a13cfd71527f791d7a47c4a34daac6f2b7751f73f7e2e810751fb0e050ca09db618a58f0d5a7f85da95df2db58b909d650ef97caeda9ee1ca8e143"

RPROVIDES:${PN} += "freerdp-wayland"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfreerdp-client3.so.3 \
libfreerdp3.so.3 \
libm.so.6 \
libuwac0.so.0 \
libwinpr3.so.3"

inherit rpm
