SUMMARY = "Documentation for texlive-pspicture"
DESCRIPTION = "This package includes the documentation for texlive-pspicture"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-pspicture-doc-2026.226.svn15878-59.2.noarch.rpm"
RPM_HASH = "e3eeb8a764010e338a84e3bb2ab0a232eaaf45a9e2e689c883adb84f22efacc8a0119841f853763de85d0f3a30f9f25ff9bc547fa1dff0cf369088bc7ff3a96c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pspicture-doc"

RDEPENDS:${PN} += ""

inherit rpm
