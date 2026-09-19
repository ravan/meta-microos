SUMMARY = "Python implementation of the Earth Mover's Distance"
DESCRIPTION = "PyEMD is a Python wrapper for Ofir Pele and Michael Werman's implementation \
of the Earth Mover's Distance that allows it to be used with NumPy."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python313-pyemd-2.0.0-1.3.noarch.rpm"
RPM_HASH = "81ae85d2bcee47b6d25feb0a4bdcff5e8e1318b45db3efbd7e85cf72185cefb1511a74fd9240ef5d79675f67dc9ecb70240db23efdfe0e5ffd6dde26550fd068"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyemd \
python3.13dist-pyemd \
python313-pyemd \
python3dist-pyemd"

RDEPENDS:${PN} += "python-abi \
python313-numpy \
python313-pot"

inherit rpm
