SUMMARY = "Define commands with many optional arguments"
DESCRIPTION = "The package provides extended versions of \\newcommand and \
related LaTeX commands, which allow easy and robust definition \
of macros with many optional arguments, using a clear and \
simple xkeyval-style syntax."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn77682"

RPM_NAME = "texlive-xargs-2026.226.1.1svn77682-59.4.noarch.rpm"
RPM_HASH = "110b321ede03c8867e24516f101ffb0d8d75d579f5483d670d3cd59b9105150f566c0d8d2b5340b5f999d1d24f1df9f23b76e498f17e9d15e5a2cf25d2d30cc0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xargs.sty \
texlive-xargs"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
