SUMMARY = "A small set of data analysis classes for MC event generator validation analyses"
DESCRIPTION = "YODA is a small set of data analysis (specifically histogramming) \
classes being developed by MCnet members as a lightweight common \
system for MC event generator validation analyses. \
 \
This package provides the source files for development with YODA."
LICENSE = "GPL-2.0-only"

PV = "2.1.2"

RPM_NAME = "YODA-devel-2.1.2-1.5.aarch64.rpm"
RPM_HASH = "ab13a1b0424b90708b57b547859422f45f28485b357a5b49a677065ff9d149150c7f5b4d667ced3ce1108a1b0e0739ecfece5aae911df2d6d892de859359710e"

RPROVIDES:${PN} += "YODA-devel \
pkgconfig-yoda"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/pkg-config \
libYODA-2-1-2 \
pkgconfig-hdf5"

inherit rpm
