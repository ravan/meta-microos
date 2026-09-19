SUMMARY = "Official examples and tools from the JACK project"
DESCRIPTION = "JACK is system for handling real-time, low latency audio \
(and MIDI). It runs on GNU/Linux, Solaris, FreeBSD, OS X and \
Windows (and can be ported to other POSIX-conformant \
platforms). It can connect a number of different \
applications to an audio device, as well as allowing them to \
share audio between themselves. \
 \
This package contains the the official JACK example clients \
and tools."
LICENSE = "GPL-2.0"

PV = "1"

RPM_NAME = "jack-example-tools-1-1.17.aarch64.rpm"
RPM_HASH = "091a3eac6c7275abb57126e4592aeebbbb5470dd7c333ac27d96b3e13edd3469be99066446a83ab47208d8018167dde20765c673709afe61ac3fa08bd8fe6c35"

RPROVIDES:${PN} += "jack-/usr/bin/jack-connect \
jack-example-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libjack.so.0 \
libjacknet.so.0 \
libjackserver.so.0 \
libm.so.6 \
libopus.so.0 \
libreadline.so.8 \
libsamplerate.so.0 \
libsndfile.so.1 \
libstdc++.so.6"

inherit rpm
