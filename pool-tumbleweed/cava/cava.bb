SUMMARY = "Console-based Audio Visualizer for Alsa"
DESCRIPTION = "C.A.V.A. is a bar spectrum audio visualizer for the Linux terminal using ALSA, pulseaudio or fifo buffer for input."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "cava-1.0.0-1.2.aarch64.rpm"
RPM_HASH = "52feac5b0d81339e1a043a4180c1d050d1d64ac9f2294af8ddc4b2e4eb6007f9e1f86944e232f595ccac1dae340d1607bad04e9af93138060b67a86d24946b05"

RPROVIDES:${PN} += "cava"

RDEPENDS:${PN} += "kbd \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libSDL2-2.0.so.0 \
libasound.so.2 \
libc.so.6 \
libfftw3.so.3 \
libiniparser.so.4 \
libm.so.6 \
libncursesw.so.6 \
libpipewire-0.3.so.0 \
libpulse-simple.so.0 \
libpulse.so.0 \
libtinfo.so.6"

inherit rpm
