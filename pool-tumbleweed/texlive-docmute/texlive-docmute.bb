SUMMARY = "Input files ignoring LaTeX preamble, etcetera"
DESCRIPTION = "Input or include stand-alone LaTeX documents, ignoring \
everything but the material between \\begin{document} and \
\\end{document}."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn78101"

RPM_NAME = "texlive-docmute-2026.226.1.4svn78101-59.2.noarch.rpm"
RPM_HASH = "1f4543132dbde02a6e8ca2cd9c17963915bbd6c9f57e011e1b7589a41eb2f54f54a0412993e01e66f679c988df0034e622406aa1f3818356d2af6a1dc4c7c778"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-docmute.sty \
texlive-docmute"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
