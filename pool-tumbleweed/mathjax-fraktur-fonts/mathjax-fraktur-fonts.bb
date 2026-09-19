SUMMARY = "Fonts used by MathJax to display math in the browser"
DESCRIPTION = "Fonts used by MathJax to display math in the browser."
LICENSE = "OFL-1.1"

PV = "3.2.2"

RPM_NAME = "mathjax-fraktur-fonts-3.2.2-1.6.noarch.rpm"
RPM_HASH = "04c91723d709a9776a9eab365ad8c9e4ad05eb4ce949844557aae93a593138755769ff9c9a4dbb3203cf725c4e3591b2d4121f30387a1ba33347f82e1f233c96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mathjax-fraktur-fonts"

RDEPENDS:${PN} += ""

inherit rpm
