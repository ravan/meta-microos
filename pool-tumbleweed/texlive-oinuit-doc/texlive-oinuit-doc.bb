SUMMARY = "Documentation for texlive-oinuit"
DESCRIPTION = "This package includes the documentation for texlive-oinuit"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn28668"

RPM_NAME = "texlive-oinuit-doc-2026.226.svn28668-61.2.noarch.rpm"
RPM_HASH = "6c72b639f950a9f278150762b262b9366cda9cf5aaca33feb431c8b61529a778d8ed859cc8d7109ce66c9d06181166792b61cf3f45b4b5fd15fe35c8aaead4e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-oinuit-doc"

RDEPENDS:${PN} += ""

inherit rpm
