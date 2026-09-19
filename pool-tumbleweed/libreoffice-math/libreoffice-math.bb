SUMMARY = "LibreOffice Math"
DESCRIPTION = "This module allows you to create and edit scientific formulas and \
equations by using LibreOffice office suite."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-math-26.8.0.3-1.1.aarch64.rpm"
RPM_HASH = "2bb5bfcc4664fd5ec9dcf78895af60f131666fd56e9197d1fd6050f35e035340a07536971b17a43e237fe2edac73108cef5347d19dc80999542aeac3300005e5"

RPROVIDES:${PN} += "libreoffice-math \
libsmdlo.so \
libsmlo.so"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libi18nlangtag.so \
libicuuc.so.78 \
libm.so.6 \
libmergedlo.so \
libreoffice \
libstdc++.so.6 \
libuno-cppu.so.3 \
libuno-cppuhelpergcc3.so.3 \
libuno-sal.so.3 \
libuno-salhelpergcc3.so.3 \
rtld-GNU-HASH"

inherit rpm
