SUMMARY = "Improved build system generator for Python C/C++/Fortran/Cython extensions"
DESCRIPTION = "Improved build system generator for Python C/C++/Fortran/Cython extensions"
LICENSE = "MIT"

PV = "0.19.1"

RPM_NAME = "python314-scikit-build-0.19.1-1.1.noarch.rpm"
RPM_HASH = "082672be70cb055b48e0bd481660b1011f775d238d7f4ffbaca1c13385b61c088a66afec1ecd3ff89818b98fe6c015f2e3a14ad0a6532da4abca01dae2bdaba0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-scikit-build \
python314-scikit-build \
python3dist-scikit-build"

RDEPENDS:${PN} += "cmake \
python-abi \
python314-distro \
python314-packaging \
python314-setuptools \
python314-wheel"

inherit rpm
