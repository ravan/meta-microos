SUMMARY = "Documentation for texlive-errata"
DESCRIPTION = "This package includes the documentation for texlive-errata"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn42428"

RPM_NAME = "texlive-errata-doc-2026.226.0.0.3svn42428-61.4.noarch.rpm"
RPM_HASH = "e01de0305844daa307d02dcf802904b59018db2c36639a186280193d4e0462a20368e565c9282fbbb538af6d35f5b12ec118a06cf738d70290937073436c38d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-errata-doc"

RDEPENDS:${PN} += ""

inherit rpm
