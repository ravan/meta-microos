SUMMARY = "Documentation for texlive-latex-context-ppchtex"
DESCRIPTION = "This package includes the documentation for texlive-latex-context-ppchtex"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn66687"

RPM_NAME = "texlive-latex-context-ppchtex-doc-2026.226.svn66687-63.2.noarch.rpm"
RPM_HASH = "eee00fe683f31ecbc1adc27c37796e14fd9eb82f19a1fcdf7241e006145c3a561c40bc044b63631ab24737d92fdd9d04e14904d1e8d71194629c26c681baba31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex-context-ppchtex-doc"

RDEPENDS:${PN} += ""

inherit rpm
