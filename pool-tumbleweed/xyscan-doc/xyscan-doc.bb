SUMMARY = "Documentation for xyscan"
DESCRIPTION = "xyscan is a tool for scientists in need of extracting data points, \
i.e. numeric values, from a plot. \
 \
This package contains the documentation and help files for xyscan."
LICENSE = "GPL-3.0-or-later"

PV = "4.68"

RPM_NAME = "xyscan-doc-4.68-1.3.noarch.rpm"
RPM_HASH = "9ea5d84ce7fac27f943149dfb830f5eb92ba5164daa7b25529e201c94b2bd5c9e162fc977bd2076fd037a66dec31005193f5cc67cf2f59c07528a04fec07eb92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xyscan-doc"

RDEPENDS:${PN} += "xyscan"

inherit rpm
