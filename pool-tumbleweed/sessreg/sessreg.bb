SUMMARY = "Utility to manage utmp/wtmp entries for X sessions"
DESCRIPTION = "Sessreg is a simple program for managing utmp/wtmp entries for X sessions. \
It was originally written for use with xdm, but may also be used with \
other display managers such as gdm or kdm."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "sessreg-1.1.4-1.5.aarch64.rpm"
RPM_HASH = "149b559be560ec50ec7ca8709e33db66b9b05a3ec10d037a0d11c2e8f1bb5880830adfb0ce90e2548cabeae2c75f5e901703f333223d1eeb6e26c9120f7ef89d"

RPROVIDES:${PN} += "sessreg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
