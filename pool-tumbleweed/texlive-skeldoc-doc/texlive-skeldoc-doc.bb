SUMMARY = "Documentation for texlive-skeldoc"
DESCRIPTION = "This package includes the documentation for texlive-skeldoc"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.3svn76924"

RPM_NAME = "texlive-skeldoc-doc-2026.226.0.0.1.3svn76924-64.2.noarch.rpm"
RPM_HASH = "e231e996723bd846e872d65c0d46acb46e821d8d6fb8e7d45a427129c95088cab92ea6eac2bca8fd4eaa70ce31b1e76732d7fe1035761b7819b003d1b3f09fcb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-skeldoc-doc"

RDEPENDS:${PN} += ""

inherit rpm
