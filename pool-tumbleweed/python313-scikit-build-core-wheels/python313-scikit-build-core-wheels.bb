SUMMARY = "The scikit_build_core[wheels] extra"
DESCRIPTION = "Python CMake adaptor and Python API for plugins: The extra requirement to build PEP518 wheels and sdists. \
Note that on openSUSE, this requirement still uses the system cmake and does not need the python package."
LICENSE = "Apache-2.0"

PV = "1.0.3"

RPM_NAME = "python313-scikit-build-core-wheels-1.0.3-1.1.noarch.rpm"
RPM_HASH = "1cfb9fbe140f6da76c719e9afc447c10911a463b5f462782240eb0231595639168f2a2497bac144c8d8a7447838e0252636b0ba159ef22cd108501f1b3b83d58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-scikit-build-core-pyproject \
python3-scikit-build-core-wheels \
python313-scikit-build-core-pyproject \
python313-scikit-build-core-wheels"

RDEPENDS:${PN} += "ninja \
python313-scikit-build-core"

inherit rpm
