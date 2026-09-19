SUMMARY = "Three output routines that extend \\plainoutput"
DESCRIPTION = "This package contains three output routines that extend \
\\plainoutput. The first adds a reporting of problematic lines, \
i.e., for widow, club, and broken lines. The second prevents \
widow lines by changing the \\vsize by one line. The third tries \
to avoid widow, club, and broken lines as much as possible for \
spreads."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.0svn75230"

RPM_NAME = "texlive-plain-widow-2026.226.1.0svn75230-58.2.noarch.rpm"
RPM_HASH = "1c3693d2e8a298280834bb21ad2a1f48244387a7bece347b0a7e7e4055cffcc76158675eef72c61fd45af1fbef76cdfba5480fd6ce46f4e83e1e6e34a03f266d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pxwmanual.tex \
tex-pxwreport.tex \
tex-pxwsingle.tex \
tex-pxwspread.tex \
texlive-plain-widow"

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
