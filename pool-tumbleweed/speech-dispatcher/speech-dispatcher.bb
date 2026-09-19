SUMMARY = "Device independent layer for speech synthesis"
DESCRIPTION = "The goal of Speech Dispatcher project is to provide a high-level device \
independent layer for speech synthesis through a simple, stable and \
well documented interface. \
 \
What is a very high level GUI library to graphics, Speech Dispatcher is \
to speech synthesis. The application neither needs to talk to the \
devices directly nor to handle concurrent access, sound output and other \
tricky aspects of the speech subsystem."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.12.1"

RPM_NAME = "speech-dispatcher-0.12.1-1.6.aarch64.rpm"
RPM_HASH = "94a56624d72caaed04d6c3cde0632e813d29521180825fb0e2f9386b1e7a57b389ff655470ed00fbb76c7ec8db5578f9e18db42684c9954d681982622a8825c3"

RPROVIDES:${PN} += "config-speech-dispatcher \
speech-dispatcher \
speechd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libao.so.4 \
libasound.so.2 \
libc.so.6 \
libdotconf.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libltdl.so.7 \
libpipewire-0.3.so.0 \
libpulse.so.0 \
libsndfile.so.1 \
libspeechd-module.so.0 \
libspeechd.so.2 \
libsystemd.so.0"

inherit rpm
