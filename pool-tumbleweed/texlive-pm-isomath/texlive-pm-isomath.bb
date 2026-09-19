SUMMARY = "Poor man ISO math for pdfLaTeX users"
DESCRIPTION = "This small package realizes a poor man approximation of the ISO \
regulations for physical sciences and technology. Contrary to \
other more elegant solutions, it does not load any math \
alphabet, since pdfLaTeX can use only a maximum of such \
alphabets. The necessary user macros are defined for \
typesetting common math symbols that require special ISO \
treatment."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.00svn76924"

RPM_NAME = "texlive-pm-isomath-2026.226.1.2.00svn76924-59.2.noarch.rpm"
RPM_HASH = "c0f2c99d3b6d37fd0c20d11be2083b46deda3fb8a5ef1d65139a9302943df09773dfa83e71b6756278f1dd170f1fc20f9a76ebf55d365ac93b4f5f29914b5687"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pm-isomath.sty \
texlive-pm-isomath"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-alphabeta.sty \
tex-amsmath.sty \
tex-etoolbox.sty \
tex-iftex.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
