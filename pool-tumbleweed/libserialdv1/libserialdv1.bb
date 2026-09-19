SUMMARY = "Library for audio de-/encoding with ABME3000 based devices"
DESCRIPTION = "A library that provides an interface for audio encoding and decoding with \
AMBE3000 based devices in packet mode over a serial link."
LICENSE = "GPL-3.0-only"

PV = "1.1.5"

RPM_NAME = "libserialdv1-1.1.5-1.6.aarch64.rpm"
RPM_HASH = "1b5451fb1ef0ae01d7c94a872554c7cbf33b1cdc472a331b4d27f47bfa78567b5d740b2e1a379ace0b8c285378d78b229d39cd5fc4fb652cf7e05896c05cb908"

RPROVIDES:${PN} += "libserialdv.so.1 \
libserialdv1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
