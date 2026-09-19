SUMMARY = "GNU Emacs: Emacs binary with X Window System Support"
DESCRIPTION = "Call it \
 \
Emacs \
 \
Love it or leave it. This is the Emacs binary with X Window System \
Support."
LICENSE = "GPL-3.0-or-later"

PV = "31.1"

RPM_NAME = "emacs-x11-31.1-3.1.aarch64.rpm"
RPM_HASH = "cd0be110a9124f7a8f813e6023b2ea925ec9182f3f99335c25b086c3e42624637455c3b595b7abdbcafa9859ad5aa1bd9b0b5d208f1c8617bd25bd54b2859c71"

RPROVIDES:${PN} += "emacs-program \
emacs-x11"

RDEPENDS:${PN} += "/usr/bin/sh \
emacs \
emacs-eln \
fileutils \
gnu-unifont-bitmap-fonts \
ifnteuro \
ld-linux-aarch64.so.1 \
libICE.so.6 \
libMagickCore-7.Q16HDRI.so.10 \
libMagickWand-7.Q16HDRI.so.10 \
libSM.so.6 \
libX11-xcb.so.1 \
libX11.so.6 \
libXaw3d.so.8 \
libXcomposite.so.1 \
libXext.so.6 \
libXfixes.so.3 \
libXi.so.6 \
libXinerama.so.1 \
libXmu.so.6 \
libXpm.so.4 \
libXrandr.so.2 \
libXrender.so.1 \
libXt.so.6 \
libacl.so.1 \
libasound.so.2 \
libc.so.6 \
libcairo.so.2 \
libdbus-1.so.3 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgccjit.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgif.so.7 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmp.so.10 \
libgnutls.so.30 \
libgobject-2.0.so.0 \
libgpm.so.2 \
libgtk-3.so.0 \
libharfbuzz.so.0 \
libjpeg.so.8 \
liblcms2.so.2 \
libm.so.6 \
libm17n-core.so.0 \
libm17n-flt.so.0 \
libotf.so.1 \
libpango-1.0.so.0 \
libpng16.so.16 \
librsvg-2.so.2 \
libsqlite3.so.0 \
libsystemd.so.0 \
libtiff.so.6 \
libtinfo.so.6 \
libtree-sitter.so.0.26 \
libwebp.so.7 \
libwebpdemux.so.2 \
libxcb-shape.so.0 \
libxcb.so.1 \
libxml2.so.16 \
libz.so.1 \
xorg-x11-fonts \
xorg-x11-fonts-core"

inherit rpm
