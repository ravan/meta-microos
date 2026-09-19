SUMMARY = "C library for finding cliques in graphs"
DESCRIPTION = "Cliquer is a set of C routines for finding cliques in an arbitrary \
weighted graph and uses an exact branch-and-bound algorithm."
LICENSE = "GPL-2.0-or-later"

PV = "1.23"

RPM_NAME = "libcliquer1-1.23-1.5.aarch64.rpm"
RPM_HASH = "2d5a6db2b0be5863e6cc3ffc0d5eeeb34f3fd5154d9306d8782a9a240ffaf3681431706e79e15679f24e97bda8f5d80dbbd58c17d1e6e61cd9f277130b4ef997"

RPROVIDES:${PN} += "libcliquer.so.1 \
libcliquer1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
