SUMMARY = "Receiver for Scream virtual devices"
DESCRIPTION = "Scream is a virtual device driver for Windows that provides a discrete sound device. \
 \
This package contains the Linux receiver."
LICENSE = "MS-PL"

PV = "4.0"

RPM_NAME = "scream-4.0-1.11.aarch64.rpm"
RPM_HASH = "be729a57208e8edac4e4fbfefc63f58b5a28630f3a0c8e1a19169aec1d71e7c4902f0d4c872675e804cb2cbba8d6d661ff183994c9340f3208dff0cd6ebbb5c4"

RPROVIDES:${PN} += "scream"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libpulse-simple.so.0 \
libpulse.so.0"

inherit rpm
