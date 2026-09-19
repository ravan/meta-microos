SUMMARY = "Flexible typesetting of table and figure floats using key/value directives"
DESCRIPTION = "Provides commands to typeset centered, left- or right-aligned \
table and (multiple-)figure floats, with footnotes. Instead of \
an environment, a command with 4 arguments is used; the first \
is optional and is used for key,value pairs generating \
variations on the defaults and offering a route for future \
extensions."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.33svn77682"

RPM_NAME = "texlive-ctable-2026.226.1.33svn77682-61.2.noarch.rpm"
RPM_HASH = "2aaa7f2532d66e36be62b05de5189c7f13c60d271e073d2e02631c62feb63a1da68a5d0fa33ad776ff697a89742b2e0fe701bd61c3d177ad02e18bedf0805284"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ctable.sty \
texlive-ctable"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-booktabs.sty \
tex-etoolbox.sty \
tex-ifpdf.sty \
tex-rotating.sty \
tex-tabularx.sty \
tex-transparent.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
