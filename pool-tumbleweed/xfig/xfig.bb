SUMMARY = "Facility for Interactive Generation of Figures under the X Window System"
DESCRIPTION = "Xfig is a menu-driven tool that allows the user to draw and manipulate \
objects interactively in an X Window System window.  The resulting \
pictures can be saved, printed on PostScript printers, or converted to \
a variety of other formats (to allow inclusion in LaTeX documents, for \
example)."
LICENSE = "MIT"

PV = "3.2.9a"

RPM_NAME = "xfig-3.2.9a-2.6.aarch64.rpm"
RPM_HASH = "5b637988816937d9c18e7aac12d322f63d9fb63107b66d6b4e8735e3c329673875b055dae21e8eea296038796ce827c49b15b0fe44b309b61f7272c01e9836a4"

RPROVIDES:${PN} += "xfig \
xfig.3.2.3d"

RDEPENDS:${PN} += "efont-unicode \
fontconfig \
ifnteuro \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw3d.so.8 \
libXft.so.2 \
libXi.so.6 \
libXpm.so.4 \
libXt.so.6 \
libc.so.6 \
libfontconfig.so.1 \
libgs.so.10 \
libjpeg.so.8 \
libm.so.6 \
libpng16.so.16 \
libtiff.so.6 \
netpbm \
transfig \
urw-base35-fonts \
xorg-x11-fonts \
xorg-x11-fonts-core"

inherit rpm
