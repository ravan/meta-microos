SUMMARY = "Simple Linux amplifier for jack"
DESCRIPTION = "guitarix is a simple mono amplifier to jack with one input and two \
outputs. Designed to get nice trash/metal/rock/guitar sounds. \
 \
Available are the controls for bass, treble, gain, balance, \
distortion, freeverb, impulse response (pre state), crybaby(wah), \
feedback/feedforward-filter and echo. A fixed resonator will use, \
when distortion is disabled."
LICENSE = "GPL-2.0-or-later"

PV = "0.47.0"

RPM_NAME = "guitarix-0.47.0-2.3.aarch64.rpm"
RPM_HASH = "a92aa586eebcb92151baf8eed9237aa474e3e5eb5277b1351c84825ac61b75c356819f4f8bfbb4fae5aa4f09579f5f1bcf6a57bdab989b5df2e8e75cd4ffc34b"

RPROVIDES:${PN} += "guitarix"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libatkmm-1.6.so.1 \
libavahi-common.so.3 \
libavahi-gobject.so.0 \
libbluetooth.so.3 \
libboost-iostreams.so.1.91.0 \
libc.so.6 \
libcairomm-1.0.so.1 \
libcurl.so.4 \
libfftw3f.so.3 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdkmm-3.0.so.1 \
libgio-2.0.so.0 \
libgiomm-2.4.so.1 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtkmm-3.0.so.1 \
libgxw.so.0 \
libgxwmm.so.0 \
libjack.so.0 \
liblilv-0.so.0 \
liblo.so.7 \
liblrdf.so.2 \
libm.so.6 \
libmvec.so.1 \
libpangomm-1.4.so.1 \
libsigc-2.0.so.0 \
libsndfile.so.1 \
libstdc++.so.6 \
libzita-convolver.so.4 \
meterbridge \
vorbis-tools"

inherit rpm
