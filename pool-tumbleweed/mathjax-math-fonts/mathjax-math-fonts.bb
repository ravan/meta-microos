SUMMARY = "Fonts used by MathJax to display math in the browser"
DESCRIPTION = "Fonts used by MathJax to display math in the browser."
LICENSE = "OFL-1.1"

PV = "3.2.2"

RPM_NAME = "mathjax-math-fonts-3.2.2-1.6.noarch.rpm"
RPM_HASH = "71cdf780b7af3158113ffac64bd9b51351d789b971997b8acb5817316f3a6c8c6baa138304b8d7ac54cfd286dfd6a8f6a989ddea8df2e9a30e0147c69dc14610"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mathjax-math-fonts"

RDEPENDS:${PN} += ""

inherit rpm
