SUMMARY = "Documentation for texlive-multibib"
DESCRIPTION = "This package includes the documentation for texlive-multibib"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn77682"

RPM_NAME = "texlive-multibib-doc-2026.226.1.4svn77682-61.2.noarch.rpm"
RPM_HASH = "2b6dbb5717d30e41b24864a3794544eb46d122823f469b4834cfedefdbacd3353a8a449cd1ca241f54bc903c23d2353d9152bf948e5ff6def3bd14ca03f5b070"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-multibib-doc"

RDEPENDS:${PN} += ""

inherit rpm
