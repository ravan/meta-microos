SUMMARY = "Documentation for texlive-match_parens"
DESCRIPTION = "This package includes the documentation for texlive-match_parens"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.45svn76442"

RPM_NAME = "texlive-match_parens-doc-2026.226.1.45svn76442-59.2.noarch.rpm"
RPM_HASH = "63ed760c6d9d9609c2f1eb4534ba4fbe17227e338114561df1ba5d7c1b6a79d85442c50e9f28f7c53fc467494fd62ec04eed423bd7ce95093d9a48ad7165385a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-match-parens.1 \
texlive-match-parens-doc"

RDEPENDS:${PN} += ""

inherit rpm
