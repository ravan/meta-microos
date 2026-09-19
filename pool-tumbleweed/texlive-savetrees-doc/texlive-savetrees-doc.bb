SUMMARY = "Documentation for texlive-savetrees"
DESCRIPTION = "This package includes the documentation for texlive-savetrees"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.4svn77682"

RPM_NAME = "texlive-savetrees-doc-2026.226.2.4svn77682-60.2.noarch.rpm"
RPM_HASH = "46997726b18e466c9c6e5d61db5a96b53d63b3b0c7d548c926ca013d0b2bae9d703d08733b052b27f99c861ba9c7d54f98e08867d1a159ccf177572031a80b7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-savetrees-doc"

RDEPENDS:${PN} += ""

inherit rpm
