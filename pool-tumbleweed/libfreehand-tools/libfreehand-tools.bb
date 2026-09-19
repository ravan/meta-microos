SUMMARY = "Tools to work with Adobe/Macromedia drawings"
DESCRIPTION = "This package contains tools to work with Adobe/Macromedia drawings."
LICENSE = "MPL-2.0"

PV = "0.1.2"

RPM_NAME = "libfreehand-tools-0.1.2-2.29.aarch64.rpm"
RPM_HASH = "99cada037722b89ce81072a2dfeaf1ae80f2ae3ec8624258a65f6e6d5ef8a5cf61221656527918c05097017d266851d62f5eb6b87b90ea00f1948be9d82546e8"

RPROVIDES:${PN} += "libfreehand-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfreehand-0.1.so.1 \
libgcc-s.so.1 \
librevenge-0.0.so.0 \
librevenge-generators-0.0.so.0 \
librevenge-stream-0.0.so.0 \
libstdc++.so.6"

inherit rpm
