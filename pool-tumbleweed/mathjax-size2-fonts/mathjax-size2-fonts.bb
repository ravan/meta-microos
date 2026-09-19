SUMMARY = "Fonts used by MathJax to display math in the browser"
DESCRIPTION = "Fonts used by MathJax to display math in the browser."
LICENSE = "OFL-1.1"

PV = "3.2.2"

RPM_NAME = "mathjax-size2-fonts-3.2.2-1.6.noarch.rpm"
RPM_HASH = "618b99ac750a75d105e6fbfe2ae9d8f4cda8d4c7e7a48804d239fd8baec0870b3f8c18bede1609eb40084724e6f2308a46f6b2a084a1aadc4ec1a18a6b0676ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mathjax-size2-fonts"

RDEPENDS:${PN} += ""

inherit rpm
