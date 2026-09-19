SUMMARY = "GAP: Line-by-line profiling and code coverage for GAP"
DESCRIPTION = "Line by line profiling and code coverage for GAP."
LICENSE = "CDDL-1.0 & MIT"

PV = "2.6.3"

RPM_NAME = "gap-profiling-2.6.3-1.1.aarch64.rpm"
RPM_HASH = "e2c4778d179acbc8cc3818b7d080487b44d351285509ca02e1fe9e96a546b4f070e41b8c5b448f8a0240e3c0bdfed57436df756f4476672dabb9e390c97a90bb"

RPROVIDES:${PN} += "gap-profiling"

RDEPENDS:${PN} += "/usr/bin/awk \
/usr/bin/bash \
/usr/bin/env \
/usr/bin/perl \
/usr/bin/php \
/usr/bin/python3 \
/usr/bin/sh \
gap-core \
gap-io \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
