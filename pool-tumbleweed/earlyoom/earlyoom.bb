SUMMARY = "Early OOM Daemon for Linux"
DESCRIPTION = "earlyoom checks the amount of available memory and free swap, and if both are \
below critical level, it will kill the largest process (highest oom_score)."
LICENSE = "MIT"

PV = "1.9.0"

RPM_NAME = "earlyoom-1.9.0-1.5.aarch64.rpm"
RPM_HASH = "0aa69e23c3989959ec2c059590676f6cc0e17f7d440694f7af4c5b09610ce479ef94d5b9dd5a89af71198fcba044fa82a43894fb9bef1e23b6389ee35e5c3e7b"

RPROVIDES:${PN} += "earlyoom"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
