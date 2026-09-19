SUMMARY = "C git library"
DESCRIPTION = "libgit2 is a portable, pure C implementation of the Git core methods \
provided as a re-entrant linkable library with a solid API, allowing \
you to write native speed custom Git applications in any language \
with bindings."
LICENSE = "GPL-2.0-only-with-GCC-exception-2.0"

PV = "1.9.7"

RPM_NAME = "libgit2-experimental1_9-1.9.7-1.1.aarch64.rpm"
RPM_HASH = "da884e939a469b20844d909e8884c49371b67f8d76a4bd89129a8e05677dcbd6f2ec9d5cabe7f381fa90b33910060d77826cf8231dab91a25f98442f06059442"

RPROVIDES:${PN} += "libgit2-experimental.so.1.9 \
libgit2-experimental1-9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libpcre2-8.so.0 \
libssh2.so.1 \
libssl.so.3 \
libz.so.1"

inherit rpm
