SUMMARY = "Add a copy button to each of your code cells"
DESCRIPTION = "Add a copy button to each of your code cells."
LICENSE = "MIT"

PV = "0.5.1"

RPM_NAME = "python313-sphinxcontrib-copybutton-0.5.1-3.5.noarch.rpm"
RPM_HASH = "1e5c641fce31dd1e125bd3d170444ff017aba7d3ea1965d047eabded7a01f25b030ad4459d70e9991b496a14af135be50630f7e01bc25944f8d5a8a7b43760a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-copybutton \
python3.13dist-sphinx-copybutton \
python313-sphinxcontrib-copybutton \
python3dist-sphinx-copybutton"

RDEPENDS:${PN} += "python-abi \
python313-Sphinx"

inherit rpm
