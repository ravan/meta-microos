SUMMARY = "Calculation of piecewise linear interpolations in multiple dimensions"
DESCRIPTION = "MutatorMath is a Python library for the calculation of piecewise linear \
interpolations in n-dimensions with any number of masters. It was \
developed for interpolating data related to fonts, but if can handle any \
arithmetic object."
LICENSE = "BSD-3-Clause"

PV = "3.0.1"

RPM_NAME = "python314-mutatorMath-3.0.1-5.5.noarch.rpm"
RPM_HASH = "c937289e8babf0cf5d40717e1458afe2ea838995a90832142dee1497b4e9942bf835b2bafcb748fdac82873901ce3573af6f6067ce4282896ae31fe4a575bcb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-mutatormath \
python314-mutatorMath \
python3dist-mutatormath"

RDEPENDS:${PN} += "python-abi \
python314-FontTools \
python314-defcon \
python314-fontMath \
python314-fs"

inherit rpm
