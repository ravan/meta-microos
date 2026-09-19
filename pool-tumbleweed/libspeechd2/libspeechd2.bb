SUMMARY = "Device independent layer for speech synthesis - Client library"
DESCRIPTION = "The goal of Speech Dispatcher project is to provide a high-level device \
independent layer for speech synthesis through a simple, stable and \
well documented interface. \
 \
What is a very high level GUI library to graphics, Speech Dispatcher is \
to speech synthesis. The application neither needs to talk to the \
devices directly nor to handle concurrent access, sound output and other \
tricky aspects of the speech subsystem."
LICENSE = "LGPL-2.1-or-later"

PV = "0.12.1"

RPM_NAME = "libspeechd2-0.12.1-1.6.aarch64.rpm"
RPM_HASH = "1029a6a8739f252a5f380646e8d69103161bf181fd93ac186205a7cdb7d850c7c2300078b2afde49f140e40ffb45796672011f20718a783ddb503b390ec1b2e6"

RPROVIDES:${PN} += "libspeechd.so.2 \
libspeechd2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0"

inherit rpm
