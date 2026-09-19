SUMMARY = "Python binding for the RtMidi C++ library"
DESCRIPTION = "RtMidi is a set of C++ classes which provides an API for realtime \
MIDI I/O across Linux (ALSA & JACK), macOS (CoreMIDI & JACK), \
and Windows (MultiMedia System) operating systems. \
 \
python-rtmidi is a Python binding for RtMidi implemented using \
Cython and provides a thin wrapper around the RtMidi C++ interface. \
The API is basically the same as the C++ one but with the naming \
scheme of classes, methods and parameters adapted to the Python \
PEP-8 conventions and requirements of the Python package naming \
structure."
LICENSE = "MIT"

PV = "1.5.8"

RPM_NAME = "python314-python-rtmidi-1.5.8-2.11.aarch64.rpm"
RPM_HASH = "dd99d712722195638c26345d11fcb97a96bedceb74b7a9fc4921825e8d19cf92cd6f00d3f673bd724f2da7373253e3f0757e4c03c4fb2fbffb5d30b3eb0b06c1"

RPROVIDES:${PN} += "python3.14dist-python-rtmidi \
python314-python-rtmidi \
python3dist-python-rtmidi"

RDEPENDS:${PN} += "libasound.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libjack.so.0 \
libstdc++.so.6 \
python-abi"

inherit rpm
