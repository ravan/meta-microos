SUMMARY = "Library essential for the hydrogen drum machine software"
DESCRIPTION = "Hydrogen is a software synthesizer which can be used alone, emulating \
a drum machine based on patterns, or via an external MIDI \
keyboard/sequencer software. \
 \
This library is the core of hydrogen's operation."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.6"

RPM_NAME = "libhydrogen-core-1_2_6-1.2.6-1.6.aarch64.rpm"
RPM_HASH = "35b37572ea58f983bb6316c37e5d634d4386075985ee176530b4ebac33a31aeb5816f0cf8f613096e8f9d90b3534fa26d95a122d1fd34d9d03fa98f64b4a6abe"

RPROVIDES:${PN} += "libhydrogen-core-1-2-6 \
libhydrogen-core-1.2.6.so"

RDEPENDS:${PN} += "libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Xml.so.6 \
libarchive.so.13 \
libasound.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libjack.so.0 \
liblo.so.7 \
liblrdf.so.2 \
libm.so.6 \
libportaudio.so.2 \
libportmidi.so.2 \
libpulse.so.0 \
libsndfile.so.1 \
libstdc++.so.6"

inherit rpm
