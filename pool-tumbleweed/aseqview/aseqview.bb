SUMMARY = "ALSA Sequencer Event Viewer"
DESCRIPTION = "ASeqView is an ALSA sequencer user client that works as an event viewer \
and event filter.  It visualizes received events, such as note on and \
off, controls, and pitch wheels, using bar graphs as seen in many \
sequencer applications."
LICENSE = "GPL-2.0-only"

PV = "0.3.1"

RPM_NAME = "aseqview-0.3.1-1.1.aarch64.rpm"
RPM_HASH = "79b3a71690107e6146cbeb1d01bcd2d085d6d2779530faf8c4b1a98ae192014b894775e8fc8c0a2b3391c95d37840e1e5f2972d968a697c8be97aa748a79f615"

RPROVIDES:${PN} += "aseqview"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libcairo.so.2 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1"

inherit rpm
