SUMMARY = "Documentation for texlive-leadsheets"
DESCRIPTION = "This package includes the documentation for texlive-leadsheets"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.7svn61504"

RPM_NAME = "texlive-leadsheets-doc-2026.226.0.0.7svn61504-61.2.noarch.rpm"
RPM_HASH = "7903d6b0ecf53e956a3943dc4f4a8adefee2796ed22e6d9bbf364b5372104b8312267df3048882d4e89e277b6c7f4edaea388b1c39c5963556b661ab3e718298"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-leadsheets-doc"

RDEPENDS:${PN} += ""

inherit rpm
