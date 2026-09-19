SUMMARY = "Etrophy development files"
DESCRIPTION = "Headers and other files used for development using etrophy"
LICENSE = "BSD-2-Clause"

PV = "0.5.1"

RPM_NAME = "etrophy-devel-0.5.1-8.38.aarch64.rpm"
RPM_HASH = "82254544de8a03cc8647a7bd875fe1f51dc80017acd2599a063e1b55f672ba8d1014a70eb97176741681e9ad41fbb16f6991208ab860d4200c447d73fa8afd89"

RPROVIDES:${PN} += "etrophy-devel \
pkgconfig-etrophy"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
efl-devel \
elementary-devel \
etrophy-data \
libetrophy0 \
pkgconfig-ecore \
pkgconfig-ecore-file \
pkgconfig-eet \
pkgconfig-eina \
pkgconfig-elementary \
pkgconfig-evas"

inherit rpm
