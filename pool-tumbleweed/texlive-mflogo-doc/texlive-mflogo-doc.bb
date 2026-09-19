SUMMARY = "Documentation for texlive-mflogo"
DESCRIPTION = "This package includes the documentation for texlive-mflogo"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn77682"

RPM_NAME = "texlive-mflogo-doc-2026.226.2.0svn77682-61.2.noarch.rpm"
RPM_HASH = "ecd6dcd88f354570f8bb2f2eb1ba1688f1ef4b38003e941f407e2ac36d865a526ae44a139967613baeef258283fb23f2f80fbcf27c7efc7bed7d36029b7388fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mflogo-doc"

RDEPENDS:${PN} += ""

inherit rpm
