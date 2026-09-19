SUMMARY = "Development files for the Osmocom GPRS Gb interface library"
DESCRIPTION = "The libosmogb library contains a GPRS BSSGP protocol implementation. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmogb."
LICENSE = "AGPL-3.0-or-later"

PV = "1.14.2"

RPM_NAME = "libosmogb-devel-1.14.2-1.1.aarch64.rpm"
RPM_HASH = "22ca1f996eb37b1ded0f78ce20c5a9b84cfa35a6ca77179cfd1fae6e0c99151a05770316688cf23db414f5d86399352f86db0a51c6a9c3e5603a96694bf0e4aa"

RPROVIDES:${PN} += "libosmogb-devel \
pkgconfig-libosmogb"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libosmocore-devel \
libosmogb14 \
libosmogsm-devel \
pkgconfig-libosmocore \
pkgconfig-libosmogsm \
pkgconfig-libosmovty \
pkgconfig-talloc"

inherit rpm
