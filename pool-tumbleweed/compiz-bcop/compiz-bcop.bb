SUMMARY = "Compiz option code generator"
DESCRIPTION = "Compiz option code generator needed to build some plugins."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.18"

RPM_NAME = "compiz-bcop-0.8.18-1.17.noarch.rpm"
RPM_HASH = "3736cf52de66cdc93f057545a1b9526348c61eaf046cf9efabaa7ee2e7a68b33f3d5f65f215559061d3ae774951ce583a6473be7e21ce3b8526130d54ee62538"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "compiz-bcop \
compiz-bcop-devel \
pkgconfig-bcop"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/pkg-config \
xsltproc"

inherit rpm
