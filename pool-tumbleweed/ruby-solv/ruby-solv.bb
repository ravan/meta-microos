SUMMARY = "Ruby bindings for the libsolv library"
DESCRIPTION = "Ruby bindings for libsolv."
LICENSE = "BSD-3-Clause"

PV = "0.7.39"

RPM_NAME = "ruby-solv-0.7.39-1.4.aarch64.rpm"
RPM_HASH = "9aa2f42df08503265a3a9952205cdc5fb8e6ed43fe9ec9c816c0e3fe5fbd1afbe830f36ca14d8c6d1a9e09cc41046fa489a0a8c1edef41487d8085c69306c40f"

RPROVIDES:${PN} += "ruby-solv \
ruby-solv-ruby-4.0.0"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
liblzma.so.5 \
librpm.so.10 \
librpmio.so.10 \
libxml2.so.16 \
libz.so.1 \
libzstd.so.1"

inherit rpm
