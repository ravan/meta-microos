SUMMARY = "Documentation for texlive-bonum-otf"
DESCRIPTION = "This package includes the documentation for texlive-bonum-otf"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.01svn77682"

RPM_NAME = "texlive-bonum-otf-doc-2026.226.0.0.01svn77682-59.2.noarch.rpm"
RPM_HASH = "6d2b24cfcd326148aa777584d6c9ea4e0764beb74b9015acbe3dbdeeee3faa5e60971983c8813a9796f48380cc4587ffa5cbe77fd2d25cc339fcb4ada5198482"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bonum-otf-doc"

RDEPENDS:${PN} += ""

inherit rpm
