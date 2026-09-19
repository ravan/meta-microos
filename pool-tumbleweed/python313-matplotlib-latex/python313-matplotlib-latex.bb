SUMMARY = "Allow rendering latex in python313-matplotlib"
DESCRIPTION = "This package allows python313-matplotlib to display latex in plots \
and figures."
LICENSE = "SUSE-Matplotlib"

PV = "3.10.9"

RPM_NAME = "python313-matplotlib-latex-3.10.9-2.2.noarch.rpm"
RPM_HASH = "186d5204cf0e764fcae94c216103d4376e41a8206878e9ecb0cf3e77ab3aedafe7a1d9f15a275f36fb7f992563e249ea9e88e2b7dc487f34bae15ab9dd1d54a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-matplotlib-latex \
python313-matplotlib-latex"

RDEPENDS:${PN} += "python313-matplotlib \
tex-avant.sty \
tex-chancery.sty \
tex-charter.sty \
tex-courier.sty \
tex-geometry.sty \
tex-helvet.sty \
tex-mathpazo.sty \
tex-mathptmx.sty \
tex-pncr.tfm \
tex-psfrag.sty \
tex-type1cm.sty \
tex-type1ec.sty \
tex-ucs.sty \
tex-underscore.sty \
texlive-dvipng \
texlive-dvips \
texlive-geometry \
texlive-graphics \
texlive-helvetic \
texlive-latex \
texlive-pgf \
texlive-sfmath \
texlive-tex \
texlive-txfonts \
texlive-xcolor \
texlive-xetex"

inherit rpm
