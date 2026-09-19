SUMMARY = "Documentation for texlive-novabeamer-theme"
DESCRIPTION = "This package includes the documentation for texlive-novabeamer-theme"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn76924"

RPM_NAME = "texlive-novabeamer-theme-doc-2026.226.1.0svn76924-61.2.noarch.rpm"
RPM_HASH = "6c280eef780bca8f5f03f44fa2b48c0af9986c3f76a68885c2f89da663d35633240726c10e8c84ee420b01b79b5389ddf246a867c1b6b37867efbc0768af1363"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-novabeamer-theme-doc"

RDEPENDS:${PN} += ""

inherit rpm
