SUMMARY = "Modern, PEP 517 compliant build backend for creating Python packages with"
DESCRIPTION = "PEP 517 compliant build backend for creating Python packages with extensions built using CMake. \
 \
 \
 \
 - Building and packaging C, C++ or Fortran extension modules for Python using CMake \
 - Declarative configuration using `pyproject.toml` (PEP 621), compatible with flit \
 - Editable/development installations for Python modules (PEP 660) \
 - Compatible with pybind11 and nanobind \
 - Stub generation for type checking and autocompletion \
 - Customizable CMake configuration, build and installation options \
 - Support for multiple installation configurations and components \
 - Cross-compilation support \
 - No dependency on setuptools \
 - Compatible with cibuildwheel for building Wheels"
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python314-py-build-cmake-0.5.0-1.5.noarch.rpm"
RPM_HASH = "8a6ed5833df3f9b4f6aa1ed746e42513be82139b943a05f74e709413c60ad81d160f9519a065fce1ceeef4abf543df36775abe8251a9816d2b53db9ebac6e592"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-py-build-cmake \
python314-py-build-cmake \
python3dist-py-build-cmake"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
cmake \
python-abi \
python314-click \
python314-distlib \
python314-lark \
python314-packaging \
python314-pyproject-metadata \
update-alternatives"

inherit rpm
