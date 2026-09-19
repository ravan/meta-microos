SUMMARY = "LibreOffice Impress"
DESCRIPTION = "This module allows you to create and edit presentations for slideshows, \
meeting and Web pages by using LibreOffice office suite."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-impress-26.8.0.3-1.1.aarch64.rpm"
RPM_HASH = "ea86441e0e8836fa653f6a5b9e219e334f6c187ad512f4ce596cd47abaab8203ee09a8b4bc020db0305faf7dc343c0f4e49fabd90059c9de58f3f00675659f50"

RPROVIDES:${PN} += "libOGLTranslo.so \
libPresentationMinimizerlo.so \
libreoffice-impress \
libwpftimpresslo.so"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libepoxy.so.0 \
libetonyek-0.1.so.1 \
libgcc-s.so.1 \
libm.so.6 \
libmergedlo.so \
libmwaw-0.3.so.3 \
libodfgen-0.1.so.1 \
libreoffice \
librevenge-0.0.so.0 \
libstaroffice-0.0.so.0 \
libstdc++.so.6 \
libuno-cppu.so.3 \
libuno-cppuhelpergcc3.so.3 \
libuno-sal.so.3 \
libwriterperfectlo.so \
rtld-GNU-HASH"

inherit rpm
