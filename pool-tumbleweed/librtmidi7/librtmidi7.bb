SUMMARY = "C++ library for realtime MIDI input/ouput"
DESCRIPTION = "RtMidi is a set of C++ classes (RtMidiIn, RtMidiOut and API-specific \
classes) that provides a common API (Application Programming Interface) for \
realtime MIDI input/output across ALSA & JACK. \
 \
This package provides the shared library."
LICENSE = "MIT"

PV = "6.0.0"

RPM_NAME = "librtmidi7-6.0.0-2.11.aarch64.rpm"
RPM_HASH = "b20fce0c43576f814f90e6a07bf569117034a8abfd1048a6ea86a82d0b3ce75a7edd48462756a73307e0c71d9c9041b73146212e1487c6d3b5f50fe0a6d957d8"

RPROVIDES:${PN} += "librtmidi.so.7 \
librtmidi7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libjack.so.0 \
libstdc++.so.6"

inherit rpm
