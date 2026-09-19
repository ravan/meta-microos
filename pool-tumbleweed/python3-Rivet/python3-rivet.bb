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
This package provides the python bindings for Rivet."
LICENSE = "Apache-2.0 & GPL-2.0-only & MPL-2.0 & LPPL-1.3a & BSL-1.0"

PV = "4.1.2"

RPM_NAME = "python3-Rivet-4.1.2-2.1.aarch64.rpm"
RPM_HASH = "5e7dd0aff63ac8fda90b7bb794f7271c6c6e9bce34bad295b587ca68489322c367ef4c8b3f5fd7c8b8aaff4af0b338893456baa26f00d6c474767d79ffc36838"

RPROVIDES:${PN} += "python-Rivet \
python3-Rivet"

RDEPENDS:${PN} += "/usr/bin/python3 \
Rivet-data \
ld-linux-aarch64.so.1 \
libHepMC3.so.4 \
libRivet-4.1.2.so \
libYODA-2.1.2.so \
libc.so.6 \
libfastjet.so.0 \
libgcc-s.so.1 \
libhdf5.so.310 \
libm.so.6 \
libpython3.13.so.1.0 \
libstdc++.so.6 \
python-abi"

inherit rpm
