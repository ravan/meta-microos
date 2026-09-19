SUMMARY = "Headers and source files for developing with ldas-tools-framecpp"
DESCRIPTION = "This package provides the headers and sources needed for developing programs \
using ldas-tools-framecpp - a toolkit providing C++ bindings for libframe."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.4"

RPM_NAME = "ldas-tools-framecpp-devel-3.0.4-2.7.aarch64.rpm"
RPM_HASH = "444b61cc6883d768f3fad401feee8537d434997a53e95ed788c50305e0c86049f580bd69e0c91552c3c96acf71dc94aa7d21e8b45c86d428e2ecfee14ca2ef00"

RPROVIDES:${PN} += "ldas-tools-framecpp-devel \
pkgconfig-framecpp \
pkgconfig-framecpp-common \
pkgconfig-framecpp3 \
pkgconfig-framecpp4 \
pkgconfig-framecpp6 \
pkgconfig-framecpp7 \
pkgconfig-framecpp8 \
pkgconfig-framecpp9"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libboost-program-options-devel \
libframecpp16 \
libframecpp3-8 \
libframecpp4-10 \
libframecpp6-10 \
libframecpp7-6 \
libframecpp8-11 \
libframecpp9-0 \
libframecppc4 \
libframecppcmn12 \
pkgconfig-ldastoolsal \
pkgconfig-libzstd \
pkgconfig-openssl \
pkgconfig-zlib"

inherit rpm
