SUMMARY = "Yet another unofficial speedtest.net client cli interface"
DESCRIPTION = "Yet another unofficial speedtest.net client cli interface. \
 \
It supports the new (undocumented) raw TCP protocol for better accuracy."
LICENSE = "MIT"

PV = "1.11+git20240407.b743996"

RPM_NAME = "SpeedTest++-1.11+git20240407.b743996-1.8.aarch64.rpm"
RPM_HASH = "44e4dcf5859dc0a8accd098819bced51ae2e5186abc13be3b4c384d47b5005c6545a5469af18b888c2a302f5d94fbbf7b7d64d7fdf451bbee70e85100d57cb9c"

RPROVIDES:${PN} += "SpeedTest++"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libxml2.so.16"

inherit rpm
