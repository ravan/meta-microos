SUMMARY = "John Cleese's Silly Walk as page numbering style"
DESCRIPTION = "This simple LaTeX package provides John Cleese's iconic silly \
walk routine as a page numbering style. Other counters, as well \
as integers, can be typeset in this 'silly' style, too."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.7svn77682"

RPM_NAME = "texlive-sillypage-2026.226.1.7svn77682-60.2.noarch.rpm"
RPM_HASH = "d18eaa01941eff910404600cf6a8ae6f19b7eac11a96dc09ba77c401305193e2a12ce637eb66891ede9675d3912339d9e4556d477d678bc905e1e41b05687e05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sillypage.sty \
texlive-sillypage"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
