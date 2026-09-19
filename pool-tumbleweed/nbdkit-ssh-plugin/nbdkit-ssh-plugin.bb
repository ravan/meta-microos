SUMMARY = "SSH plugin for nbdkit"
DESCRIPTION = "This package contains SSH support for nbdkit."
LICENSE = "BSD-3-Clause"

PV = "1.48.0"

RPM_NAME = "nbdkit-ssh-plugin-1.48.0-1.1.aarch64.rpm"
RPM_HASH = "4c4e882c40822d5a9637ca5c2c434e2d3f76b2faf639db6eea3906f2c1078be7605a0e343325d2b9f49be184cab89950fca12752d55d446ddcba7158f2d08680"

RPROVIDES:${PN} += "nbdkit-ssh-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libssh.so.4 \
nbdkit-server"

inherit rpm
