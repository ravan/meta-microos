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
This package provides the shared libraries for Rivet."
LICENSE = "Apache-2.0 & GPL-2.0-only & MPL-2.0 & LPPL-1.3a & BSL-1.0"

PV = "4.1.2"

RPM_NAME = "libRivet-4_1_2-4.1.2-2.1.aarch64.rpm"
RPM_HASH = "b6be071285c994bf6ee5f746b819975a510a910b0bf3cefa3ab204b484558ee24bf6214b19837f8a751abb240441366753b80a44ccb737498780f8dd53fe1a57"

RPROVIDES:${PN} += "libRivet-4-1-2 \
libRivet-4.1.2.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libHepMC3.so.4 \
libHepMC3search.so.5 \
libYODA-2.1.2.so \
libc.so.6 \
libfastjet.so.0 \
libfastjetcontribfragile.so \
libfastjetplugins.so.0 \
libfastjettools.so.0 \
libgcc-s.so.1 \
libgmp.so.10 \
libgomp.so.1 \
libm.so.6 \
libz.so.1"

inherit rpm
