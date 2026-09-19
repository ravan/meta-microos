SUMMARY = "Documentation for texlive-letterswitharrows"
DESCRIPTION = "This package includes the documentation for texlive-letterswitharrows"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-letterswitharrows-doc-2026.226.svn77682-61.2.noarch.rpm"
RPM_HASH = "68df0b15560bb30375c24cea92804f984c6c5e63c704cbc9943d1e5188917edc759362c46f0bb651f6b3b218d44b958586f9659f92395ce27341707ced2113bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-letterswitharrows-doc"

RDEPENDS:${PN} += ""

inherit rpm
