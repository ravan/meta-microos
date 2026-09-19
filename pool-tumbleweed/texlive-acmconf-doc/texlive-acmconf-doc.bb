SUMMARY = "Documentation for texlive-acmconf"
DESCRIPTION = "This package includes the documentation for texlive-acmconf"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn15878"

RPM_NAME = "texlive-acmconf-doc-2026.226.1.3svn15878-61.2.noarch.rpm"
RPM_HASH = "7342b1044d7be65adbee0fa160a8e95ac3dd3b41f855975b17746882a5df15d360d89408c9295e4c34f8a376aa646ad33ceaf161a9bd28bec0c99ec4b455c518"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-acmconf-doc"

RDEPENDS:${PN} += ""

inherit rpm
