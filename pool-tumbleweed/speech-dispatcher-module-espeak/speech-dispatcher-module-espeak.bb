SUMMARY = "ESpeak module for Speech Dispatcher"
DESCRIPTION = "The goal of Speech Dispatcher project is to provide a high-level device \
independent layer for speech synthesis through a simple, stable and \
well documented interface. \
 \
What is a very high level GUI library to graphics, Speech Dispatcher is \
to speech synthesis. The application neither needs to talk to the \
devices directly nor to handle concurrent access, sound output and other \
tricky aspects of the speech subsystem. \
 \
This package contains the espeak module."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.12.1"

RPM_NAME = "speech-dispatcher-module-espeak-0.12.1-1.6.aarch64.rpm"
RPM_HASH = "2faaaad85c303773e76fd60dca1c7f63db7fde3b92b70e8f5c080fb6b7dcc796fba4f8a79fa1d5f6d76a7447dd1b94d2916dee0646f68b1c9ac450563013d9e2"

RPROVIDES:${PN} += "config-speech-dispatcher-module-espeak \
speech-dispatcher-module-espeak"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdotconf.so.0 \
libespeak-ng.so.1 \
libglib-2.0.so.0 \
libltdl.so.7 \
libspeechd-module.so.0 \
speech-dispatcher"

inherit rpm
