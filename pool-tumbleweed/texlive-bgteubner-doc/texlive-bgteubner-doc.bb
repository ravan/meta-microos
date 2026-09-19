SUMMARY = "Documentation for texlive-bgteubner"
DESCRIPTION = "This package includes the documentation for texlive-bgteubner"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.11svn54080"

RPM_NAME = "texlive-bgteubner-doc-2026.226.2.11svn54080-61.2.noarch.rpm"
RPM_HASH = "a90240eb7fca387d4892b997ca583fc6dc695a22a4070a9d577257eb0221cf579e1a6a1c3a534dc62a7bc5cdb27c0eb8936349a01cec76917f857fca8dee1626"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-bgteubner-doc-de \
texlive-bgteubner-doc"

RDEPENDS:${PN} += ""

inherit rpm
