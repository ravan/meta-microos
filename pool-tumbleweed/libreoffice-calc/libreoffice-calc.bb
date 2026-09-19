SUMMARY = "LibreOffice Calc"
DESCRIPTION = "This module allows you to perform calculation, analyze information and \
manage lists in spreadsheets by using LibreOffice office suite."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-calc-26.8.0.3-1.1.aarch64.rpm"
RPM_HASH = "92e50788d99373b3070407c8e3423468571551b53fae19250b0cc558b5ac2ba5ef14ce11882bf11658547eee1f9173ce84d34583e9a8d242babe66176a629f0e"

RPROVIDES:${PN} += "libanalysislo.so \
libcalclo.so \
libdatelo.so \
libpricinglo.so \
libreoffice-calc \
libscdlo.so \
libscfiltlo.so \
libsclo.so \
libscuilo.so \
libsolverlo.so \
libvbaobjlo.so \
libwpftcalclo.so"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libclewlo.so \
libetonyek-0.1.so.1 \
libfilelo.so \
libgcc-s.so.1 \
libi18nlangtag.so \
libicui18n.so.78 \
libicuuc.so.78 \
liblpsolve55.so.0 \
libm.so.6 \
libmd4c-html.so.0 \
libmergedlo.so \
libmwaw-0.3.so.3 \
libodfgen-0.1.so.1 \
liborcus-0.21.so.0 \
liborcus-parser-0.21.so.0 \
libreoffice \
librevenge-0.0.so.0 \
libstaroffice-0.0.so.0 \
libstdc++.so.6 \
libtextconversiondlgslo.so \
libuno-cppu.so.3 \
libuno-cppuhelpergcc3.so.3 \
libuno-sal.so.3 \
libuno-salhelpergcc3.so.3 \
libwps-0.4.so.4 \
libwriterperfectlo.so \
libxml2.so.16 \
rtld-GNU-HASH"

inherit rpm
