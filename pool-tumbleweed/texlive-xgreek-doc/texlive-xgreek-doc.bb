SUMMARY = "Documentation for texlive-xgreek"
DESCRIPTION = "This package includes the documentation for texlive-xgreek"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.5.0svn77682"

RPM_NAME = "texlive-xgreek-doc-2026.226.3.5.0svn77682-59.4.noarch.rpm"
RPM_HASH = "196f227598e0999675580f39774441f6a3865ed5ea8bdc4130ff9f9814975a8c0badba599dfe81cd7ef01312adf37e6539dc894d93e73dd7d9056f560d2075ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xgreek-doc"

RDEPENDS:${PN} += ""

inherit rpm
