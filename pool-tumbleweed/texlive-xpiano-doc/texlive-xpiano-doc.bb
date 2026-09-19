SUMMARY = "Documentation for texlive-xpiano"
DESCRIPTION = "This package includes the documentation for texlive-xpiano"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77682"

RPM_NAME = "texlive-xpiano-doc-2026.226.1.0svn77682-59.4.noarch.rpm"
RPM_HASH = "41c693f8719068c87941378aa9f9ad4a8fd42edc4a6cf5a2f9bf51e03bbbef6870ebfccd5121c3c18c5997e9272867464ce8213be0e89d8114b59283d1f5099f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xpiano-doc"

RDEPENDS:${PN} += ""

inherit rpm
