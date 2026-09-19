SUMMARY = "Headers and source files for developing with ldas-tools-framecpp's in C"
DESCRIPTION = "This package provides the headers and sources needed for developing programs \
with ldas-tools-framecpp in C."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.4"

RPM_NAME = "ldas-tools-framecpp-c-devel-3.0.4-2.7.aarch64.rpm"
RPM_HASH = "7d6ab6d4c2553eb39ffb054f3fcdf8773c7b5b9725e9a7d03928d5e2e95d57586e262d3192a997695c2f1479d83abd4a8e31eda5fd270ff2d2b2c5c075ff2649"

RPROVIDES:${PN} += "ldas-tools-framecpp-c-devel \
pkgconfig-framecppc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libframecppc4"

inherit rpm
