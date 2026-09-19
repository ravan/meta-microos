SUMMARY = "Library for reading MAME's CHDv1 to v5 formats"
DESCRIPTION = "libchdr is a standalone library for reading MAME's CHDv1-v5 formats"
LICENSE = "BSD-3-Clause"

PV = "0.3.0"

RPM_NAME = "libchdr0-0.3.0-1.2.aarch64.rpm"
RPM_HASH = "d903eb08cd1c62088ed35881529609d714a4d61e41ba26bd029a823663526c82dbc23f2e05e566e3313a83650d702c9bea6f299810515fead43e495c4f0dae48"

RPROVIDES:${PN} += "libchdr.so.0 \
libchdr0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
