SUMMARY = "Development Files for Thunar"
DESCRIPTION = "This package provides the development files needed for developing extensions for \
Thunar."
LICENSE = "GPL-2.0-or-later"

PV = "4.20.10"

RPM_NAME = "thunar-devel-4.20.10-1.1.aarch64.rpm"
RPM_HASH = "51df420a27f000c86191262650277d2c46c39510f462f33456f45b5f34cbfa4c5dcfe787998af4d6d1e14d2afed17845c19aa1b2a596a81dad91309b57d62410"

RPROVIDES:${PN} += "pkgconfig-thunarx-3 \
thunar-devel \
thunar-devel-doc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libthunarx-3-0 \
pkgconfig-gio-2.0 \
pkgconfig-gtk+-3.0 \
thunar"

inherit rpm
