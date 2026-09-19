SUMMARY = "Optional tool for libjcat"
DESCRIPTION = "This package provides the optional jcat-tool for libjcat."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.6"

RPM_NAME = "jcat-tool-0.2.6-2.1.aarch64.rpm"
RPM_HASH = "084c2306ade77d36ac8aa968afac8eb3219a39284d19b7dd2c8b0f39b56e4cfd233ffa6d705eff5a4586589a0d0ff2d1b0d62bfd832be416688673972f596d2b"

RPROVIDES:${PN} += "jcat-tool"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjcat.so.1"

inherit rpm
