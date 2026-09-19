SUMMARY = "Natbib citations with PDF tooltips"
DESCRIPTION = "This LaTeX package uses pdfcomment and bibentry to surround \
natbib citations with PDF tooltips."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.1svn50449"

RPM_NAME = "texlive-xcpdftips-2026.226.1.1svn50449-59.4.noarch.rpm"
RPM_HASH = "4e69f7337a5d9d4ad9df9598b5233048c640f8780315dcd4a63b634b9fbb0e0c1bfdada2867681b567dc0fc32e6295b904ea2043f40ad3dedf3a70e0b853fb56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xcpdftips.sty \
texlive-xcpdftips"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-bibentry.sty \
tex-calc.sty \
tex-etoolbox.sty \
tex-expl3.sty \
tex-linegoal.sty \
tex-ocgbase.sty \
tex-pdfbase.sty \
tex-pdfcomment.sty \
tex-tcolorbox.sty \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
