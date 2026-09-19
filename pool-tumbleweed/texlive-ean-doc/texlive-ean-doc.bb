SUMMARY = "Documentation for texlive-ean"
DESCRIPTION = "This package includes the documentation for texlive-ean"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn20851"

RPM_NAME = "texlive-ean-doc-2026.226.svn20851-61.4.noarch.rpm"
RPM_HASH = "29a13237b83728653e748360031668880e0586e6b27d06ef8ed395b45304e7665135814c2fa28f84082d461babf04afbdb24609997e614f0906bc7424ec09e40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ean-doc"

RDEPENDS:${PN} += ""

inherit rpm
