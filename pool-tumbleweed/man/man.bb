SUMMARY = "A Program for Displaying man Pages"
DESCRIPTION = "A program for displaying man pages on the screen or sending them to a \
printer (using groff)."
LICENSE = "GPL-2.0-or-later"

PV = "2.13.1"

RPM_NAME = "man-2.13.1-7.3.aarch64.rpm"
RPM_HASH = "e842f4032299d52e9e1a96c52db04b4eaf8a90e7ee7414cae7a6ddd915c4151d8f1b447dab2f3ce54c1659c2a8c8a0920999005f45bb45c58941e7542979cdc6"

RPROVIDES:${PN} += "config-man \
libman-2.13.1.so \
libmandb-2.13.1.so \
man \
man-db"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
coreutils \
fillup \
glibc-locale-base \
groff \
group-man \
ld-linux-aarch64.so.1 \
less \
libalternatives.so.1 \
libc.so.6 \
libgdbm.so.6 \
libpipeline.so.1 \
libz.so.1 \
libzio.so.1 \
user-man"

inherit rpm
