SUMMARY = "Commands and document classes for German-speaking teachers of mathematics and physics"
DESCRIPTION = "The schulmathematik bundle provides two LaTeX packages and six \
document classes for German-speaking teachers of mathematics \
and physics."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.7.1svn76924"

RPM_NAME = "texlive-schulmathematik-2026.226.1.7.1svn76924-60.2.noarch.rpm"
RPM_HASH = "0bbd9442912a769bee1801eea360c7b78721b6dc9db2ba5454426065dcb36addb2293558ce7aae5ff5b986f6689b71060f4c68fbaf4576c362cd39a59b00e865"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-schulma-ab.cls \
tex-schulma-gutachten.cls \
tex-schulma-klausur.cls \
tex-schulma-komp.cls \
tex-schulma-mdlprf.cls \
tex-schulma-physik.sty \
tex-schulma-praes.cls \
tex-schulma.sty \
texlive-schulmathematik"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-adjustbox.sty \
tex-autoaligne.sty \
tex-babel.sty \
tex-beamerarticle.sty \
tex-circuitikz.sty \
tex-comment.sty \
tex-datetime2.sty \
tex-enumitem.sty \
tex-etoolbox.sty \
tex-geometry.sty \
tex-icomma.sty \
tex-isodate.sty \
tex-mathtools.sty \
tex-pdfpages.sty \
tex-pgfpages.sty \
tex-pgfplots.sty \
tex-scrlayer-scrpage.sty \
tex-siunitx.sty \
tex-tasks.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
