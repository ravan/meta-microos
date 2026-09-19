SUMMARY = "Low-level format tool for USB floppy drives under Linux"
DESCRIPTION = "ufiformat is a tool to low-level format USB floppy disks."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.9"

RPM_NAME = "ufiformat-0.9.9-12.22.aarch64.rpm"
RPM_HASH = "97bc6055694cf1f2620cb1b0c62007c9a4cb82a9e275b2510e58a7bdffd90c3a3e9ab405611a6d615b667360c2af13a5b620bdd63669d14ecc79d61f13b69d21"

RPROVIDES:${PN} += "ufiformat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libext2fs.so.2"

inherit rpm
