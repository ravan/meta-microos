SUMMARY = "Incremental slides"
DESCRIPTION = "This package allows to write presentations with incremental \
slides. It does not presuppose any specific document class. \
Rather, it is a lightweight alternative to full-fledged \
presentation classes like beamer. The package requires xcolor, \
environ, and pgffor (from the pgf bundle)."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.12svn57866"

RPM_NAME = "texlive-overlays-2026.226.2.12svn57866-58.2.noarch.rpm"
RPM_HASH = "3680118458a8232ebb1bfee4f4453eedb4f9d003b526d70f7e0719d52655b8177fb74d8c60872244f69f19f487dc91d6314db7ee6e41224d389c24b85079bd26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-overlays.sty \
texlive-overlays"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-environ.sty \
tex-pgffor.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
