SUMMARY = "A toolkit for validation of Monte Carlo event generators"
DESCRIPTION = "The Rivet project (Robust Independent Validation of Experiment and \
Theory) is a toolkit for validation of Monte Carlo event generators. \
It provides a large (and ever growing) set of experimental analyses \
useful for MC generator development, validation, and tuning, as well \
as a convenient infrastructure for adding your own analyses. Rivet is \
the most widespread way by which analysis code from the LHC and other \
high-energy collider experiments is preserved for comparison to and \
development of future theory models. \
 \
This package provides the source files for development with Rivet."
LICENSE = "Apache-2.0 & GPL-2.0-only & MPL-2.0 & LPPL-1.3a & BSL-1.0"

PV = "4.1.2"

RPM_NAME = "Rivet-devel-4.1.2-2.1.aarch64.rpm"
RPM_HASH = "5242aa5cae09683ad5d6108702539338998589b50d0fc20649ca8ff01c3125167323b38dfdc746fb32718e0ee34bc49eec6cf3dac904579bec237260e9edac4a"

RPROVIDES:${PN} += "Rivet-devel \
pkgconfig-rivet"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/pkg-config \
Rivet-data \
YODA-devel \
libRivet-4-1-2"

inherit rpm
