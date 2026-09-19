SUMMARY = "Documentation for texlive-witharrows"
DESCRIPTION = "This package includes the documentation for texlive-witharrows"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.9asvn77682"

RPM_NAME = "texlive-witharrows-doc-2026.226.2.9asvn77682-60.2.noarch.rpm"
RPM_HASH = "cfbe9e2eb4465b6762172cf9c08a6fb3dd7e43968b94627d5d6ac055aefbac3a254e97c17e3c28444f65593204241b9f9709ace182e5d324cc2119f7cb538788"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-witharrows-doc-fr \
texlive-witharrows-doc"

RDEPENDS:${PN} += ""

inherit rpm
