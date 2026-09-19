SUMMARY = "OpenAL plugin for audaspace"
DESCRIPTION = "Audaspace (pronounced 'outer space') is a high-level audio library. \
This package contains the OpenAL plugin"
LICENSE = "Apache-2.0"

PV = "1.10.0"

RPM_NAME = "audaspace-plugin-openal-1.10.0-1.1.aarch64.rpm"
RPM_HASH = "680c55d5298723e9464437bd60ab5c83d082046a88ffcbe370b85453a21af2eceda94d879a288ea9d0a1307cda7af1588267eff5961c47ed1acd9edb44b5d71c"

RPROVIDES:${PN} += "audaspace-deviceplugin \
audaspace-plugin-openal \
libaudopenal.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaudaspace.so.1.10 \
libc.so.6 \
libgcc-s.so.1 \
libopenal.so.1 \
libstdc++.so.6"

inherit rpm
