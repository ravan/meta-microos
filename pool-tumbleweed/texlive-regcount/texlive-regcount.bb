SUMMARY = "Display the allocation status of the TeX registers"
DESCRIPTION = "Adds a macro \\rgcounts which displays the allocation status of \
the TeX registers. The display is written into the .log file as \
it is a bit verbose. An automatic call to \\rgcounts is done at \
\\begin{document} and \\end{document}."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn19979"

RPM_NAME = "texlive-regcount-2026.226.1.0svn19979-60.4.noarch.rpm"
RPM_HASH = "accabebe465e631c195cc742923ee75aebf418b14e8a23988491c174c0c0abc1311d92927d232afe57b39efa185ca7cc742d84ace57e3b5e8e442a06cb9a6dc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-regcount.sty \
texlive-regcount"

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
