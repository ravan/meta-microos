SUMMARY = "A LaTeX class for Amnesty International"
DESCRIPTION = "This package provides a class for Amnesty International reports \
according to guidelines at https://brandhub.amnesty.org/."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn69439"

RPM_NAME = "texlive-amnestyreport-2026.226.1.2svn69439-61.2.noarch.rpm"
RPM_HASH = "b7d46814ba896402e25b86768fc4f09f605a5eb715493fbde889b35e3adcbc12ab3fc2ba65ff2bb8d86aa5db51b7049cf2b107cac9f6621ab94f4ac6d3bc77a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-amnestyreport.cls \
texlive-amnestyreport"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-biblatex.sty \
tex-booktabs.sty \
tex-caption.sty \
tex-fancyhdr.sty \
tex-fontawesome5.sty \
tex-fontspec.sty \
tex-framed.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-hyphenat.sty \
tex-longtable.sty \
tex-placeins.sty \
tex-sidecap.sty \
tex-soul.sty \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
