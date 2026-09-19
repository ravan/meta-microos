SUMMARY = "Documentation for texlive-verbments"
DESCRIPTION = "This package includes the documentation for texlive-verbments"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn23670"

RPM_NAME = "texlive-verbments-doc-2026.226.1.2svn23670-60.2.noarch.rpm"
RPM_HASH = "d7f7ae4d6c51ae24c2a74a362e162451d30ab151014a9b48e328bdea790707ca89cc195d651cb995e42840feb082325acd3c17aab92c3fd23030de0ffe6eeef5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-verbments-doc"

RDEPENDS:${PN} += ""

inherit rpm
