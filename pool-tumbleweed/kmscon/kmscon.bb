SUMMARY = "Linux KMS/DRM based virtual Console Emulator"
DESCRIPTION = "Kmscon is a simple terminal emulator based on linux kernel mode setting (KMS). \
It is an attempt to replace the in-kernel VT implementation with a userspace \
console."
LICENSE = "MIT"

PV = "10.0.3"

RPM_NAME = "kmscon-10.0.3-1.1.aarch64.rpm"
RPM_HASH = "c85b8be98c187c27e66aeebe63728cc1ffe54815712a938afccd83e840994ba567edf0f39ec6cf8583858a5c1769f9d4b59a054af95242a41b92a9e8b15b9bdb"

RPROVIDES:${PN} += "kmscon \
kmscon-service"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libdrm.so.2 \
libfontconfig.so.1 \
libfreetype.so.6 \
libseat.so.1 \
libtsm.so.4 \
libudev.so.1 \
libxkbcommon.so.0 \
libz.so.1"

inherit rpm
