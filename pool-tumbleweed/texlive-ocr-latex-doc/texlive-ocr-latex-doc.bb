SUMMARY = "Documentation for texlive-ocr-latex"
DESCRIPTION = "This package includes the documentation for texlive-ocr-latex"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-ocr-latex-doc-2026.226.svn15878-61.2.noarch.rpm"
RPM_HASH = "3ead6f706befe4f96ae0b8fd2adb85c288f38ccebe079f6e5e81270e3c4f3a1c077b0f3e254c43082ce482d1297f0eebf13e9e58cfd709b7604f50210f63cd18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ocr-latex-doc"

RDEPENDS:${PN} += ""

inherit rpm
