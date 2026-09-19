SUMMARY = "Remote Desktop Viewer client library"
DESCRIPTION = "FreeRDP is a client-side implementation of the Remote Desktop Protocol (RDP) \
following the Microsoft Open Specifications. This package provides the shared \
libraries used by the client."
LICENSE = "Apache-2.0"

PV = "3.31.0"

RPM_NAME = "libfreerdp3-3-3.31.0-1.1.aarch64.rpm"
RPM_HASH = "b966672d7f51b95d8afaa5e3cffcf633f96d6cf6f9e03bcafdd7c92b7fd060d5a18ab2917621a7c4640df17699e2fb191c70a16c99b966477e15c69c329cf6ba"

RPROVIDES:${PN} += "libfreerdp-client3.so.3 \
libfreerdp-server3.so.3 \
libfreerdp-shadow-subsystem3.so.3 \
libfreerdp-shadow3.so.3 \
libfreerdp3-3 \
libfreerdp3.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXdamage.so.1 \
libXext.so.6 \
libXfixes.so.3 \
libXinerama.so.1 \
libXtst.so.6 \
libasound.so.2 \
libavcodec.so.62 \
libavutil.so.60 \
libc.so.6 \
libcbor.so.0.14 \
libcrypto.so.3 \
libcups.so.2 \
libfido2.so.1 \
libfuse3.so.4 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libopenh264.so.8 \
libpulse.so.0 \
librdtk0.so.0 \
libssl.so.3 \
libsso-mib.so.0 \
libswresample.so.6 \
libswscale.so.9 \
libusb-1.0.so.0 \
libwinpr-tools3.so.3 \
libwinpr3.so.3 \
libxkbfile.so.1 \
libz.so.1"

inherit rpm
