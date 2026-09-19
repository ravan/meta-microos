SUMMARY = "A Sphinx-doc theme based on Vuepress"
DESCRIPTION = "Sphinx Press is a modern responsive theme for python’s Sphinx docs. \
 \
This theme is based on VuePress. It uses Vue.js & Stylus managed by vite."
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "python314-sphinx_press_theme-0.9.1-1.9.noarch.rpm"
RPM_HASH = "6ac24106fa5c8a4234c5f56ffd708653c50a08082ead323c35847e646e67ab695a4523b06f7ba8b94e11e21a3b1e2419eff6fc8a42e969c6d95d39570206084c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sphinx-press-theme \
python314-sphinx-press-theme \
python3dist-sphinx-press-theme"

RDEPENDS:${PN} += "python-abi \
python314-Sphinx"

inherit rpm
