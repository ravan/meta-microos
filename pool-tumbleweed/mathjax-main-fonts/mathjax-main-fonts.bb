SUMMARY = "Fonts used by MathJax to display math in the browser"
DESCRIPTION = "Fonts used by MathJax to display math in the browser."
LICENSE = "OFL-1.1"

PV = "3.2.2"

RPM_NAME = "mathjax-main-fonts-3.2.2-1.6.noarch.rpm"
RPM_HASH = "d80b58fc7bfc463c41c893bccb540ab1df4f938dfe3bcae24bb8ab7b1f9cbe5ab450b5ceeee9055c666ebe4fd6d1138542ef0648356a445cbc46a41c0d85c96d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mathjax-main-fonts"

RDEPENDS:${PN} += ""

inherit rpm
