SUMMARY = "Documentation for texlive-ellipsis"
DESCRIPTION = "This package includes the documentation for texlive-ellipsis"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.8svn77682"

RPM_NAME = "texlive-ellipsis-doc-2026.226.1.8svn77682-61.4.noarch.rpm"
RPM_HASH = "df4792514b36241742a1d4988c385cda19b49d6f1fba8aead6d470d7fadddca79e7067cdeabd163a11fbaa70c846ec47e9e3b02d3804f9092a549717d4081500"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ellipsis-doc"

RDEPENDS:${PN} += ""

inherit rpm
