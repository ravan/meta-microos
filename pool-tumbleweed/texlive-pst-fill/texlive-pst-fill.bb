SUMMARY = "Fill or tile areas with PSTricks"
DESCRIPTION = "Pst-fill is a PSTricks-based package for filling and tiling \
areas or characters."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.02svn77682"

RPM_NAME = "texlive-pst-fill-2026.226.1.02svn77682-59.2.noarch.rpm"
RPM_HASH = "888221720ca5f2e1cb09a4ef1bcf1d1d22bf6d62a358dd4e924663b7b8ccb58cacadd4d270c4e4dcef5bd99cc37861bec00e3398cc69869ace4d49b247aa4cd8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-fill.sty \
tex-pst-fill.tex \
texlive-pst-fill"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
