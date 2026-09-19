SUMMARY = "A sphinx extension for designing beautiful, view size responsive web components"
DESCRIPTION = "A sphinx extension for designing beautiful, view size responsive web components. \
 \
Created with inspiration from Bootstrap (v5), Material Design and Material-UI design frameworks."
LICENSE = "MIT"

PV = "0.6.1"

RPM_NAME = "python313-sphinx-design-0.6.1-3.4.noarch.rpm"
RPM_HASH = "1cafb18f3a367bef630376f8120124e7dbf02e77638cd48ab62ab694b6b7afae97346199b10c12246aed583b8f9106ce4d6f74e276e67007bc32ba8a6ba70371"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinx-design \
python3.13dist-sphinx-design \
python313-sphinx-design \
python3dist-sphinx-design"

RDEPENDS:${PN} += "python-abi \
python313-Sphinx"

inherit rpm
