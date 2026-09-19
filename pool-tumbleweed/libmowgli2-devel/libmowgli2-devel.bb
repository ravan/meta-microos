SUMMARY = "The development files for libmowgli v2"
DESCRIPTION = "mowgli is a development framework for C (like GLib) which provides \
flexible algorithms. It can be used as a suppliment to GLib to add \
additional functions (dictionaries, hashes), or replace some of the \
slow GLib list manipulation functions, or stand alone. It also \
provides a hook system and convenient logging for code, as well as a \
block allocator. \
 \
This package holds the development files for libmowgli v2."
LICENSE = "ISC"

PV = "2.1.3"

RPM_NAME = "libmowgli2-devel-2.1.3-2.23.aarch64.rpm"
RPM_HASH = "98f1c4e0439e7be2f95cd4b31abcae10fb78d181d06c2bdebe66a3ef19e7ae231e31c7122eb34b718fa9ddc04e2763d5decee5bf7f7b7146efc1a2c6c0cd64ed"

RPROVIDES:${PN} += "libmowgli2-devel \
pkgconfig-libmowgli-2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libmowgli-2-0"

inherit rpm
