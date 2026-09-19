SUMMARY = "GNU Radio examples"
DESCRIPTION = "GNU Radio is a collection of software that when combined with minimal \
hardware, allows the construction of radios where the actual waveforms \
transmitted and received are defined by software. What this means is \
that it turns the digital modulation schemes used in today's high \
performance wireless devices into software problems. \
 \
This package contains some examples of using GNU Radio."
LICENSE = "GPL-3.0-or-later"

PV = "3.10.12.0"

RPM_NAME = "gnuradio-examples-3.10.12.0-4.1.aarch64.rpm"
RPM_HASH = "831df7edc97be616777bc0be645a03c03e5bc77a053c994ceb17f2667c9e55d5d697ed97090afa510f5d7535d452e680147516eecdb58c41acebf1eec0a6faba"

RPROVIDES:${PN} += "gnuradio-examples"

RDEPENDS:${PN} += "/usr/bin/python3 \
gnuradio \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Widgets.so.5 \
libboost-program-options.so.1.91.0 \
libc.so.6 \
libfmt.so.12 \
libgcc-s.so.1 \
libgnuradio-analog.so.3.10.12 \
libgnuradio-audio.so.3.10.12 \
libgnuradio-blocks.so.3.10.12 \
libgnuradio-pmt.so.3.10.12 \
libgnuradio-qtgui.so.3.10.12 \
libgnuradio-runtime.so.3.10.12 \
libgnuradio-uhd.so.3.10.12 \
libm.so.6 \
libspdlog.so.1.17 \
libstdc++.so.6 \
libuhd.so.4.10.0"

inherit rpm
