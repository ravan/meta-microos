SUMMARY = "Documentation for texlive-handoutwithnotes"
DESCRIPTION = "This package includes the documentation for texlive-handoutwithnotes"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn76924"

RPM_NAME = "texlive-handoutwithnotes-doc-2026.226.1.3svn76924-60.4.noarch.rpm"
RPM_HASH = "9b016202567ebb81bf92e77a4cda3033805179195663fa0392dd470ddce13dff1c8c29dd5b44ad4a1b91d1264fdd3f2d0136906d85a2797ad64c76699d774cae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-handoutwithnotes-doc"

RDEPENDS:${PN} += ""

inherit rpm
