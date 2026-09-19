SUMMARY = "Support of Qualitative Data Analysis"
DESCRIPTION = "The package is for use in Qualitative Data Analysis research. \
It supports the integration of Qualitative Data Analysis (QDA) \
research tasks, specifically for Grounded Theory, into the \
LaTeX work flow. It assists in the analysis of textual data \
such as interview transcripts and field notes by providing the \
LaTeX user with macros which are used to markup textual \
information -- for example, in-depth interviews."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn26313"

RPM_NAME = "texlive-ulqda-2026.226.1.1svn26313-60.2.noarch.rpm"
RPM_HASH = "b6a336532d811fd0cd52648bd3619880a2a73bd6e93b3cfc8a7c6808f73891c75c9f7cfe5df2634328f6802eaefb9cd3a19da0d456415afa25ee28d332bb8aa4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ulqda.sty \
texlive-ulqda"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Digest--SHA1 \
perl-Getopt--Long \
sed \
tex-dot2texi.sty \
tex-multicol.sty \
tex-soul.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-ulqda-bin"

inherit rpm
