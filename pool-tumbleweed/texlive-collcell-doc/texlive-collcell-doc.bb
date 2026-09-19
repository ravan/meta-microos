SUMMARY = "Documentation for texlive-collcell"
DESCRIPTION = "This package includes the documentation for texlive-collcell"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.6svn77682"

RPM_NAME = "texlive-collcell-doc-2026.226.0.0.6svn77682-60.2.noarch.rpm"
RPM_HASH = "518279b3c4af5c288ddb40d504e615a9f9fed07dbf5800f1f11c91efad3e3cd9bfd27b1b7681912fc87b5c118fc48b3bb1fe47f27ea68435a83ac5b65b65e5d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-collcell-doc"

RDEPENDS:${PN} += ""

inherit rpm
