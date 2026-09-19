SUMMARY = "Documents package for opencsg"
DESCRIPTION = "This package contains the documentation for opencsg."
LICENSE = "GPL-2.0-or-later"

PV = "1.8.2"

RPM_NAME = "opencsg-doc-1.8.2-1.3.noarch.rpm"
RPM_HASH = "2c172110adbc620df2ccdd1f1758f73ff9828185c78e0b1fa67abe4b23dda198b5902dc58f5fc92f4c23ba1e96da12706b5af68f7c6b1da56f2748d0c28012c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "opencsg-doc"

RDEPENDS:${PN} += ""

inherit rpm
