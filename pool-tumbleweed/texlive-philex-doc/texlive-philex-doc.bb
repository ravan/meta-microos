SUMMARY = "Documentation for texlive-philex"
DESCRIPTION = "This package includes the documentation for texlive-philex"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn36396"

RPM_NAME = "texlive-philex-doc-2026.226.1.3svn36396-58.2.noarch.rpm"
RPM_HASH = "27b809f3b437c0d87812be989e7a704596c9a9e2271778ad657950afd716ca569bfc70d7dc5a0a6a94f1da4a0f4e0527d04e6d15d32d561b616392131a19fd30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-philex-doc"

RDEPENDS:${PN} += ""

inherit rpm
