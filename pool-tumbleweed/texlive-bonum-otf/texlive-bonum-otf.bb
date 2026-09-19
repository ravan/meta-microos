SUMMARY = "Support for the OpenType font Bonum"
DESCRIPTION = "Support for the OpenType font Bonum (text and math) of the \
TeXGyre Fonts."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.01svn77682"

RPM_NAME = "texlive-bonum-otf-2026.226.0.0.01svn77682-59.2.noarch.rpm"
RPM_HASH = "865df2e2878fa676239d6d75248c2c2f8ca14f032890a3dfdae2ef1e989a636a25cfddc35d131c932040f62c679aedd77bf040ccedf83bf6859a8d2db1f51800"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bonum-otf.sty \
texlive-bonum-otf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
tex-textcomp.sty \
tex-unicode-math.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
