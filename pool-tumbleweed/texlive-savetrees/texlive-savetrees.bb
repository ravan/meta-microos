SUMMARY = "Optimise the use of each page of a LaTeX document"
DESCRIPTION = "The goal of the savetrees package is to pack as much text as \
possible onto each page of a LaTeX document. Admittedly, this \
makes the document far less attractive. Nevertheless, savetrees \
is a simple way to save paper when printing draft copies of a \
document. It can also be useful when trying to meet a tight \
page-length requirement for a conference or journal submission. \
Most of the package options cover specific modifications to \
typesetting rules, but there are also options subtle, moderate \
and extreme options for the 'broad brush' approach."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.4svn77682"

RPM_NAME = "texlive-savetrees-2026.226.2.4svn77682-60.2.noarch.rpm"
RPM_HASH = "7fc699d15c23f7a256cef73cc16a3d32d95aaa2fa4068e2bc06b0203a19808f3fbde4d33495d7706c2e5cbf65cb8b25284fc07b2b82934a7235c0326fe0fae83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-savetrees.bbx \
tex-savetrees.cbx \
tex-savetrees.sty \
texlive-savetrees"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifluatex.sty \
tex-ifpdf.sty \
tex-numeric-comp.bbx \
tex-numeric-comp.cbx \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
