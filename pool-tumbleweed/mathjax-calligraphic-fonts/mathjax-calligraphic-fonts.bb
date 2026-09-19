SUMMARY = "Fonts used by MathJax to display math in the browser"
DESCRIPTION = "Fonts used by MathJax to display math in the browser."
LICENSE = "OFL-1.1"

PV = "3.2.2"

RPM_NAME = "mathjax-calligraphic-fonts-3.2.2-1.6.noarch.rpm"
RPM_HASH = "d2cfa0306b52857d446d1b8c6042736007912e0591ab819e6e2e34ae8f1320f33c1b1ecb8f5cdc84f0ab39681d1535cb825066147305d2345659d94788fd0acb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mathjax-calligraphic-fonts"

RDEPENDS:${PN} += ""

inherit rpm
