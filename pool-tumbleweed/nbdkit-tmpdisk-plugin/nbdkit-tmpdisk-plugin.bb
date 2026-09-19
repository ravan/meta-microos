SUMMARY = "Remote temporary filesystem disk plugin for nbdkit"
DESCRIPTION = "This package is a remote temporary filesystem disk plugin for nbdkit."
LICENSE = "BSD-3-Clause"

PV = "1.48.0"

RPM_NAME = "nbdkit-tmpdisk-plugin-1.48.0-1.1.aarch64.rpm"
RPM_HASH = "fc12446e5b86073f953afc55cb0e5954a0a842220328e7dc5cfe89f577055da8b354872c2e56086046da08a76362cbc8a761bad625543123f5c54c86aa715175"

RPROVIDES:${PN} += "nbdkit-tmpdisk-plugin"

RDEPENDS:${PN} += "e2fsprogs \
ld-linux-aarch64.so.1 \
libc.so.6 \
nbdkit-server \
util-linux"

inherit rpm
