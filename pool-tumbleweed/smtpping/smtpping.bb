SUMMARY = "A tool for measuring SMTP server delay, delay variation and throughput"
DESCRIPTION = "A tool for measuring SMTP server delay, delay variation and throughput."
LICENSE = "GPL-2.0-only"

PV = "1.1.5"

RPM_NAME = "smtpping-1.1.5-1.1.aarch64.rpm"
RPM_HASH = "9eaf4cca8c13b94089bc2b13dd78d95584b550ad4b2d4b8f7f4ed98f6022a6a8f27a5e4d4006c2b196c120ef470266831bea444c094566c139d96b086a2365f0"

RPROVIDES:${PN} += "smtpping"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
