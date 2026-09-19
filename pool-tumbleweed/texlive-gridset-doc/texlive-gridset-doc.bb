SUMMARY = "Documentation for texlive-gridset"
DESCRIPTION = "This package includes the documentation for texlive-gridset"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4svn77682"

RPM_NAME = "texlive-gridset-doc-2026.226.0.0.4svn77682-60.4.noarch.rpm"
RPM_HASH = "044f5217a99191009fc66b84a244cc410da4800c21eb54f08f74f107c9d759af9e991d66b3cfe2bb4a8a26899603640beee6f8d7e669217afd6f72e87c78f151"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gridset-doc"

RDEPENDS:${PN} += ""

inherit rpm
