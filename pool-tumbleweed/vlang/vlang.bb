SUMMARY = "The V Programming Language"
DESCRIPTION = "V is a statically typed compiled programming language inspired \
by Go but with a more low-level approach, similar to C or Rust."
LICENSE = "MIT & BSD-2-Clause"

PV = "0.5.2"

RPM_NAME = "vlang-0.5.2-3.1.aarch64.rpm"
RPM_HASH = "6969c28bbf2056f855b95dcb6839a3db60b7282a2e61eeff348f56ad1da3108385437a980583d0abd73a529d7ae460f618d43550b903206bdd13ef1192e549ea"

RPROVIDES:${PN} += "vlang"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
libc.so.6 \
libcjson.so.1 \
libgc.so.1 \
libm.so.6 \
libmbedcrypto.so.16 \
libmbedtls.so.21 \
libmbedx509.so.7 \
libsqlite3.so.0 \
libzstd.so.1 \
mbedtls-3-devel \
pkgconfig-bdw-gc \
pkgconfig-libcjson \
pkgconfig-libzstd \
pkgconfig-sqlite3"

inherit rpm
