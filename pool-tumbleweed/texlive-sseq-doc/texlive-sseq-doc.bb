SUMMARY = "Documentation for texlive-sseq"
DESCRIPTION = "This package includes the documentation for texlive-sseq"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.01svn31585"

RPM_NAME = "texlive-sseq-doc-2026.226.2.01svn31585-64.2.noarch.rpm"
RPM_HASH = "dac286f8f42489ca2dc092bfbf84dc8086833b431e2c79b909c6350affa561ea61bacfe9173245a9a53d30e872e1ddd64647514e2777ffd40df94fcc9614e68e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sseq-doc"

RDEPENDS:${PN} += ""

inherit rpm
