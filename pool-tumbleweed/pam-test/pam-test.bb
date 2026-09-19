SUMMARY = "Test of a PAM stack for authentication and password change"
DESCRIPTION = "This application can be used to test a PAM stack for authentication and \
password change."
LICENSE = "GPL-2.0-only"

PV = "0.0+git.20191111"

RPM_NAME = "pam-test-0.0+git.20191111-1.11.aarch64.rpm"
RPM_HASH = "8228a8b327f78d3f860218507800efd92011e20bb1fa8e73d18a62fdb9213a6df1b45263fccc8ca9b189599dd82a8bda9e0e5e669915c5396eacb3392f944359"

RPROVIDES:${PN} += "pam-test"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpam-misc.so.0 \
libpam.so.0"

inherit rpm
