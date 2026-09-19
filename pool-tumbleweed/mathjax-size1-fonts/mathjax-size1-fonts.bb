SUMMARY = "Fonts used by MathJax to display math in the browser"
DESCRIPTION = "Fonts used by MathJax to display math in the browser."
LICENSE = "OFL-1.1"

PV = "3.2.2"

RPM_NAME = "mathjax-size1-fonts-3.2.2-1.6.noarch.rpm"
RPM_HASH = "4ec437e326e71bf3438f9c08e02273d8654dc2795f7eaa115f0d4f55bb05cfb3f398ed2435f01ddde0fc8575f1326d300401f6d3ce2751732c617fb3851bb126"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mathjax-size1-fonts"

RDEPENDS:${PN} += ""

inherit rpm
