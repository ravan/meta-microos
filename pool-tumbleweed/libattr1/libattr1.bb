SUMMARY = "A dynamic library for filesystem extended attribute support"
DESCRIPTION = "This package contains the libattr.so dynamic library, which contains \
the extended attribute library functions."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.6.0"

RPM_NAME = "libattr1-2.6.0-1.2.aarch64.rpm"
RPM_HASH = "737f15809da2ea06a2930f27a55f0dce72bb8d8b83cd59f0c12f311ed791c1c353c7c1b6661fec43187d207d94206f4d8db07f8819cead616f02fa585c7e2aef"

RPROVIDES:${PN} += "config-libattr1 \
libattr \
libattr.so.1 \
libattr1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
