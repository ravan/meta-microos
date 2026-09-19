SUMMARY = "A collection of analyses plugins for Rivet"
DESCRIPTION = "The Rivet project (Robust Independent Validation of Experiment and \
Theory) is a toolkit for validation of Monte Carlo event generators. \
It provides a large (and ever growing) set of experimental analyses \
useful for MC generator development, validation, and tuning, as well \
as a convenient infrastructure for adding your own analyses. Rivet is \
the most widespread way by which analysis code from the LHC and other \
high-energy collider experiments is preserved for comparison to and \
development of future theory models. \
 \
This package provides all the analysis plugins for Rivet."
LICENSE = "Apache-2.0 & GPL-2.0-only & MPL-2.0 & LPPL-1.3a & BSL-1.0"

PV = "4.1.2"

RPM_NAME = "Rivet-plugins-4.1.2-2.1.aarch64.rpm"
RPM_HASH = "8eda53de01daafd0b5132c9f137cd86409bbe4402abf824606d1981cd33733e2a715e52c4e0f4ea5b437bcd19a715260e605b28d8095b9a3bacc751d2f1dcb44"

RPROVIDES:${PN} += "Rivet-plugins \
config-Rivet-plugins"

RDEPENDS:${PN} += "Rivet-devel \
ld-linux-aarch64.so.1 \
libHepMC3.so.4 \
libHepMC3search.so.5 \
libRivet-4.1.2.so \
libYODA-2.1.2.so \
libc.so.6 \
libfastjet.so.0 \
libfastjetcontribfragile.so \
libfastjetplugins.so.0 \
libfastjettools.so.0 \
libgcc-s.so.1 \
libgmp.so.10 \
libgomp.so.1 \
libhdf5-hl.so.310 \
libhdf5.so.310 \
libm.so.6 \
libsiscone-spherical.so.0 \
libsiscone.so.0 \
libstdc++.so.6"

inherit rpm
