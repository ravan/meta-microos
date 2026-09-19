SUMMARY = "A sphinx extension for designing beautiful, view size responsive web components"
DESCRIPTION = "A sphinx extension for designing beautiful, view size responsive web components. \
 \
Created with inspiration from Bootstrap (v5), Material Design and Material-UI design frameworks."
LICENSE = "MIT"

PV = "0.6.1"

RPM_NAME = "python314-sphinx-design-0.6.1-3.4.noarch.rpm"
RPM_HASH = "8fced7dc1ff8818c979dc8a64b339141ba46bbfb95994e4b4febf42cc7281c8c36c0da47d4664aae677da34140b42cf507b7afade5efe2109170dbb98666be55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sphinx-design \
python314-sphinx-design \
python3dist-sphinx-design"

RDEPENDS:${PN} += "python-abi \
python314-Sphinx"

inherit rpm
