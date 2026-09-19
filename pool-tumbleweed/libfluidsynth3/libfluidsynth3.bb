SUMMARY = "Library for Fluidsynth"
DESCRIPTION = "This package contains the shared library for Fluidsynth."
LICENSE = "LGPL-2.1-or-later"

PV = "2.6.0"

RPM_NAME = "libfluidsynth3-2.6.0-2.1.aarch64.rpm"
RPM_HASH = "360aa483194641ff5ab4156e970c93492030d9114094ac932e6a9efade4be6cde8bd2945b664e127c75cbea6cb6658eb660518e0ff5a39ae67dc801ef78fc65b"

RPROVIDES:${PN} += "libfluidsynth.so.3 \
libfluidsynth3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSDL3.so.0 \
libasound.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libjack.so.0 \
libm.so.6 \
libpipewire-0.3.so.0 \
libpulse-simple.so.0 \
libpulse.so.0 \
libreadline.so.8 \
libsndfile.so.1 \
libstdc++.so.6"

inherit rpm
