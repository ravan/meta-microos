SUMMARY = "Documentation for texlive-versonotes"
DESCRIPTION = "This package includes the documentation for texlive-versonotes"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5svn77682"

RPM_NAME = "texlive-versonotes-doc-2026.226.0.0.5svn77682-60.2.noarch.rpm"
RPM_HASH = "79aaa313e1fd8e5306e70bee7d749c38c0fab0ced19767f11b0baf1e2df6120c8db9ae847f6ebeeaac9b61a935929027b0311ca1499ae4cfcccab69587612ef4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-versonotes-doc"

RDEPENDS:${PN} += ""

inherit rpm
