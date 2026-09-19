SUMMARY = "Guitarix - LV2 plugins"
DESCRIPTION = "guitarix is a simple mono amplifier to jack with one input and two \
outputs. Designed to get nice trash/metal/rock/guitar sounds. \
 \
Available are the controls for bass, treble, gain, balance, \
distortion, freeverb, impulse response (pre state), crybaby(wah), \
feedback/feedforward-filter and echo. A fixed resonator will use, \
when distortion is disabled. \
 \
This package contains the LV2 plugins."
LICENSE = "GPL-2.0-or-later"

PV = "0.47.0"

RPM_NAME = "lv2-guitarix-0.47.0-2.3.aarch64.rpm"
RPM_HASH = "842028741a6aed0557735c8f718c2e1441f7ed1b0d05e90d1776120fa4aa4540ff49fd5fd34037f35c4c53c5d0e24a2a48a980ebbed346c694155e153c02cd21"

RPROVIDES:${PN} += "lv2-guitarix"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libfftw3f.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libsigc-2.0.so.0 \
libsndfile.so.1 \
libstdc++.so.6 \
libzita-convolver.so.4"

inherit rpm
