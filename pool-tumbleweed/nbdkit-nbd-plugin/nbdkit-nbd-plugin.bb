SUMMARY = "NBD proxy / forward plugin for nbdkit"
DESCRIPTION = "This package lets you forward NBD connections from nbdkit \
to another NBD server."
LICENSE = "BSD-3-Clause"

PV = "1.48.0"

RPM_NAME = "nbdkit-nbd-plugin-1.48.0-1.1.aarch64.rpm"
RPM_HASH = "da188ecab63dcd4e35afce671f9a75e5597c0798aea570eca46179acbfb85441b22fad030624a84258d425498d78b69918376a99fd89595694093a8d9d0c1d61"

RPROVIDES:${PN} += "nbdkit-nbd-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnbd.so.0 \
nbdkit-server"

inherit rpm
