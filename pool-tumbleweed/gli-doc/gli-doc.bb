SUMMARY = "Documentation for GLI library"
DESCRIPTION = "This package provides the documentation for GLI library."
LICENSE = "GPL-2.0-only & MIT"

PV = "0.8.2.0"

RPM_NAME = "gli-doc-0.8.2.0-6.5.noarch.rpm"
RPM_HASH = "58623aa106f20b22c9bc7ddc0c1f41e22f2901ee80147d8d13d3d419011811460ddac132371e183eb82d1f0058045e55b11b87be505aa7602efba3d900adfc33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gli-doc"

RDEPENDS:${PN} += ""

inherit rpm
