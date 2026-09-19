SUMMARY = "An email client for terminals"
DESCRIPTION = "aerc is an email client that runs in terminals."
LICENSE = "GPL-3.0-or-later"

PV = "0.22.0"

RPM_NAME = "aerc-0.22.0-1.1.aarch64.rpm"
RPM_HASH = "ffd29c52f85c53d9653a8ab46f3b26a65ed1ec8520855eef21eacdab61327d589d9b4663f6f28aee7c1bf78deb66c778f78c834f771fa7710a581bfa3790ca21"

RPROVIDES:${PN} += "aerc"

RDEPENDS:${PN} += "/usr/bin/awk \
/usr/bin/python3 \
/usr/bin/sh \
dante \
libc.so.6 \
libnotmuch.so.5 \
w3m"

inherit rpm
