SUMMARY = "Documentation for texlive-repeatindex"
DESCRIPTION = "This package includes the documentation for texlive-repeatindex"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.01svn77682"

RPM_NAME = "texlive-repeatindex-doc-2026.226.0.0.01svn77682-60.4.noarch.rpm"
RPM_HASH = "34c7c99a9c5295b1fd6890f05a11666323239cb3454eb79a1d6d080b8b7e8d2bc1b16b0109a73b6d471c0fd0b09889135fd9cdba7676d16f882fff6502f750d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-repeatindex-doc"

RDEPENDS:${PN} += ""

inherit rpm
