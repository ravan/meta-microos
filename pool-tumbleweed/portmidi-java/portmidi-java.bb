SUMMARY = "Java native bindings for portmidi"
DESCRIPTION = "PortMidi -- real-time MIDI input/output. \
This package contains bindings to use portmidi from Java."
LICENSE = "MIT"

PV = "2.0.4"

RPM_NAME = "portmidi-java-2.0.4-3.7.aarch64.rpm"
RPM_HASH = "e7d16f19389ba5dcfb30787926c8faef15b1848391ca2343132553ed47a9ffdc922501b9d308f1c8ec79fe31f1380034e9e45adf2bcf39e212cb4cef618131ab"

RPROVIDES:${PN} += "libpmjni.so.2 \
portmidi-java"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/bash \
java \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libportmidi2"

inherit rpm
