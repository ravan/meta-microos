SUMMARY = "FOP plug-in for jlatexmath"
DESCRIPTION = "This package contains the FOP plug-in for jlatexmath."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.3"

RPM_NAME = "jlatexmath-fop-1.0.3-7.8.noarch.rpm"
RPM_HASH = "36b1d959d57d1fe6621566f0d2ce5549958b0d4d5c7886d827cd0dd45f31832fbda9d4ffa54d790b402c8de6af64b5763c20009ef863933d603ef3ffd1343287"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jlatexmath-fop"

RDEPENDS:${PN} += "javapackages-tools \
jlatexmath \
xmlgraphics-fop"

inherit rpm
