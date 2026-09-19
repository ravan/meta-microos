SUMMARY = "Setting text along a path with MetaPost"
DESCRIPTION = "This MetaPost package provides macros to typeset text along a \
free path with the help of LaTeX, thereby preserving kerning \
and allowing for 8-bit input (accented characters)."
LICENSE = "LPPL-1.0"

PV = "2026.227.1.6svn15878"

RPM_NAME = "texlive-textpath-2026.227.1.6svn15878-62.2.noarch.rpm"
RPM_HASH = "68ac7c54d11804d41919f294fb7ebad35564c12bb5c429528aa629452cd8b05bb0628f3bd902202d8d2ef9c07e7c51b78208259cf74ea43c529c36cd086db9b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-textpathmp.sty \
texlive-textpath"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-soul.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
