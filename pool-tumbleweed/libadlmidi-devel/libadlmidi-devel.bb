SUMMARY = "Header files for libADLMIDI"
DESCRIPTION = "Development and header files for libADLMIDI."
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "1.6.2.1"

RPM_NAME = "libadlmidi-devel-1.6.2.1-1.1.aarch64.rpm"
RPM_HASH = "3ba40bf4fc330f8f0eb392e6945b2e916d55c9d17a303d1424f9be1f524d537e3300ccaf216f64428c651267c715e1642d1965473d69ae07d6bbbbe126d8b23d"

RPROVIDES:${PN} += "cmake-libADLMIDI \
libadlmidi-devel \
pkgconfig-libADLMIDI"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libADLMIDI1"

inherit rpm
