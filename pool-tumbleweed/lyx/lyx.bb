SUMMARY = "WYSIWYM (What You See Is What You Mean) document processor"
DESCRIPTION = "LyX is a document processor that encourages an approach to writing \
based on the structure of your documents, not their appearance. The \
author can concentrate on the content (What You See Is What You Mean). \
The formatting is done by the backends (like LaTeX) and the output can \
have different formats, such as DVI, postscript, PDF, html. \
 \
LyX can check the LaTeX installation by opening the LaTeX Configuration \
document under 'Help' on the menubar. \
 \
LyX uses ImageMagick to deal with images. For security reasons \
(open)SUSE limits the functionaly of ImageMagick. See README.SUSE \
(in /usr/share/doc/packages/lyx/) for more information."
LICENSE = "GPL-2.0-or-later"

PV = "2.5.2"

RPM_NAME = "lyx-2.5.2-1.1.aarch64.rpm"
RPM_HASH = "a51ba91ffd5d8b1fa7ccf0402f3ef645fe6c473a589e202ce78014c1204faa469d69e1cdf414cdb6d8dc547f9b45ab3d22e4805ebadc1aba0b503aca3b7fc259"

RPROVIDES:${PN} += "lyx"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
ImageMagick \
ghostscript \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Svg.so.6 \
libQt6SvgWidgets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libenchant-2.so.2 \
libgcc-s.so.1 \
libhunspell-1.7.so.0 \
libm.so.6 \
libmagic.so.1 \
libmythes-1.2.so.0 \
libstdc++.so.6 \
libz.so.1 \
lyx-fonts"

inherit rpm
