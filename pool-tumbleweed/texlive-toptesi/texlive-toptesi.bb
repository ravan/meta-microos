SUMMARY = "Bundle for typesetting multilanguage theses"
DESCRIPTION = "This bundle contains everything needed for typesetting a \
bachelor, master, or PhD thesis in Italian (or in any other \
language supported by LaTeX: the bundle is constructed to \
support multilingual use). The infix strings may be selected \
and specified at will by means of a configuration file, so as \
to customize the layout of the front page to the requirements \
of a specific university. Thanks to its language management, \
the bundle is suited for multilanguage theses that are becoming \
more and more frequent thanks to the double degree programs of \
the European Community Socrates programs. Toptesi is designed \
to save the PDF version of a thesis in PDF/A-1b compliant mode \
and with all the necessary metadata."
LICENSE = "LPPL-1.0"

PV = "2026.226.6.4.07svn73464"

RPM_NAME = "texlive-toptesi-2026.226.6.4.07svn73464-59.2.noarch.rpm"
RPM_HASH = "68a06fe4acc82112a6d5a2be057020ebf30b7861e8f9fa0f977f43b8a2d6f5a8bc0f37d1f566f7071fc2f25d11b3b5b5e8c8e233f08ba59f5c68b62094263e2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-topcoman.sty \
tex-topfront.sty \
tex-toptesi-dottorale.sty \
tex-toptesi-magistrale.sty \
tex-toptesi-monografia.sty \
tex-toptesi-scudo.sty \
tex-toptesi-sss.sty \
tex-toptesi.cfg \
tex-toptesi.cls \
tex-toptesi.sty \
texlive-toptesi"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-babel.sty \
tex-booktabs.sty \
tex-calc.sty \
tex-caption.sty \
tex-csquotes.sty \
tex-etoolbox.sty \
tex-fancyvrb.sty \
tex-float.sty \
tex-fontspec.sty \
tex-frontespizio.sty \
tex-graphicx.sty \
tex-iftex.sty \
tex-ifthen.sty \
tex-imakeidx.sty \
tex-indentfirst.sty \
tex-lscape.sty \
tex-multirow.sty \
tex-nomencl.sty \
tex-polyglossia.sty \
tex-report.cls \
tex-scrextend.sty \
tex-setspace.sty \
tex-siunitx.sty \
tex-subcaption.sty \
tex-tabularx.sty \
tex-textcomp.sty \
tex-trace.sty \
tex-unicode-math.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
tex-xparse.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
