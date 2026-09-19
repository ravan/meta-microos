SUMMARY = "Utilities for v4l2 / DVB driver development and debugging"
DESCRIPTION = "Utilities for v4l2 / DVB driver authors for development and debugging."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later"

PV = "1.32.0"

RPM_NAME = "v4l-utils-devel-tools-1.32.0-2.4.aarch64.rpm"
RPM_HASH = "5fd59ee562470219bb726e29ff1f04884a796b404dfc8394f164b952e5204cfbf9120acef70f5e4d70c63ff62cd305ee2c084455e1150fb8dae77dd5e5df861b"

RPROVIDES:${PN} += "v4l-utils-devel-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libjson-c.so.5 \
libstdc++.so.6 \
libv4l \
libv4l2.so.0"

inherit rpm
