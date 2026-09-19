SUMMARY = "Allow rendering latex in python314-matplotlib"
DESCRIPTION = "This package allows python314-matplotlib to display latex in plots \
and figures."
LICENSE = "SUSE-Matplotlib"

PV = "3.10.9"

RPM_NAME = "python314-matplotlib-latex-3.10.9-2.2.noarch.rpm"
RPM_HASH = "969887ed1617484863da256531e3388aa1d6445c978d360129ebb22110148e539644163fabeb898c5ac609450b074d632584f16c80d81637f46645a9aa7f930d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-matplotlib-latex"

RDEPENDS:${PN} += "python314-matplotlib \
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
