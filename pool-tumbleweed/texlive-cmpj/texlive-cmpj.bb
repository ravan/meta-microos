SUMMARY = "Style for the journal Condensed Matter Physics"
DESCRIPTION = "The package contains macros and some documentation for \
typesetting papers for submission to the Condensed Matter \
Physics journal published by the Institute for Condensed Matter \
Physics of the National Academy of Sciences of Ukraine."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.03svn58506"

RPM_NAME = "texlive-cmpj-2026.226.3.03svn58506-60.2.noarch.rpm"
RPM_HASH = "174b7738e3ec0273886a3cc01a4458df51f8ad9629b609955d1df68fb33b2079c93d808b5de887e09f1d58a1425d7cafe711306ca1136e47f94deef478c3544f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cmpj.sty \
tex-cmpj2.sty \
tex-cmpj3.sty \
texlive-cmpj"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-doi.sty \
tex-droidsans.sty \
tex-droidsansmono.sty \
tex-droidserif.sty \
tex-fancyhdr.sty \
tex-fontenc.sty \
tex-fourier.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-hyperxmp.sty \
tex-ifthen.sty \
tex-natbib.sty \
tex-newtxmath.sty \
tex-newtxtext.sty \
tex-scalerel.sty \
tex-textcomp.sty \
tex-tikz.sty \
tex-txfonts.sty \
tex-url.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
