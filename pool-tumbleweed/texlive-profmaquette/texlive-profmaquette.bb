SUMMARY = "Use exercises in different types of documents"
DESCRIPTION = "This LaTeX package can help French maths teachers to put one \
and the same exercise into different sorts of documents."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.99_qsvn77282"

RPM_NAME = "texlive-profmaquette-2026.226.0.0.99_qsvn77282-59.2.noarch.rpm"
RPM_HASH = "113ce4be4a27efa333a97a584a54dd883fea35f7eeb59432cfc6b9ca773b20842672647db6a7dfc7da74fdca8f8118b0d837ce5f3907e027de54ead48f42e294"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ProfMaquette.sty \
texlive-profmaquette"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-calc.sty \
tex-datatool.sty \
tex-enumitem.sty \
tex-fontawesome5.sty \
tex-listofitems.sty \
tex-modulus.sty \
tex-pgfmorepages.sty \
tex-ragged2e.sty \
tex-simplekv.sty \
tex-tcolorbox.sty \
tex-varwidth.sty \
tex-verbatim.sty \
tex-xcolor.sty \
tex-xintexpr.sty \
tex-xinttools.sty \
tex-xlop.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
