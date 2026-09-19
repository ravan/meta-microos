SUMMARY = "Fonts used by MathJax to display math in the browser"
DESCRIPTION = "Fonts used by MathJax to display math in the browser."
LICENSE = "OFL-1.1"

PV = "3.2.2"

RPM_NAME = "mathjax-zero-fonts-3.2.2-1.6.noarch.rpm"
RPM_HASH = "cb1826fc22737427f779ced65fff814fc11f53c3f3f291081bfb6f41cee83d77478d2c06f8adf95c836c32ec11118142fd87dd2a60159769d56360b0ccd387c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mathjax-zero-fonts"

RDEPENDS:${PN} += ""

inherit rpm
