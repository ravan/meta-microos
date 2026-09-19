SUMMARY = "Symmetry finder and symmetric Hamiltonian generator"
DESCRIPTION = "qsymm is a Python library that automatically generates model \
Hamiltonians from symmetry constraints and finds the full symmetry \
group of your Hamiltonian."
LICENSE = "BSD-2-Clause"

PV = "1.4.0"

RPM_NAME = "python314-qsymm-1.4.0-1.11.noarch.rpm"
RPM_HASH = "39d32fd4100488c1d9d536492da596aa38e9ef718d887304868aea6d9c3477c1720ed6ce9df2253c64bce6e98eaf38927181f94d1af3bb6e8805467a5d47bee2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-qsymm \
python314-qsymm \
python3dist-qsymm"

RDEPENDS:${PN} += "python-abi \
python314-numpy \
python314-scipy \
python314-sympy \
python314-tinyarray"

inherit rpm
