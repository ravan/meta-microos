SUMMARY = "Documentation for texlive-multifootnote"
DESCRIPTION = "This package includes the documentation for texlive-multifootnote"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn70745"

RPM_NAME = "texlive-multifootnote-doc-2026.226.svn70745-61.2.noarch.rpm"
RPM_HASH = "645e77c3614630ceee6ce9899882badb7c649538af9453aeae783a4e0f7bb3269fc24636e3f00ec63a7b1da47ea72437a6c753b8600973187876b05d476cd226"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-multifootnote-doc"

RDEPENDS:${PN} += ""

inherit rpm
