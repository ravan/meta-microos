SUMMARY = "Documentation for texlive-braids"
DESCRIPTION = "This package includes the documentation for texlive-braids"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.3svn76924"

RPM_NAME = "texlive-braids-doc-2026.226.2.3svn76924-59.2.noarch.rpm"
RPM_HASH = "a5970c46afe4ac602a364f263a15dfd371517c6eae9b6b1dd043ba3e824d854dd37da5372b2bd6b22aea5ceea7b9ebdb32957bde075e10d447c69f793438b252"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-braids-doc"

RDEPENDS:${PN} += ""

inherit rpm
