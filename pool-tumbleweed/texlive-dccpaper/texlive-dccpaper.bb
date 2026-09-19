SUMMARY = "Typeset papers for the International Journal of Digital Curation"
DESCRIPTION = "The LaTeX class ijdc-v14 produces camera-ready papers and \
articles suitable for inclusion in the International Journal of \
Digital Curation, with applicability from volume 14 onwards; a \
legacy class ijdc-v9 is provided for papers and articles \
written for volumes 9-13. The similar idcc class can be used \
for submissions to the International Digital Curation \
Conference, beginning with the 2015 conference. As of August \
2023 these classes are no longer officially supported for new \
submissions to the IJDC and IDCC, but nevertheless they \
continue to be maintained to support existing documents."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.6svn75491"

RPM_NAME = "texlive-dccpaper-2026.226.2.6svn75491-59.2.noarch.rpm"
RPM_HASH = "b1b2ee6eb99d7c5fd66a7f33ecdf66409cae5354b8e12b268deaa05cb8950ea9d2863036b6e34f1e275b661ddf42d11a6ca759d512ca261f82634ac28565f924"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dccpaper-base.sty \
tex-idcc.cls \
tex-ijdc-v14.cls \
tex-ijdc-v9.cls \
texlive-dccpaper"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-GoSans.sty \
tex-array.sty \
tex-article.cls \
tex-atbegshi.sty \
tex-babel.sty \
tex-baskervald.sty \
tex-baskervillef.sty \
tex-booktabs.sty \
tex-calc.sty \
tex-color.sty \
tex-etoolbox.sty \
tex-fontenc.sty \
tex-fontspec.sty \
tex-footmisc.sty \
tex-graphicx.sty \
tex-helvet.sty \
tex-hyperxmp.sty \
tex-ifpdf.sty \
tex-iftex.sty \
tex-mathptmx.sty \
tex-newtxmath.sty \
tex-newtxtext.sty \
tex-tgheros.sty \
tex-titlesec.sty \
tex-xcolor.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
