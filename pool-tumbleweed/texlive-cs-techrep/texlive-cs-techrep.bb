SUMMARY = "Technical Reports in Computer Science and Software Engineering"
DESCRIPTION = "This package provides a class for the creation of technical \
reports in computer science and software engineering. The style \
is a two-column format similar to IEEE. It is intended for lab \
reports and provides a beginner-friendly template example."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9.1svn78139"

RPM_NAME = "texlive-cs-techrep-2026.226.0.0.9.1svn78139-61.2.noarch.rpm"
RPM_HASH = "b7575be30b91d8e7281aa9a1a038cd32eddcae879ff2c0a8e7218e71bba5f46e98143c4a8ede0332bd0891752a5dcd7d381af2647c14cac0e28c80944b4a16a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cs-techrep.cls \
texlive-cs-techrep"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-IEEEtran.cls \
tex-acronym.sty \
tex-afterpage.sty \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-babel.sty \
tex-ccicons.sty \
tex-cleveref.sty \
tex-csquotes.sty \
tex-diagbox.sty \
tex-doclicense.sty \
tex-etoolbox.sty \
tex-extdash.sty \
tex-floatrow.sty \
tex-flushend.sty \
tex-fontenc.sty \
tex-graphicx.sty \
tex-hypcap.sty \
tex-hyperref.sty \
tex-inputenc.sty \
tex-lipsum.sty \
tex-listings.sty \
tex-lmodern.sty \
tex-lscape.sty \
tex-newtxtt.sty \
tex-orcidlink.sty \
tex-paralist.sty \
tex-pbalance.sty \
tex-pdflscape.sty \
tex-relsize.sty \
tex-siunitx.sty \
tex-stfloats.sty \
tex-subcaption.sty \
tex-subfig.sty \
tex-tabularx.sty \
tex-tcolorbox.sty \
tex-times.sty \
tex-todonotes.sty \
tex-upquote.sty \
tex-url.sty \
tex-xcolor.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
