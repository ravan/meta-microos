SUMMARY = "Documentation for texlive-xpunctuate"
DESCRIPTION = "This package includes the documentation for texlive-xpunctuate"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn67918"

RPM_NAME = "texlive-xpunctuate-doc-2026.226.2.0svn67918-59.4.noarch.rpm"
RPM_HASH = "5d6ad0d1a7a748aa8f9461dc3745fe640ac06a24c81e58f9a4af1065c94df9336f3afd812a56bcb1a64831da6926a4c8166518d23c1561189987d456c2a8c687"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xpunctuate-doc"

RDEPENDS:${PN} += ""

inherit rpm
