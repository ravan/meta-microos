SUMMARY = "E-TeX showbox facilities for exploration purposes"
DESCRIPTION = "The command \\logbox does \\showbox without stopping the \
compilation. The package's main command is \\viewbox*: the box \
is typeset (copied) with its dimensions, and its contents are \
logged in the .log file."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn24499"

RPM_NAME = "texlive-logbox-2026.226.1.0svn24499-61.2.noarch.rpm"
RPM_HASH = "793c026c47ce2ea843a4aa2ff83076dee0f5cd1d9d2b4c687b92b7370ac111d1acb233486786a259943252c7ceb5bb8c28b083639a9c06c1f93c9f83c2afcd85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-logbox.sty \
texlive-logbox"

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
