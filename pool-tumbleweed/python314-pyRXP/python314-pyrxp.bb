SUMMARY = "Python RXP interface - fast validating XML parser"
DESCRIPTION = "PyRXP is a Python language wrapper around the excellent RXP parser, a \
validating, namespace-aware XML parser written in C."
LICENSE = "BSD-3-Clause"

PV = "3.0.1"

RPM_NAME = "python314-pyRXP-3.0.1-3.7.aarch64.rpm"
RPM_HASH = "ff58a86c78dbfdc51966349a1eafa9e45427f85d6ab108361f1fb86b1ed5b23d1265e3ce3d4bae67531b541e1c105773d97a879abe998f8ab91782dcf3429794"

RPROVIDES:${PN} += "python3.14dist-pyrxp \
python314-pyRXP \
python3dist-pyrxp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
