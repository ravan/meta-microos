SUMMARY = "A printer application framework"
DESCRIPTION = "PAPPL is a framework/library for developing CUPS Printer \
Applications, which are the recommended replacement for printer \
drivers. \
 \
PAPPL supports JPEG, PNG, PWG Raster, Apple Raster, and 'raw' \
printing to printers connected via USB and network \
(AppSocket/JetDirect) connections."
LICENSE = "Apache-2.0"

PV = "1.4.12"

RPM_NAME = "libpappl1-1.4.12-1.1.aarch64.rpm"
RPM_HASH = "3fe984d66341cf3b21108bbed43a387f5a807e47cdd4aec9c701b241b14f1e933c757c7753497cc1473fe15417c33a955665042f80a018d9ed7ed4e9496c1e51"

RPROVIDES:${PN} += "libpappl.so.1 \
libpappl1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libc.so.6 \
libcrypto.so.3 \
libcups.so.2 \
libjpeg.so.8 \
libpam.so.0 \
libpng16.so.16 \
libusb-1.0.so.0"

inherit rpm
