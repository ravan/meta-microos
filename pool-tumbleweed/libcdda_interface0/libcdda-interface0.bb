SUMMARY = "Library for Extracting, Verifying, and Fixing Audio Tracks from CDs"
DESCRIPTION = "This CDDA reader distribution ('cdparanoia') reads audio from the \
CD-ROM directly as data and writes the data to a file or pipe as .wav, \
.aifc, or raw 16-bit linear PCM."
LICENSE = "LGPL-2.1-or-later"

PV = "3.10.2"

RPM_NAME = "libcdda_interface0-3.10.2-30.8.aarch64.rpm"
RPM_HASH = "f8d2cb9ae80540eef9fe3e9d30a42d67c1480fc68ca148317673760517a2231d5ce856afb2a9c9b3384f10d83ab77c6901d97a756315c68d3e9f13228ff6ccbd"

RPROVIDES:${PN} += "libcdda-interface.so.0 \
libcdda-interface0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
