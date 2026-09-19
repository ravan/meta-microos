SUMMARY = "Real-time audio I/O library"
DESCRIPTION = "RtAudio is a set of C++ classes that provide a common API for \
realtime audio input/output across different operating systems. \
RtAudio allows simultaneous multi API support, supports dynamic \
connection of devices, provides extensive audio device parameter \
control, allows audio device capability probing, and has automatic \
internal conversion for data format, channel number compensation, \
(de)interleaving, and byte-swapping."
LICENSE = "MIT"

PV = "6.0.1"

RPM_NAME = "librtaudio7-6.0.1-1.11.aarch64.rpm"
RPM_HASH = "77d8b2ab77e3085c1d8e4da461891eb5cc7ede7211c6045d8adbb1165f67f41ceefe28f9bce957feddf217ff15094e60d5918284cf90ce1c51365f7380994834"

RPROVIDES:${PN} += "librtaudio.so.7 \
librtaudio7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libjack.so.0 \
libm.so.6 \
libpulse-simple.so.0 \
libpulse.so.0 \
libstdc++.so.6"

inherit rpm
