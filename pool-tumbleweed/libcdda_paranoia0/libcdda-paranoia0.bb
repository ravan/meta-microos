SUMMARY = "Library for Extracting, Verifying, and Fixing Audio Tracks from CDs"
DESCRIPTION = "This CDDA reader distribution ('cdparanoia') reads audio from the \
CD-ROM directly as data and writes the data to a file or pipe as .wav, \
.aifc, or raw 16-bit linear PCM."
LICENSE = "LGPL-2.1-or-later"

PV = "3.10.2"

RPM_NAME = "libcdda_paranoia0-3.10.2-30.8.aarch64.rpm"
RPM_HASH = "21e4a662af94ebe1d5a1aed57af367531f8a13c2e2b448c9e2fe4e2f9052bed8d1780240dfbd291cf1e3904b73f7b8e9479142f033bf1424d67f1c824c96d328"

RPROVIDES:${PN} += "libcdda-paranoia.so.0 \
libcdda-paranoia0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcdda-interface.so.0"

inherit rpm
