SUMMARY = "Documentation for texlive-shobhika"
DESCRIPTION = "This package includes the documentation for texlive-shobhika"
LICENSE = "OFL-1.1"

PV = "2026.226.1.05svn50555"

RPM_NAME = "texlive-shobhika-doc-2026.226.1.05svn50555-60.2.noarch.rpm"
RPM_HASH = "c0321b369adca0fb2792259d70a02b8f494f6e35b05e3a4ffb961d1a8030407b938b158d40c86ce565599369b93f6ae3fa2aa267fe4318a349a935c82004f796"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-shobhika-doc"

RDEPENDS:${PN} += ""

inherit rpm
