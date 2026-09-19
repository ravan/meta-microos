SUMMARY = "A wrapper for the SLICOT control and systems library"
DESCRIPTION = "Slycot is a wrapper for the SLICOT control and systems library."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "0.7.0"

RPM_NAME = "python314-slycot-0.7.0-2.1.aarch64.rpm"
RPM_HASH = "9854b951e2d2b7ca58a0614c8329d706778cb05db7075339107085eebaf959969d3bf4310154f0bc8d058c44d3289da2a13457c3a7685914cfcdfa9664bae4ee"

RPROVIDES:${PN} += "python3.14dist-slycot \
python314-slycot \
python3dist-slycot"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libblas.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
liblapack.so.3 \
libm.so.6 \
python-abi \
python314-numpy"

inherit rpm
