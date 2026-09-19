SUMMARY = "A Sphinx-doc theme based on Vuepress"
DESCRIPTION = "Sphinx Press is a modern responsive theme for python’s Sphinx docs. \
 \
This theme is based on VuePress. It uses Vue.js & Stylus managed by vite."
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "python313-sphinx_press_theme-0.9.1-1.9.noarch.rpm"
RPM_HASH = "b0679ab350260ab5755f5e492bde68f9a89fe8d4b640c012ccf38d2ec987e174c4e81640d2ede8b83e83bf7e8ad00832d4f561d7779d6fb3eda7df7568fa75d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinx-press-theme \
python3.13dist-sphinx-press-theme \
python313-sphinx-press-theme \
python3dist-sphinx-press-theme"

RDEPENDS:${PN} += "python-abi \
python313-Sphinx"

inherit rpm
