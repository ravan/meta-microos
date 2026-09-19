SUMMARY = "LibreOffice SDK"
DESCRIPTION = "This package contains the files needed to build plugins/add-ons for \
LibreOffice. It includes header files, IDL files, needed build \
tools, etc. \
 \
The documentation is in the package libreoffice-sdk-doc"
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-sdk-26.8.0.3-1.1.aarch64.rpm"
RPM_HASH = "287a9de87933a398d45a64607ab84037f002b44a839cf21154bb6faa4747b1afd05e6cebbb726458a495fb9215ee24823b0ef77df231abf963e604e919fa6bb6"

RPROVIDES:${PN} += "libreoffice-sdk \
libreoffice-ure-devel"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
gcc-c++ \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libreoffice \
libstdc++.so.6 \
libuno-sal.so.3 \
libuno-salhelpergcc3.so.3 \
libunoidllo.so \
make \
rtld-GNU-HASH \
ucpp \
zip"

inherit rpm
