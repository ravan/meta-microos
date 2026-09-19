SUMMARY = "Documentation for texlive-fhj-script"
DESCRIPTION = "This package includes the documentation for texlive-fhj-script"
LICENSE = "LPPL-1.0"

PV = "2026.226.4.2csvn78168"

RPM_NAME = "texlive-fhj-script-doc-2026.226.4.2csvn78168-59.2.noarch.rpm"
RPM_HASH = "071ae1c89115203cf53a1cd152aabb1484b991cd284acea15d1cdc24b69edd5d8578da973ce2d9394bcbb6afa0947829e069df9d0c66d2dbb69430bb26897f64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fhj-script-doc"

RDEPENDS:${PN} += ""

inherit rpm
