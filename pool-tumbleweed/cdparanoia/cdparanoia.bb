SUMMARY = "A Program for Extracting, Verifying, and Fixing Audio Tracks from CDs"
DESCRIPTION = "This CDDA reader distribution ('cdparanoia') reads audio from the \
CD-ROM directly as data and writes the data to a file or pipe as .wav, \
.aifc, or raw 16-bit linear PCM."
LICENSE = "GPL-2.0-or-later"

PV = "3.10.2"

RPM_NAME = "cdparanoia-3.10.2-30.8.aarch64.rpm"
RPM_HASH = "2b8ceb8b0e7f49128e90e08f5e09265fdc9f92baa705a3acc989a25aefbb3effa8c8bbf142a6c1309b4eebacf77133cecef7ff4d1dc9cb2c9b9431b6ada74937"

RPROVIDES:${PN} += "cdparano \
cdparanoia"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcdda-interface.so.0 \
libcdda-paranoia.so.0 \
libm.so.6"

inherit rpm
