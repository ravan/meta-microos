SUMMARY = "EDID decoder and conformance tester"
DESCRIPTION = "Decodes to text the binary EDID information from monitors.  EDID is binary data \
encoded in the monitor firmware, which the kernel exposes via \
/sys/devices/.../drm/card*/card*/edid. edid-decode renders this binary data \
into a human-readable text form."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.32.0"

RPM_NAME = "edid-decode-1.32.0-2.4.aarch64.rpm"
RPM_HASH = "605656036a2fc87675e0be6642ec4fc9bf6af6989d15f29731accaac88050b9b349354316f19636a51a058f2d23eb3dcb9a683badf07c3aff6d0e6c466685349"

RPROVIDES:${PN} += "edid-decode"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
