SUMMARY = "The purely functional package manager"
DESCRIPTION = "Nix is a powerful package manager for Linux and other Unix systems \
that makes package management reliable and reproducible. \
Please refer to the Nix manual for more details."
LICENSE = "LGPL-2.1-only"

PV = "2.35.2"

RPM_NAME = "nix-2.35.2-1.1.aarch64.rpm"
RPM_HASH = "dd3ac4de8155bb5c1d3c97c5023ae24e3958b2fbbccb4a87a70cab63b1e3f4474f4f12f6747ca03ab5a6f27b6947c1af97692ec3f958767ef6c580c05fb42fd4"

RPROVIDES:${PN} += "config-nix \
group-nix-users \
group-nixbld \
group-nixbld01 \
group-nixbld02 \
group-nixbld03 \
group-nixbld04 \
group-nixbld05 \
group-nixbld06 \
group-nixbld07 \
group-nixbld08 \
group-nixbld09 \
group-nixbld10 \
libnixcmd.so.2.35.2 \
libnixexpr.so.2.35.2 \
libnixexprc.so.2.35.2 \
libnixfetchers.so.2.35.2 \
libnixfetchersc.so.2.35.2 \
libnixflake.so.2.35.2 \
libnixflakec.so.2.35.2 \
libnixmain.so.2.35.2 \
libnixmainc.so.2.35.2 \
libnixstore.so.2.35.2 \
libnixstorec.so.2.35.2 \
libnixutil.so.2.35.2 \
libnixutilc.so.2.35.2 \
nix \
user-nixbld01 \
user-nixbld02 \
user-nixbld03 \
user-nixbld04 \
user-nixbld05 \
user-nixbld06 \
user-nixbld07 \
user-nixbld08 \
user-nixbld09 \
user-nixbld10"

RDEPENDS:${PN} += "/usr/bin/sh \
busybox-static \
jq \
ld-linux-aarch64.so.1 \
libarchive.so.13 \
libblake3.so.0 \
libboost-context.so.1.91.0 \
libboost-iostreams.so.1.91.0 \
libboost-url.so.1.91.0 \
libbrotlidec.so.1 \
libbrotlienc.so.1 \
libc.so.6 \
libcpuid.so.18 \
libcrypto.so.3 \
libcurl.so.4 \
libgc.so.1 \
libgcc-s.so.1 \
libgit2.so.1.9 \
liblowdown.so.4 \
libm.so.6 \
libmimalloc.so.3 \
libreadline.so.8 \
libseccomp.so.2 \
libsodium.so.26 \
libsqlite3.so.0 \
libstdc++.so.6 \
libzstd.so.1 \
sysuser-shadow"

inherit rpm
