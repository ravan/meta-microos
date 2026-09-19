SUMMARY = "Documentation for texlive-cmdtrack"
DESCRIPTION = "This package includes the documentation for texlive-cmdtrack"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78101"

RPM_NAME = "texlive-cmdtrack-doc-2026.226.svn78101-60.2.noarch.rpm"
RPM_HASH = "e62fbf138432c68168d9bbb5ed0adabd7dafcdba967ad1ce0aa9c3b0ccf8cfb43f7b32527428dda63cd29ade6a2d41f91778b55436095839fe75b09db86e61d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cmdtrack-doc"

RDEPENDS:${PN} += ""

inherit rpm
