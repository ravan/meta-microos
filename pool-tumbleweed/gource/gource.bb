SUMMARY = "Software version control visualization tool"
DESCRIPTION = "Gource is a software version control visualization tool. \
 \
Software projects are displayed by Gource as an animated tree \
with the root directory of the project at its centre. Directories \
appear as branches with files as leaves. Developers can be seen \
working on the tree at the times they contributed to the project. \
 \
Currently there is first party support for Git and Mercurial, \
and third party (using additional steps) for CVS and SVN."
LICENSE = "GPL-3.0-or-later"

PV = "0.56"

RPM_NAME = "gource-0.56-1.4.aarch64.rpm"
RPM_HASH = "6bc327f103367a560871be96070e0cc58ea82677efde029797a231058f4ed8eb2a92e3977016ab907fe1c4b1e15326e95e034b8be079edcabdae9e0bdfd5cb2d"

RPROVIDES:${PN} += "gource"

RDEPENDS:${PN} += "freefont \
ld-linux-aarch64.so.1 \
libGLEW.so.2.3 \
libGLU.so.1 \
libOpenGL.so.0 \
libSDL2-2.0.so.0 \
libSDL2-image-2.0.so.0 \
libboost-filesystem.so.1.91.0 \
libc.so.6 \
libfreetype.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpcre2-8.so.0 \
libpng16.so.16 \
libstdc++.so.6 \
libtinyxml.so.0"

inherit rpm
