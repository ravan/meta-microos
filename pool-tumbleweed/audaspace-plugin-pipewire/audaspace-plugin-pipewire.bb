SUMMARY = "Pipewire plugin for audaspace"
DESCRIPTION = "Audaspace (pronounced 'outer space') is a high-level audio library. \
This package contains the Pipewire plugin"
LICENSE = "Apache-2.0"

PV = "1.10.0"

RPM_NAME = "audaspace-plugin-pipewire-1.10.0-1.1.aarch64.rpm"
RPM_HASH = "379df66eea2631f0cbe8b68a64b915a0261d8fbc85a8add93762fcdf00b6d75ea84ce07a1bffd98d6f5d07dd8bff853ef390a667eff0aa05ee6b7f0be82e1d79"

RPROVIDES:${PN} += "audaspace-deviceplugin \
audaspace-plugin-pipewire \
libaudpipewire.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaudaspace.so.1.10 \
libc.so.6 \
libgcc-s.so.1 \
libpipewire-0.3.so.0 \
libstdc++.so.6"

inherit rpm
