SUMMARY = "Documentation for texlive-etsvthor"
DESCRIPTION = "This package includes the documentation for texlive-etsvthor"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn48186"

RPM_NAME = "texlive-etsvthor-doc-2026.226.1.0svn48186-59.2.noarch.rpm"
RPM_HASH = "f6b8ea534f2d36cfa2576f5b97756ccab5882f809a0c84b6b271e7faec527529881de206e25bcb8b362e9a551391a1a4eeb20414ed95b8e8e52679e888879d2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-etsvthor-doc"

RDEPENDS:${PN} += ""

inherit rpm
