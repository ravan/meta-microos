SUMMARY = "The scikit_build_core[wheels] extra"
DESCRIPTION = "Python CMake adaptor and Python API for plugins: The extra requirement to build PEP518 wheels and sdists. \
Note that on openSUSE, this requirement still uses the system cmake and does not need the python package."
LICENSE = "Apache-2.0"

PV = "1.0.3"

RPM_NAME = "python314-scikit-build-core-wheels-1.0.3-1.1.noarch.rpm"
RPM_HASH = "8eab57e2da6f6da2befe33af49f6e1248f4f345a1972802edc9347b9f8786921c1c8b4dc48e9c12d7cf898ce429865bb4158d48fe758fae05527af491c50b5b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-scikit-build-core-pyproject \
python314-scikit-build-core-wheels"

RDEPENDS:${PN} += "ninja \
python314-scikit-build-core"

inherit rpm
