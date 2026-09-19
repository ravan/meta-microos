SUMMARY = "Automated patches for pLaTeX/upLaTeX"
DESCRIPTION = "Japanese pLaTeX/upLaTeX formats and packages often conflict \
with other LaTeX packages which are unaware of pLaTeX/upLaTeX. \
In the worst case, such packages throw a fatal error or end up \
with a wrong output. The goal of this package is that there \
should be no need to worry about such incompatibilities, \
because specific patches are loaded automatically whenever \
necessary. This helps not only to simplify source files, but \
also to make the appearance of working pLaTeX/upLaTeX sources \
similar to those of ordinary LaTeX ones."
LICENSE = "BSD-3-Clause"

PV = "2026.226.0.0.9qsvn77682"

RPM_NAME = "texlive-plautopatch-2026.226.0.0.9qsvn77682-59.2.noarch.rpm"
RPM_HASH = "9cbb0f3fc68dd1ffcbaf7e2f0d8616c74a51efc2ae55b1ada7ac602979b67963f0fbf1dd2fad379e2734785c07b43b725be908e2162790a96262f9361ece4e05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-plarydshln.sty \
tex-plautopatch.sty \
tex-plcollcell.sty \
tex-plextarydshln.sty \
tex-plsiunitx.sty \
tex-pxpgfrcs.sty \
tex-pxstfloats.sty \
texlive-plautopatch"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-arydshln.sty \
tex-collcell.sty \
tex-colortbl.sty \
tex-delarray.sty \
tex-filehook.sty \
tex-pgfrcs.sty \
tex-plarray.sty \
tex-plext.sty \
tex-plextarray.sty \
tex-plextcolortbl.sty \
tex-plextdelarray.sty \
tex-pxeveryshi.sty \
tex-siunitx.sty \
tex-stfloats.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
