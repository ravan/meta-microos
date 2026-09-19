SUMMARY = "API for talking to logic analyzer hardware"
DESCRIPTION = "libsigrok is a shared library written in C which provides the basic API \
for talking to logic analyzer hardware and reading/writing the acquired data \
into various input/output file formats."
LICENSE = "GPL-3.0-or-later"

PV = "0.6.0~git20241020.f06f788"

RPM_NAME = "libsigrok4-0.6.0~git20241020.f06f788-1.7.aarch64.rpm"
RPM_HASH = "579283a7afeb7fb18b395be09f6c12fa8d202192f8e82e6c8ca1367768196047c083ef6c12deef1d2b9064a43cda6d92be85c533b02ef5bd88fc6a889357fdd5"

RPROVIDES:${PN} += "libsigrok.so.4 \
libsigrok4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbluetooth.so.3 \
libc.so.6 \
libftdi1.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libhidapi-hidraw.so.0 \
libm.so.6 \
libserialport.so.0 \
libsigrok-data \
libtirpc.so.3 \
libusb-1.0.so.0 \
libz.so.1 \
libzip.so.5"

inherit rpm
