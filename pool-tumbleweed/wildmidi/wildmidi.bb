SUMMARY = "Softsynth midi player"
DESCRIPTION = "WildMidi is a software midi player which has a core softsynth library that can \
be used with other applications."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.0"

RPM_NAME = "wildmidi-0.5.0-1.1.aarch64.rpm"
RPM_HASH = "c9bd9a630942bd6d9bd50d47b0a32066b86c76da521ace536ab10f6a509f4fa361a5d1ae1c0eb66146b8fa5b4cd60fbebbd2a2ec7c80a5bee7e789d2920fcc41"

RPROVIDES:${PN} += "wildmidi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libWildMidi.so.2 \
libWildMidi2 \
libasound.so.2 \
libc.so.6"

inherit rpm
