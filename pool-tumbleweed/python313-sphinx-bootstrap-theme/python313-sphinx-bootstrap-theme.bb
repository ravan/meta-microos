SUMMARY = "Sphinx Bootstrap Theme"
DESCRIPTION = "This Sphinx theme integrates the Bootstrap CSS / JavaScript framework \
with various layout options, hierarchical menu navigation, and \
mobile-friendly responsive design. It is configurable, extensible, and \
can use any number of different Bootswatch CSS themes."
LICENSE = "Apache-2.0 & MIT"

PV = "0.8.1"

RPM_NAME = "python313-sphinx-bootstrap-theme-0.8.1-3.5.noarch.rpm"
RPM_HASH = "47f4583d338631fa0e39d1c9549f2e42f40b7abae5e335a18ed34211b6b8561753f199f90d5988b6bc014ed5e56fa1c4e93026fed70ee0b0846edeb5bface9a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinx-bootstrap-theme \
python3.13dist-sphinx-bootstrap-theme \
python313-sphinx-bootstrap-theme \
python3dist-sphinx-bootstrap-theme"

RDEPENDS:${PN} += "python-abi \
python313-Sphinx"

inherit rpm
