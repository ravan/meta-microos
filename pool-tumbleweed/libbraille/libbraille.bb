SUMMARY = "Access to Braille Displays and Terminals"
DESCRIPTION = "Libbraille is a computer shared library which makes it possible to \
develop for Braille displays. It provides an API to \
write text on the display, directly draw dots, or get the value of \
keys pressed on the Braille keyboard."
LICENSE = "LGPL-2.1-only"

PV = "0.19.0"

RPM_NAME = "libbraille-0.19.0-26.8.aarch64.rpm"
RPM_HASH = "54ca22892e963f4cdc13a22c9d660dd37cae5ebed55d1a1659a5d9e6cfcadb5ffd7c9703d8ff33648cd5a9f958c1d9c0a58ff8d14d52af351806dd6f1f2b46b7"

RPROVIDES:${PN} += "config-libbraille \
libbraille"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbraille-0.so.14 \
libc.so.6"

inherit rpm
