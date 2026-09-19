SUMMARY = "Small audio and MIDI framework"
DESCRIPTION = "It provides an lightweight audio & MIDI server and a fully documented \
user-space API to access either the server or directly the hardware in \
a uniform way. Sndio is designed to work for desktop applications, but \
pays special attention to synchronization mechanisms and reliability \
required by music applications. Reliability through simplicity are part \
of the project goals."
LICENSE = "ISC"

PV = "1.10.0"

RPM_NAME = "libsndio7-1.10.0-1.5.aarch64.rpm"
RPM_HASH = "0b63e4dbcabf6a170da4a9e7401aeaa03a2e586a860a39ffb10fbfea0dd9fe0044197313883e93a9c65fdd1c75db7fd5c6f74013904799b332b2f24cb2bf9440"

RPROVIDES:${PN} += "libsndio.so.7 \
libsndio7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libbsd.so.0 \
libc.so.6"

inherit rpm
