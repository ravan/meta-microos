SUMMARY = "LaTeX style file axodraw4j.sty for documents generated with jaxodraw"
DESCRIPTION = "This package contains the LaTeX style file that is needed for EPS export \
functionality in jaxodraw. \
 \
You need this if you want the export to EPS function to work or if you want to \
compile LaTeX files generated with jaxodraw."
LICENSE = "LPPL-1.3c"

PV = "2.1.0"

RPM_NAME = "jaxodraw-latex-2.1.0-7.10.noarch.rpm"
RPM_HASH = "e6842e3f0896a7474a36a234ad93ce14b1960949752839748c0a507e2ec8ca05528c3687e80f58e0aac54441049eaf8e1bfe0483f25041c2485b2e2cc7735460"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jaxodraw-latex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
jaxodraw \
tex-latex \
texlive \
texlive-pst-tools"

inherit rpm
