SUMMARY = "Utilities from libuna for Unicode/ASCII Byte Stream conversions"
DESCRIPTION = "Several tools for converting Unicode and ASCII (byte stream) based text."
LICENSE = "LGPL-3.0-or-later"

PV = "20260602"

RPM_NAME = "libuna-tools-20260602-1.7.aarch64.rpm"
RPM_HASH = "6b24425975a7246ecdabbd6590fa9007c12a0f9b73215c1c65f068ff7df556d32219916cf2cf6aa73dc87d68b9c9ca2b0ad6f7420e408a93ed79032780580003"

RPROVIDES:${PN} += "libuna-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcdatetime.so.1 \
libcerror.so.1 \
libcfile.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libuna.so.1"

inherit rpm
