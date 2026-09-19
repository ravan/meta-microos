SUMMARY = "The mowgli Gen2 development framework for C"
DESCRIPTION = "mowgli is a development framework for C (like GLib) which provides \
flexible algorithms. It can be used as a suppliment to GLib to add \
additional functions (dictionaries, hashes), or replace some of the \
slow GLib list manipulation functions, or stand alone. It also \
provides a hook system and convenient logging for code, as well as a \
block allocator. \
 \
This package holds the shared library from libmowgli v2."
LICENSE = "ISC"

PV = "2.1.3"

RPM_NAME = "libmowgli-2-0-2.1.3-2.23.aarch64.rpm"
RPM_HASH = "44dda904321f1a61b71d853a3c799c1ba607b30c2c91d91bbcde1ec19cfbcb82a8ed881ce56a6a84c27828450443fcb1385e74b56e296667219c974a24467ad6"

RPROVIDES:${PN} += "libmowgli-2-0 \
libmowgli-2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3"

inherit rpm
