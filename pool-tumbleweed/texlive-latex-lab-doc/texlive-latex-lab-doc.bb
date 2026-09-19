SUMMARY = "Documentation for texlive-latex-lab"
DESCRIPTION = "This package includes the documentation for texlive-latex-lab"
LICENSE = "LPPL-1.0"

PV = "2026.226.20251101asvn76739"

RPM_NAME = "texlive-latex-lab-doc-2026.226.20251101asvn76739-63.2.noarch.rpm"
RPM_HASH = "dab2b0e864d6de94604935dab7e9a94eef6026850c4e177b440e69c1029b2b51b17ec0e9c355e9971fd57949aba1b6b14d52a907dafbf3b87e092b47268c68a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex-lab-doc"

RDEPENDS:${PN} += ""

inherit rpm
