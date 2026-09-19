SUMMARY = "COSMIC System Monitor"
DESCRIPTION = "COSMIC System Monitor."
LICENSE = "GPL-3.0-only"

PV = "1.6.0"

RPM_NAME = "cosmic-monitor-1.6.0-1.2.aarch64.rpm"
RPM_HASH = "c8fd57abdd7128265ea01ac8c871b875ccecf6d6bb686c75c2356f6f093471107f1096684a7ed54c87a76ae782770adfec5e4a9e675f62eb1ac3d2ac6968634d"

RPROVIDES:${PN} += "cosmic-monitor"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libxkbcommon.so.0"

inherit rpm
