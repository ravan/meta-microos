SUMMARY = "The nginx source"
DESCRIPTION = "The source of nginx [engine x] HTTP server and IMAP/POP3 proxy server."
LICENSE = "BSD-2-Clause"

PV = "1.31.5"

RPM_NAME = "nginx-source-1.31.5-1.1.noarch.rpm"
RPM_HASH = "5ab65b012d6d64b5d2b262f3a28f85b5cc2d48e217a2a3d1c410875b304a8a3e16325f88154a6ad8c709a9836c7bbbf3068651419f4473765a44596fd2094e9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nginx-source \
perl-nginx"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
gcc-c++ \
libatomic-ops-devel \
nginx \
nginx-macros \
pkgconfig \
pkgconfig-gdlib \
pkgconfig-libpcre2-8 \
pkgconfig-libxslt \
pkgconfig-openssl \
pkgconfig-zlib \
vim"

inherit rpm
