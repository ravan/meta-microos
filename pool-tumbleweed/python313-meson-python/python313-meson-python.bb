SUMMARY = "Meson Python build backend (PEP 517)"
DESCRIPTION = "meson-python is a Python build backend built on top of the Meson build system. \
It enables using Meson for the configuration and build steps of Python packages. \
meson-python is best suited for building Python packages containing extension \
modules implemented in languages such as C, C++, Cython, Fortran, Pythran, or Rust."
LICENSE = "MIT"

PV = "0.20.0"

RPM_NAME = "python313-meson-python-0.20.0-1.2.noarch.rpm"
RPM_HASH = "824160a513b32242a61be0d1065c0b6ecc6a78b25d9bd6e2500390dedbb9d824b5bbda78d64776b614d7a597f9d94af5b51395eeb425113429cd3e6e50bc9000"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-meson-python \
python3.13dist-meson-python \
python313-meson-python \
python3dist-meson-python"

RDEPENDS:${PN} += "meson \
python-abi \
python313-packaging \
python313-pyproject-metadata"

inherit rpm
