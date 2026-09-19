SUMMARY = "Documentation and examples for QCustomPlot"
DESCRIPTION = "This package contains the documentation and examples for QCustomPlot."
LICENSE = "GPL-3.0-or-later"

PV = "2.1.1"

RPM_NAME = "qcustomplot-doc-2.1.1-5.5.noarch.rpm"
RPM_HASH = "176d68c0589866b735954004959d212c0387d846f3a30ebc8b3f37680f49655908c1e9e65ebbbef15f1901220902f08e79fc2f1f2bab3c53a626641d7f8c3d51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qcustomplot-doc"

RDEPENDS:${PN} += ""

inherit rpm
