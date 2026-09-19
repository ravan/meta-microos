SUMMARY = "Digital Speech Decoder (DSD) rewritten as a C++ library"
DESCRIPTION = "DSDcc is a complete rewrite of the original DSD (Digital Speech Decoder) \
project. It decodes the DMR, dPMR, D-Star and Yaesu System Fusion (YSF) \
standards. \
 \
This subpackage contains the shared library libdsdcc."
LICENSE = "GPL-3.0-or-later"

PV = "1.9.6"

RPM_NAME = "libdsdcc1-1.9.6-1.1.aarch64.rpm"
RPM_HASH = "9a709b537817465680b642d2d8dcf07c52501895ec840995e3500df3fb6a9ea72d1f32720ebbfe445ffeb4fecfe6feb8c15f291cd859ec6b90b126ac402e260a"

RPROVIDES:${PN} += "libdsdcc.so.1 \
libdsdcc1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
