SUMMARY = "FIFO and stack implementation for package writers"
DESCRIPTION = "A LaTeX implementation of a combined FIFO Stack modified from \
the existing stack package by Benjamin Bayart. The package \
renames the original's \\Push and \\Pop commands \\FSPush and \
\\FSPop, and which work on the top/end of the FIFO/Stack), and \
adds the ability to \\FSUnshift and \\FSShift from the bottom \
(front) of the FIFO/Stack."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn33288"

RPM_NAME = "texlive-fifo-stack-2026.226.1.0svn33288-59.2.noarch.rpm"
RPM_HASH = "ce0b1e3c3edcc21e18527650b923a673cf149e261082bad360756e8ea937613969357986f3e7daacf11c906f3831fbd52fd23acf12ca000a73f5c6311c07cd37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fifo-stack.sty \
texlive-fifo-stack"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
