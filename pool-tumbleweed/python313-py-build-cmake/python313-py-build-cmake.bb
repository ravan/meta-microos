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

RPM_NAME = "python313-py-build-cmake-0.5.0-1.5.noarch.rpm"
RPM_HASH = "d6ebd970166eec524de56837aeb2497cc22baa78786378291161bb08e05afe7e40c5e4b7f155c47825ac6f18f6feb0c5c19049239d058d64b6c320a898811118"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-py-build-cmake \
python3.13dist-py-build-cmake \
python313-py-build-cmake \
python3dist-py-build-cmake"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
cmake \
python-abi \
python313-click \
python313-distlib \
python313-lark \
python313-packaging \
python313-pyproject-metadata \
update-alternatives"

inherit rpm
