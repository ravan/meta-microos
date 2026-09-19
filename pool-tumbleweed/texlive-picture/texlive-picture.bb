SUMMARY = "Dimens for picture macros"
DESCRIPTION = "There are macro and environment arguments that expect numbers \
that will internally be multiplied by \\unitlength. This package \
extends the syntax of these arguments, so that dimensions with \
calculation support may be used for these arguments."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6svn77682"

RPM_NAME = "texlive-picture-2026.226.1.6svn77682-58.2.noarch.rpm"
RPM_HASH = "2a25c1d9006a106512f0775db0d0e35d29fd66eadfeee2a521ceb96a2d74353d4789b78eb737d23650c51c2d66442a062418ba51af8b506563bbc9c126e3a3b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-picture.sty \
texlive-picture"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
