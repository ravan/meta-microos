SUMMARY = "Vim with reduced features"
DESCRIPTION = "Vim compiled with reduced feature set such as no script \
interpreters built in"
LICENSE = "Vim"

PV = "9.2.0901"

RPM_NAME = "vim-small-9.2.0901-1.1.aarch64.rpm"
RPM_HASH = "1a1747594848b34fd4b6771255dd1717fc700bf180023869280758c8ee2ed5c1da7f6e767a525c65836e8b92825c2886106e50903c72100ebf9670746f4a618a"

RPROVIDES:${PN} += "vi \
vim-client \
vim-small"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libacl.so.1 \
libc.so.6 \
libm.so.6 \
libselinux.so.1 \
libtinfo.so.6 \
vim-data-common"

inherit rpm
