SUMMARY = "Documentation for molsketch"
DESCRIPTION = "2D molecular structures editor. \
 \
Help documentation for molsketch."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.4"

RPM_NAME = "molsketch-doc-0.8.4-1.1.noarch.rpm"
RPM_HASH = "3486e7775a323b772d2e1ce74eb43a8db8aaf02ef7330bb25154586e903d0f6985b5f3386da51d0dd8ae0cbb8d3f98c4c1d0201fe3bd6209de7b9f554bcc9f02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "molsketch-doc"

RDEPENDS:${PN} += ""

inherit rpm
