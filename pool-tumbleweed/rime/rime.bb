SUMMARY = "Rime Input Method Engine"
DESCRIPTION = "Rime is an Traditional Chinese input method engine. \
Its idea comes from ancient Chinese brush and carving art. \
Mainly it's about to express your thinking with your keystrokes."
LICENSE = "BSD-3-Clause"

PV = "1.17.0"

RPM_NAME = "rime-1.17.0-1.1.aarch64.rpm"
RPM_HASH = "fbb9e9e956debc015746f0468aeecc6905f3d399145bbc5ab13355c13f441e54439d70c08558257dadace38c512636989d66fa3e29c53080e88f81caef6eab90"

RPROVIDES:${PN} += "rime"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglog.so.2 \
libm.so.6 \
librime.so.1 \
libstdc++.so.6"

inherit rpm
