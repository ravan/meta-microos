SUMMARY = "Gibbs Seawater Oceanographic Package of TEOS-10"
DESCRIPTION = "Python implementation of the Thermodynamic Equation of \
Seawater 2010 (TEOS-10)."
LICENSE = "BSD-3-Clause & MIT"

PV = "3.6.23"

RPM_NAME = "python314-gsw-3.6.23-1.2.aarch64.rpm"
RPM_HASH = "23b71aeca2ceeda0f1b686fa305022ebaeedb5d56975d3fc778410af912d35b9274940efcf4c8f48ee1b1db0b204b350da4b5aaff5c6801af92175c97cd8b9b9"

RPROVIDES:${PN} += "python3.14dist-gsw \
python314-gsw \
python3dist-gsw"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python314-numpy"

inherit rpm
