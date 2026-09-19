SUMMARY = "Fonts used by MathJax to display math in the browser"
DESCRIPTION = "Fonts used by MathJax to display math in the browser."
LICENSE = "OFL-1.1"

PV = "3.2.2"

RPM_NAME = "mathjax-sansserif-fonts-3.2.2-1.6.noarch.rpm"
RPM_HASH = "16d989177e02dba6bd985963a35f04f0c6d2deb24321c3a12d40920e307cf0f614c16847bbc8e9d7501bb07c2e24315af3e71be838412861d81e4d8a13ee9066"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mathjax-sansserif-fonts"

RDEPENDS:${PN} += ""

inherit rpm
