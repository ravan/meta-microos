SUMMARY = "Documentation for texlive-timing-diagrams"
DESCRIPTION = "This package includes the documentation for texlive-timing-diagrams"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn31491"

RPM_NAME = "texlive-timing-diagrams-doc-2026.226.svn31491-59.2.noarch.rpm"
RPM_HASH = "2178ff1b8e0c0fcd0dd540a0b318d36ba28ee669c79223df2af0e19daedc53cef1824fe85905e64f2a21f96d13237e2034470e613c3c57dae60975edcab64a7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-timing-diagrams-doc"

RDEPENDS:${PN} += ""

inherit rpm
