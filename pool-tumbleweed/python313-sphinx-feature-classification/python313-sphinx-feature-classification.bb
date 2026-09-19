SUMMARY = "Sphinx extension to generate a matrix of pluggable drivers"
DESCRIPTION = "An extension to Sphinx to generate a matrix of pluggable drivers and \
their support to an API."
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "python313-sphinx-feature-classification-2.1.0-1.2.noarch.rpm"
RPM_HASH = "a158e214fff2b20864730b8e93e2d24ae5368d95361c94f7e393192331c8bd174cf7a99cf9874a5f8caa2df4d41021b2e0012fe56c002bec925d522b456451db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinx-feature-classification \
python3.13dist-sphinx-feature-classification \
python313-sphinx-feature-classification \
python3dist-sphinx-feature-classification"

RDEPENDS:${PN} += "python-abi \
python313-docutils \
python313-pbr"

inherit rpm
