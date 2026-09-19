SUMMARY = "Sphinx extension to generate HTML help files"
DESCRIPTION = "sphinxcontrib-htmlhelp is a sphinx extension which renders HTML help files."
LICENSE = "BSD-2-Clause"

PV = "2.1.0"

RPM_NAME = "python313-sphinxcontrib-htmlhelp-2.1.0-2.2.noarch.rpm"
RPM_HASH = "db2ed25278231117f82f648096822ab881ddc15ca32b60e38af0f0df9fd14825f3927fba08ddaf6c87461432acbaf0b45b524856984bcabfb94ba7823db74943"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-htmlhelp \
python3.13dist-sphinxcontrib-htmlhelp \
python313-sphinxcontrib-htmlhelp \
python3dist-sphinxcontrib-htmlhelp"

RDEPENDS:${PN} += "python-abi"

inherit rpm
