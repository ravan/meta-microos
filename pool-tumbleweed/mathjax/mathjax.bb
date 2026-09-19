SUMMARY = "JavaScript library to render math in the browser"
DESCRIPTION = "MathJax is an open-source JavaScript display engine for LaTeX, MathML, \
and AsciiMath notation that works in all modern browsers. It requires no \
setup on the part of the user (no plugins to download or software to \
install), so the page author can write web documents that include \
mathematics and be confident that users will be able to view it \
naturally and easily. Supports LaTeX, MathML, and AsciiMath notation \
in HTML pages. \
 \
 \
License:        Apache-2.0"
LICENSE = "Apache-2.0"

PV = "3.2.2"

RPM_NAME = "mathjax-3.2.2-1.6.noarch.rpm"
RPM_HASH = "9250e2090236ac6653ad760add02abadd067377d233ce9298bde15f12b88f14454bbbbfb9a03cd7f1c9007c0e682beea2a10bdf591c97af8bba8c4636c930613"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mathjax \
npm-mathjax"

RDEPENDS:${PN} += "mathjax-ams-fonts \
mathjax-calligraphic-fonts \
mathjax-fraktur-fonts \
mathjax-main-fonts \
mathjax-math-fonts \
mathjax-sansserif-fonts \
mathjax-script-fonts \
mathjax-size1-fonts \
mathjax-size2-fonts \
mathjax-size3-fonts \
mathjax-size4-fonts \
mathjax-typewriter-fonts \
mathjax-vector-fonts \
mathjax-zero-fonts"

inherit rpm
