SUMMARY = "Symmetry finder and symmetric Hamiltonian generator"
DESCRIPTION = "qsymm is a Python library that automatically generates model \
Hamiltonians from symmetry constraints and finds the full symmetry \
group of your Hamiltonian."
LICENSE = "BSD-2-Clause"

PV = "1.4.0"

RPM_NAME = "python313-qsymm-1.4.0-1.11.noarch.rpm"
RPM_HASH = "69cc096abd06b436f4e696623b04b7317d26af2b7782d759a0a9d2c4188c61bea09f4d3af03c03c0fc0bb3c42890c6498cd4c55eeb4881f1bd6675797f99d186"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-qsymm \
python3.13dist-qsymm \
python313-qsymm \
python3dist-qsymm"

RDEPENDS:${PN} += "python-abi \
python313-numpy \
python313-scipy \
python313-sympy \
python313-tinyarray"

inherit rpm
