SUMMARY = "Improved build system generator for Python C/C++/Fortran/Cython extensions"
DESCRIPTION = "Improved build system generator for Python C/C++/Fortran/Cython extensions"
LICENSE = "MIT"

PV = "0.19.1"

RPM_NAME = "python313-scikit-build-0.19.1-1.1.noarch.rpm"
RPM_HASH = "c444d034cd48f9908e5e2fd77ce04d15e38c9f940d64cff3cef101298d4ccaf469a18bcd68bd6f937bbbc73798b9693af3734bf492b4794b7988caa28e6d329a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-scikit-build \
python3.13dist-scikit-build \
python313-scikit-build \
python3dist-scikit-build"

RDEPENDS:${PN} += "cmake \
python-abi \
python313-distro \
python313-packaging \
python313-setuptools \
python313-wheel"

inherit rpm
