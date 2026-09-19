SUMMARY = "Real-time MIDI input/output audio tools"
DESCRIPTION = "PortMidi -- real-time MIDI input/output. \
This package contains some command-line applications to test, configure and use \
midi devices through PortMidi."
LICENSE = "MIT"

PV = "2.0.4"

RPM_NAME = "portmidi-2.0.4-3.7.aarch64.rpm"
RPM_HASH = "59c87e45366c3ab35d4bca1b504971c60baa31b095700871d95f541273f7edee998447e643fc5e4a994633a270f90538df7b406b76dfdf89eb1fc493d00e07ed"

RPROVIDES:${PN} += "portmidi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libportmidi.so.2 \
libportmidi2"

inherit rpm
