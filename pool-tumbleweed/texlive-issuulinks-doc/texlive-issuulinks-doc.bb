SUMMARY = "Documentation for texlive-issuulinks"
DESCRIPTION = "This package includes the documentation for texlive-issuulinks"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn25742"

RPM_NAME = "texlive-issuulinks-doc-2026.226.1.1svn25742-63.2.noarch.rpm"
RPM_HASH = "315279df3ce2aeeba2dfacf738ae07f6b8e9d8468c64cdd6f794d23510ccb424fcd84d6527711797d1c7c5400f76fc6e57c2364f7a9607bec4a83ccc397f0bcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-issuulinks-doc"

RDEPENDS:${PN} += ""

inherit rpm
