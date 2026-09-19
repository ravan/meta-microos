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

RPM_NAME = "python313-python-rtmidi-1.5.8-2.11.aarch64.rpm"
RPM_HASH = "79093c625581fa184ecf7999ae6f132e7413cdb3bb92ce52a4136b276806fcdabe5a16f8bf95a9adeb206cfd003fbfd0c863c249f7c6a47d029ad6e868d90207"

RPROVIDES:${PN} += "python3-python-rtmidi \
python3.13dist-python-rtmidi \
python313-python-rtmidi \
python3dist-python-rtmidi"

RDEPENDS:${PN} += "libasound.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libjack.so.0 \
libstdc++.so.6 \
python-abi"

inherit rpm
