SUMMARY = "Documentation for texlive-dyntree"
DESCRIPTION = "This package includes the documentation for texlive-dyntree"
LICENSE = "LGPL-2.1-or-later"

PV = "2026.226.1.0svn67016"

RPM_NAME = "texlive-dyntree-doc-2026.226.1.0svn67016-61.4.noarch.rpm"
RPM_HASH = "fdce6541cc7656711e935b726898da2622a5763ff584d8d427e989d3f1eb9e0aad316ab3f4a225e78a467b789ec0ada52907259a0e0bb22ddb8f70be73e6abab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dyntree-doc"

RDEPENDS:${PN} += ""

inherit rpm
