SUMMARY = "Virtual Linux disk plugin for nbdkit"
DESCRIPTION = "This package is a virtual Linux disk plugin for nbdkit."
LICENSE = "BSD-3-Clause"

PV = "1.48.0"

RPM_NAME = "nbdkit-linuxdisk-plugin-1.48.0-1.1.aarch64.rpm"
RPM_HASH = "db56e220309cc850acfdcce5f595debe3f1e1176c994f691eb7bdf15e9489fc984f83171fcbdb5ec90677757be151541b11b77b462b2761a5d2ec7bbb10b5d5e"

RPROVIDES:${PN} += "nbdkit-linuxdisk-plugin"

RDEPENDS:${PN} += "e2fsprogs \
ld-linux-aarch64.so.1 \
libc.so.6 \
nbdkit-server"

inherit rpm
