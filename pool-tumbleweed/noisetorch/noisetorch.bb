SUMMARY = "Real-time microphone noise suppression on Linux"
DESCRIPTION = "NoiseTorch is an easy to use open source application for Linux with PulseAudio. \
It creates a virtual microphone that suppresses noise, in any application. Use \
whichever conferencing or VOIP application you like and simply select the \
NoiseTorch Virtual Microphone as input to torch the sound of your mechanical \
keyboard, computer fans, trains and the likes."
LICENSE = "GPL-3.0-or-later"

PV = "0.12.2"

RPM_NAME = "noisetorch-0.12.2-5.1.aarch64.rpm"
RPM_HASH = "c0989cd18359bbaedfccc474730587cb02ef06d0fafc03e3b9fc3a28033bb142ccd8c909b09719d62469f01c24227e8052342a9b2ac2f430ada98fccade74361"

RPROVIDES:${PN} += "noisetorch"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
permissions"

inherit rpm
