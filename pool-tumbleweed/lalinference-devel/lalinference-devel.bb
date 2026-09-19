SUMMARY = "Development files for LAL Inference"
DESCRIPTION = "This package contains sources and header files needed to build applications \
that use the LAL Inference library."
LICENSE = "GPL-2.0-or-later"

PV = "4.1.9"

RPM_NAME = "lalinference-devel-4.1.9-3.1.aarch64.rpm"
RPM_HASH = "e893e6804d6bdcbab21ca774686adebc5965d43625835a7b5b446c18c0722ee9ddf9a710732e18194dce081f7cd64a65427b0e4e05f25c768b0e1dfc009bac7f"

RPROVIDES:${PN} += "config-lalinference-devel \
lalinference-devel \
pkgconfig-lalinference"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
lalinference-data \
liblalinference23 \
pkgconfig-gsl \
pkgconfig-lal \
pkgconfig-lalburst \
pkgconfig-lalframe \
pkgconfig-lalinspiral \
pkgconfig-lalmetaio \
pkgconfig-lalsimulation"

inherit rpm
