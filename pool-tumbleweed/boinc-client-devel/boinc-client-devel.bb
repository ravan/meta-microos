SUMMARY = "Development files for libboinc"
DESCRIPTION = "This package contains development files for libboinc."
LICENSE = "GPL-3.0-or-later | LGPL-3.0-or-later"

PV = "8.2.15"

RPM_NAME = "boinc-client-devel-8.2.15-2.1.aarch64.rpm"
RPM_HASH = "01b3ee070788c4b76c81f043818678211eec90b77969b5d6c1f42caa6310f7c8d1eac555e54568ebcc0359450e834bb10fefc764f33073985e4877ba00183cfd"

RPROVIDES:${PN} += "boinc-client-devel \
libboinc-devel \
pkgconfig-libboinc \
pkgconfig-libboinc-api \
pkgconfig-libboinc-crypt \
pkgconfig-libboinc-graphics2 \
pkgconfig-libboinc-opencl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libboinc8 \
openssl-devel \
pkgconfig-libjpeg \
pkgconfig-openssl"

inherit rpm
