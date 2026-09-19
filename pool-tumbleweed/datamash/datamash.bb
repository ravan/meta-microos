SUMMARY = "Statistical, numerical and textual operations in the command line"
DESCRIPTION = "GNU datamash is a command-line program which performs basic numeric, \
textual and statistical operations on input textual data files."
LICENSE = "GPL-3.0-or-later"

PV = "1.9"

RPM_NAME = "datamash-1.9-1.9.aarch64.rpm"
RPM_HASH = "c3e1993f5bc5e7e72dd5d3ad6b7aaa9fc2c2afba1674fca5f1154a46142ebc752068dc05d3c059f2b16ab2effe5eacf030babeeebac4ac512110eeb93abf523d"

RPROVIDES:${PN} += "datamash"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libm.so.6"

inherit rpm
