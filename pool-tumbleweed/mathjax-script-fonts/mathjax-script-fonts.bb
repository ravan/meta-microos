SUMMARY = "Fonts used by MathJax to display math in the browser"
DESCRIPTION = "Fonts used by MathJax to display math in the browser."
LICENSE = "OFL-1.1"

PV = "3.2.2"

RPM_NAME = "mathjax-script-fonts-3.2.2-1.6.noarch.rpm"
RPM_HASH = "95dc5d0b74ef5a87c5147cf0349ff96efb5c766bda26624affc6600958c61579c82aa34e487dafe7e22da256683beccb7a53ca00a629af60a24a93f3fe560a93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mathjax-script-fonts"

RDEPENDS:${PN} += ""

inherit rpm
