SUMMARY = "A modular multi-system emulator system"
DESCRIPTION = "a2jmidid is a daemon for exposing legacy ALSA sequencer applications in JACK \
MIDI systems."
LICENSE = "GPL-2.0-or-later"

PV = "9"

RPM_NAME = "a2jmidid-9-2.19.aarch64.rpm"
RPM_HASH = "163be25bd5e696ccf0e5c688087a0dea9e34b112174b22171911f0541bc11f4de79c633fd5f3087f3e82fd0902fa54dc83e29fd32f2335174edf8f10dc4544e1"

RPROVIDES:${PN} += "a2jmidid"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libdbus-1.so.3 \
libjack.so.0"

inherit rpm
