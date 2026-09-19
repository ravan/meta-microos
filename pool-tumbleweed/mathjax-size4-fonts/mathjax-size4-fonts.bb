SUMMARY = "Fonts used by MathJax to display math in the browser"
DESCRIPTION = "Fonts used by MathJax to display math in the browser."
LICENSE = "OFL-1.1"

PV = "3.2.2"

RPM_NAME = "mathjax-size4-fonts-3.2.2-1.6.noarch.rpm"
RPM_HASH = "40076dbf50fd1369b2da049474dd7bda3a607cd9c02fe20b39fb0655aaf8e98fdaea4f31d5564cf78954d7e41570540d1171ad0ddd7ce9cdb0f7fd9836ea702e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mathjax-size4-fonts"

RDEPENDS:${PN} += ""

inherit rpm
