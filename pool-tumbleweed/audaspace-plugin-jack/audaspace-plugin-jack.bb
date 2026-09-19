SUMMARY = "JACK plugin for audaspace"
DESCRIPTION = "Audaspace (pronounced 'outer space') is a high-level audio library. \
This package contains the JACK plugin"
LICENSE = "Apache-2.0"

PV = "1.10.0"

RPM_NAME = "audaspace-plugin-jack-1.10.0-1.1.aarch64.rpm"
RPM_HASH = "578d29effebfa64f98542bf2758a027e03630ef87e53662ab0fab6ac90c3c9f068c3380f949b976279b1d987ee64fe17dae4f1876aeb0e0a39311379223a722d"

RPROVIDES:${PN} += "audaspace-deviceplugin \
audaspace-plugin-jack \
libaudjack.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaudaspace.so.1.10 \
libc.so.6 \
libgcc-s.so.1 \
libjack.so.0 \
libstdc++.so.6"

inherit rpm
