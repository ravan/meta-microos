SUMMARY = "Management of figures for large LaTeX documents"
DESCRIPTION = "Fig4LaTeX simplifies management of the figures in a large LaTeX \
document. Fig4LaTeX is appropriate for projects that include \
figures with graphics created by XFig -- in particular, \
graphics which use the combined PS/LaTeX (or PDF/LaTeX) export \
method. An example document (with its output) is provided."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.2svn26313"

RPM_NAME = "texlive-fig4latex-2026.226.0.0.2svn26313-59.2.noarch.rpm"
RPM_HASH = "fa8a01fde0955d1516d4770e4629a128bc6f9c41149a531039249f6a3f9349615efe5c1e110edc2c16fc76cfdf1a9444d9e72ecce251bbd846b01a53e87ac505"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fig4latex"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-fig4latex-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
