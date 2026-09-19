SUMMARY = "Vertex Common Theme Files"
DESCRIPTION = "Vertex is a modern theme that comes with three variants to choose \
from. The default variant with dark header-bars, a light variant, \
and a dark variant. It supports MATE, Xfce, and Cinnamon. \
 \
This package contains common files and themes for Marco, Xfwm4, and \
Cinnamon."
LICENSE = "GPL-3.0-or-later"

PV = "20170128"

RPM_NAME = "metatheme-vertex-common-20170128-3.18.noarch.rpm"
RPM_HASH = "f7ec66b853cdc7ed14d8adebf82e2dd2d2278c28ec7212e38101688bddd703605f17a790172e99e1338512f6c463b627a1b0cf1b6cc1723adcb05ee476df6f68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metatheme-vertex-common"

RDEPENDS:${PN} += ""

inherit rpm
