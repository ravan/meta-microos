SUMMARY = "Documentation for texlive-xmeaning"
DESCRIPTION = "This package includes the documentation for texlive-xmeaning"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.0svn77128"

RPM_NAME = "texlive-xmeaning-doc-2026.226.0.0.1.0svn77128-59.4.noarch.rpm"
RPM_HASH = "df118db0cb57f9625ac6530d9630632aae77907c4c89a3269cb5ae41f2cfce20e3363be9634304bcb94c6436f13d8cfc76a5965f395971ea7b0b179fc968c1c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xmeaning-doc"

RDEPENDS:${PN} += ""

inherit rpm
