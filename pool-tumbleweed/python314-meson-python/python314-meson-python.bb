SUMMARY = "Meson Python build backend (PEP 517)"
DESCRIPTION = "meson-python is a Python build backend built on top of the Meson build system. \
It enables using Meson for the configuration and build steps of Python packages. \
meson-python is best suited for building Python packages containing extension \
modules implemented in languages such as C, C++, Cython, Fortran, Pythran, or Rust."
LICENSE = "MIT"

PV = "0.20.0"

RPM_NAME = "python314-meson-python-0.20.0-1.2.noarch.rpm"
RPM_HASH = "8964e36fd4e4edad15438e5e82c7faa9d4cf1cece826399b2933804b251e2189ecdfd348d898cc3afe5d5d6e63c673e4c647fff78af5b918cce8794bfde18d59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-meson-python \
python314-meson-python \
python3dist-meson-python"

RDEPENDS:${PN} += "meson \
python-abi \
python314-packaging \
python314-pyproject-metadata"

inherit rpm
