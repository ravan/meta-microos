SUMMARY = "Command-line WebDAV client"
DESCRIPTION = "cadaver is a command-line WebDAV client, with support for file upload, \
download, on-screen display, in-place editing, namespace operations \
(move/copy), collection creation and deletion, property manipulation, \
and resource locking."
LICENSE = "GPL-2.0-or-later"

PV = "0.28"

RPM_NAME = "cadaver-0.28-1.4.aarch64.rpm"
RPM_HASH = "ee2590693849c6ffc5cd9e8e86d08e25b094d0936937c7297ed7fbce6653c24d7741f1ef4033aa856b1b82850fea3cb884dc1af640e7112af9395392510c7b28"

RPROVIDES:${PN} += "cadaver"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libneon.so.27"

inherit rpm
