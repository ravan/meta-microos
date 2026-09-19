SUMMARY = "GNU Package manager"
DESCRIPTION = "Purely functional package manager and a distribution thereof. \
It offers transactional upgrades, roll-backs, unprivileged package management. \
As a GNU distribution it contains only free software."
LICENSE = "GPL-3.0-only"

PV = "1.4.0"

RPM_NAME = "guix-1.4.0-6.1.aarch64.rpm"
RPM_HASH = "0b10de7304ca8cb3d738ab1f296ea1997e6b5896633e9a7b0e710e5c2a65c66be57fd6da2e95cf726a8dfb050114553a7a81cc5eb921b6f577d1785ce97789b0"

RPROVIDES:${PN} += "/usr/libexec/guix/guile \
group-guix-builder1 \
group-guix-builder2 \
group-guix-builder3 \
group-guix-builder4 \
group-guix-builder5 \
group-guixbuild \
guix \
user-guix-builder1 \
user-guix-builder2 \
user-guix-builder3 \
user-guix-builder4 \
user-guix-builder5"

RDEPENDS:${PN} += "/usr/bin/sh \
gnutls-guile \
guile \
guile-gcrypt \
guile-git \
guile-json \
guile-lzlib \
guile-sqlite3 \
guile-ssh-devel \
guile-zlib \
gzip \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgcrypt-devel \
libgcrypt.so.20 \
libguile-3.0.so.1 \
libsqlite3.so.0 \
libstdc++.so.6 \
libz.so.1 \
sysuser-shadow"

inherit rpm
