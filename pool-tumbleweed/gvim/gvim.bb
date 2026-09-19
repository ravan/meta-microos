SUMMARY = "A GUI for Vi"
DESCRIPTION = "Package gvim contains the largest set of features of vim, which is \
graphical windows and language interpreter, like python, ruby, or perl. \
You need package vim for the help and other documentation too. If you \
want less features, you might want to install vim instead."
LICENSE = "Vim"

PV = "9.2.0901"

RPM_NAME = "gvim-9.2.0901-1.1.aarch64.rpm"
RPM_HASH = "b3e0a5ec8c8df94df5a03d07addf2e4ed42379fffe13388fae5cb8281e52d724ba39e739ae84d32eb6f8f951f490a3f555feaa0ea41836dcb1da21fae909ec27"

RPROVIDES:${PN} += "config-gvim \
gvim \
gvim-base \
gvim-client \
gvim-enhanced \
vi \
vim-client"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libICE.so.6 \
libSM.so.6 \
libX11.so.6 \
libXt.so.6 \
libacl.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgpm.so.2 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libperl.so \
libselinux.so.1 \
libtinfo.so.6 \
libwayland-client.so.0 \
vim-data \
xxd"

inherit rpm
