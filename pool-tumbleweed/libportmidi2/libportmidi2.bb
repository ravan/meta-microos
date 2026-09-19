SUMMARY = "Real-time MIDI input/output audio library"
DESCRIPTION = "PortMidi -- a library for real-time MIDI input/output audio. \
This package contains the shared library that is required at runtime for every \
application that uses PortMidi."
LICENSE = "MIT"

PV = "2.0.4"

RPM_NAME = "libportmidi2-2.0.4-3.7.aarch64.rpm"
RPM_HASH = "ab3a755aa41f34f84235dc8bcf259a7e8b8b6b2bea5d363ed3cbbc8d5085ca88dc099f6290ccd10408dbfe7f28641d34e930a6efea17447b76939bfecc0660fa"

RPROVIDES:${PN} += "libportmidi.so.2 \
libportmidi2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6"

inherit rpm
