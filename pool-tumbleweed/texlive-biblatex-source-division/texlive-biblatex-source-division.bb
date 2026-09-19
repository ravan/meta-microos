SUMMARY = "References by 'division' in classical sources"
DESCRIPTION = "The package enables the user to make reference to 'division \
marks' (such as book, chapter, section), in the document being \
referenced, in addition to the page-based references that \
BibTeX-based citations have always had. The citation is made in \
the same way as the LaTeX standard, but what's inside the \
square brackets may include the 'division' specification, as in \
\\cite[(<division spec.>)<page number>]{<document>}"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.4.2svn76790"

RPM_NAME = "texlive-biblatex-source-division-2026.226.2.4.2svn76790-61.2.noarch.rpm"
RPM_HASH = "9638f308d84489d55de5318163d011e47d23d1f169f553215b8fe7c46234ec11bc96698dfcfc498263cd9d5940b8524499809c6a1a97680c93649100f9352e53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-biblatex-source-division.sty \
texlive-biblatex-source-division"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
