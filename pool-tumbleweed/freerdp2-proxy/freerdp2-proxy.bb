SUMMARY = "Remote Desktop Security and Monitorig Proxy Server"
DESCRIPTION = "This package contains a proxy that allows to select specific features and \
channels allowed for all connections passing through. \
It allows monitoring of the running sessions."
LICENSE = "Apache-2.0"

PV = "2.11.7"

RPM_NAME = "freerdp2-proxy-2.11.7-8.4.aarch64.rpm"
RPM_HASH = "2546249036dd601cdc75421318174737e6c67628bf892bc497321961d1333a732185da67160b77a42a06339452114e712f499de907ce0993f390314334f4f208"

RPROVIDES:${PN} += "freerdp2-proxy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfreerdp-client2.so.2 \
libfreerdp-server2.so.2 \
libfreerdp2.so.2 \
librdpgfx-client.so \
libwinpr2.so.2"

inherit rpm
