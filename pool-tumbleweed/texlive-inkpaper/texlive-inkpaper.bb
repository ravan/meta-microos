SUMMARY = "A mathematical paper template"
DESCRIPTION = "InkPaper is designed to write mathematical papers,especially \
designed for Mathematics Students. ZJGS students. magazine \
editors. NOTICE.This is not a Thesis class."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.0svn54080"

RPM_NAME = "texlive-inkpaper-2026.226.1.0svn54080-60.2.noarch.rpm"
RPM_HASH = "061dc3948bb1ffdfeb61e3134282fad4d657dc2d1f5193df844613c2778b08688b64ca107de5d578491ccec82ba83edc91189f582d053b7f168c5cc3784ebe33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-inkpaper.cls \
texlive-inkpaper"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-abstract.sty \
tex-amsfonts.sty \
tex-amsthm.sty \
tex-asymptote.sty \
tex-calc.sty \
tex-cite.sty \
tex-ctexart.cls \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-ifxetex.sty \
tex-kvoptions.sty \
tex-listings.sty \
tex-mfirstuc.sty \
tex-microtype.sty \
tex-newtxmath.sty \
tex-newtxtext.sty \
tex-siunitx.sty \
tex-textcase.sty \
tex-xcolor.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
