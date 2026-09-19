SUMMARY = "Fonts used by MathJax to display math in the browser"
DESCRIPTION = "Fonts used by MathJax to display math in the browser."
LICENSE = "OFL-1.1"

PV = "3.2.2"

RPM_NAME = "mathjax-size3-fonts-3.2.2-1.6.noarch.rpm"
RPM_HASH = "bbe7e1bc51d0c08da86d49ff582732c5ec647bfe543fc58b439835c9574b0b21325834763d3be1403b91fcb9910dab2672f116a7927e4d3e432041a33ddd3ebf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mathjax-size3-fonts"

RDEPENDS:${PN} += ""

inherit rpm
