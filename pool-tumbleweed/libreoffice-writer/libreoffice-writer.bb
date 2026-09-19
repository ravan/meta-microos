SUMMARY = "LibreOffice Writer and Web"
DESCRIPTION = "This module allows you to create and edit text and graphics in letters, \
reports, documents and Web pages by using LibreOffice office suite."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-writer-26.8.0.3-1.1.aarch64.rpm"
RPM_HASH = "3a2df9bcd63e2f0a0f2732486a69a7cf3cda60068820a8d55e7260e59af8fdf66248887f9ff3a52488db1e594cd53aebbf8e43cb30dd3a7c0802904c62b89106"

RPROVIDES:${PN} += "libhwplo.so \
liblwpftlo.so \
libmswordlo.so \
libreoffice-writer \
libsw-writerfilterlo.so \
libswdlo.so \
libswuilo.so \
libt602filterlo.so \
libvbaswobjlo.so \
libwpftwriterlo.so \
libwriterlo.so"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libabw-0.1.so.1 \
libc.so.6 \
libe-book-0.1.so.1 \
libepubgen-0.1.so.1 \
libetonyek-0.1.so.1 \
libfilelo.so \
libgcc-s.so.1 \
libi18nlangtag.so \
libicui18n.so.78 \
libicuuc.so.78 \
libm.so.6 \
libmergedlo.so \
libmwaw-0.3.so.3 \
libodfgen-0.1.so.1 \
libreoffice \
librevenge-0.0.so.0 \
libstaroffice-0.0.so.0 \
libstdc++.so.6 \
libswlo.so \
libuno-cppu.so.3 \
libuno-cppuhelpergcc3.so.3 \
libuno-sal.so.3 \
libuno-salhelpergcc3.so.3 \
libwpd-0.10.so.10 \
libwpg-0.3.so.3 \
libwps-0.4.so.4 \
libwriterperfectlo.so \
libxml2.so.16 \
libz.so.1 \
rtld-GNU-HASH"

inherit rpm
