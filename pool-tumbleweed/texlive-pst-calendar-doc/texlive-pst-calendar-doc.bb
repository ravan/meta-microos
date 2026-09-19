SUMMARY = "Documentation for texlive-pst-calendar"
DESCRIPTION = "This package includes the documentation for texlive-pst-calendar"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.48svn60480"

RPM_NAME = "texlive-pst-calendar-doc-2026.226.0.0.48svn60480-59.2.noarch.rpm"
RPM_HASH = "aac10786f98610656793cad432f5e00397e98f7014a32864fa15c984ce450f05c0d910e871b77fc2468c9e21f43a59c8448e2984fc987126c70fbbc624cbddad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-calendar-doc"

RDEPENDS:${PN} += ""

inherit rpm
