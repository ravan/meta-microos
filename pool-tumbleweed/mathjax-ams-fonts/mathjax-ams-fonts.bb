SUMMARY = "Fonts used by MathJax to display math in the browser"
DESCRIPTION = "Fonts used by MathJax to display math in the browser."
LICENSE = "OFL-1.1"

PV = "3.2.2"

RPM_NAME = "mathjax-ams-fonts-3.2.2-1.6.noarch.rpm"
RPM_HASH = "cfa52fdcf58ee4bcfc04aa4b62a02fa097d0391caee16aad50dda784ef1ecc329050c734a6850e34a02d0a22a02f7ca020341f8d4a4d0613497bc424604a1a41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mathjax-ams-fonts"

RDEPENDS:${PN} += ""

inherit rpm
