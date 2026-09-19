SUMMARY = "Zero-configuration fan control daemon for ThinkPads"
DESCRIPTION = "Zero-configuration fan control daemon for ThinkPads with watchdog \
support and automatic temperature- and time-based hysteresis (no \
bouncing between fan levels)."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "zcfan-1.4.0-1.7.aarch64.rpm"
RPM_HASH = "42b5fd6351a451c8545cee34570b271b55b38d0e0152d936eb20e41958fe094c3f9e3b7ca2b6484f2bbe6ee01ca0594370d0222a82d5fc0c0691d7ed0eb1420b"

RPROVIDES:${PN} += "zcfan"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
