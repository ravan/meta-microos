SUMMARY = "BibTeX style for the Journal of Theoretical Biology"
DESCRIPTION = "This BibTeX bibliography style is for the Journal of Molecular \
Biology and Journal of Theoretical Biology; the accompanying \
LaTeX (2.09) package is a close relative of apalike.sty in the \
BibTeX distribution; it features author-date references. The \
bibliography style has control over whether to print reference \
titles; if your database contains an article with the cite key \
'TitlesOn', and you invoke it by \\nocite{TitlesOn}, titles will \
be printed; otherwise titles will not be printed."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.21svn77682"

RPM_NAME = "texlive-jmb-2026.226.1.21svn77682-63.2.noarch.rpm"
RPM_HASH = "924f04828a418816e6c2fc80d6da2567a82268cf70eef07c906651bd2787692f4cd7e2726c43008502c20b6a812624d029b781698efcb89214a3d8fdbb1e9611"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-jmb.sty \
texlive-jmb"

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
