SUMMARY = "Sphinx extension to generate a matrix of pluggable drivers"
DESCRIPTION = "An extension to Sphinx to generate a matrix of pluggable drivers and \
their support to an API."
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "python314-sphinx-feature-classification-2.1.0-1.2.noarch.rpm"
RPM_HASH = "0008aefa51f1905138b30f7423710298fcc3fb1d34af46af738d76c6e0d3402ac02947ac84205b6b0733cbf96855ebec6d5d89d1ac4c1e78c525378d0480bdfa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sphinx-feature-classification \
python314-sphinx-feature-classification \
python3dist-sphinx-feature-classification"

RDEPENDS:${PN} += "python-abi \
python314-docutils \
python314-pbr"

inherit rpm
