SUMMARY = "The Matrix screensaver"
DESCRIPTION = "CMatrix is based on the screensaver from The Matrix website. It shows text flying in and out in a terminal like as seen in 'The Matrix' movie. It can scroll lines all at the same rate or asynchronously and at a user-defined speed"
LICENSE = "GPL-3.0-only"

PV = "2.0"

RPM_NAME = "cmatrix-2.0-1.7.aarch64.rpm"
RPM_HASH = "bc4a5478c8e51db483c33b7ab55ed5deb46f3b33ca94275630bd7b9661df4f361ef3fc57ce7935c6c5bd29283e43afeeacddf01f850027fb9baf26314195efad"

RPROVIDES:${PN} += "cmatrix"

RDEPENDS:${PN} += "filesystem \
kbd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
