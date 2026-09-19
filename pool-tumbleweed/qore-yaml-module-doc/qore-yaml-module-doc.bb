SUMMARY = "Documentation and examples for the Qore yaml module"
DESCRIPTION = "This package contains the HTML documentation and example programs for the Qore \
yaml module."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later | MIT"

PV = "1.0.0"

RPM_NAME = "qore-yaml-module-doc-1.0.0-1.5.noarch.rpm"
RPM_HASH = "88d4d31eaed041423c4ec910af73639a6dcff080f890fb2e98c9ffd67dd4ee6dfcb9adf8f2a77d65c17615051febca6282e1d420f7cd76b804cebdcb78c196eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qore-yaml-module-doc"

RDEPENDS:${PN} += ""

inherit rpm
