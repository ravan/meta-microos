SUMMARY = "Document classes inspired by the work of Edward Tufte"
DESCRIPTION = "Provided are two classes inspired, respectively, by handouts \
and books created by Edward Tufte."
LICENSE = "Apache-1.0"

PV = "2026.226.3.5.2svn77682"

RPM_NAME = "texlive-tufte-latex-2026.226.3.5.2svn77682-59.2.noarch.rpm"
RPM_HASH = "72d7591286047d6db2ae0b6a50909c0ee7aa15dab6b39aa72a14c172122b53b5d7da82af724631d46d8fd7d201605fd9892972e0b716d93fb72765b7689a76dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tufte-book.cls \
tex-tufte-common.def \
tex-tufte-handout.cls \
texlive-tufte-latex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-beramono.sty \
tex-bibentry.sty \
tex-bidi.sty \
tex-changepage.sty \
tex-chngpage.sty \
tex-fancyhdr.sty \
tex-fontenc.sty \
tex-fontspec.sty \
tex-geometry.sty \
tex-hardwrap.sty \
tex-helvet.sty \
tex-hyperref.sty \
tex-ifluatex.sty \
tex-ifpdf.sty \
tex-ifxetex.sty \
tex-letterspace.sty \
tex-mathpazo.sty \
tex-multicol.sty \
tex-natbib.sty \
tex-optparams.sty \
tex-paralist.sty \
tex-placeins.sty \
tex-ragged2e.sty \
tex-setspace.sty \
tex-soul.sty \
tex-textcase.sty \
tex-textcomp.sty \
tex-titlesec.sty \
tex-titletoc.sty \
tex-xcolor.sty \
tex-xifthen.sty \
tex-xkeyval.sty \
tex-xltxtra.sty \
texlive \
texlive-changepage \
texlive-filesystem \
texlive-ifmtarg \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-paralist \
texlive-placeins \
texlive-sauerj \
texlive-scripts \
texlive-scripts-bin \
texlive-xifthen"

inherit rpm
