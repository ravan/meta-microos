SUMMARY = "Network Block Device server"
DESCRIPTION = "This package contains the nbdkit server with  only the null plugin \
and no filters.  To install a basic set of plugins and filters you \
need to install 'nbdkit-basic-plugins', 'nbdkit-basic-filters' or \
the metapackage 'nbdkit'."
LICENSE = "BSD-3-Clause"

PV = "1.48.0"

RPM_NAME = "nbdkit-server-1.48.0-1.1.aarch64.rpm"
RPM_HASH = "f0520f9e96586e89fd500baf470a1512146ba3fe59dc73b24238e1c66ef2ffe8b5e6df7f8b118b7264f90d32c0b8592a294348702fa600a4868925bb7f03003c"

RPROVIDES:${PN} += "nbdkit-server"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgnutls.so.30 \
libm.so.6 \
libselinux.so.1"

inherit rpm
