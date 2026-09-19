SUMMARY = "Extra tools for VapourSynth"
DESCRIPTION = "This package contains the vspipe tool for interfacing with \
VapourSynth."
LICENSE = "LGPL-2.1-only"

PV = "79"

RPM_NAME = "vapoursynth-tools-79-1.1.aarch64.rpm"
RPM_HASH = "99b5c0dd307976a68aa90ae7cb5dc8a5ec4c432db19460f8489c4d872d2d2714ad1303138c28ae2b3169a617c86c6a03138318b25ad9fbf8bb4997374335c429"

RPROVIDES:${PN} += "vapoursynth-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libvsscript.so.0"

inherit rpm
