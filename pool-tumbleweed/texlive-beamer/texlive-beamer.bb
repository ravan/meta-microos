SUMMARY = "A LaTeX class for producing presentations and slides"
DESCRIPTION = "The beamer LaTeX class can be used for producing slides. The \
class works in both PostScript and direct PDF output modes, \
using the pgf graphics system for visual effects. Content is \
created in the frame environment, and each frame can be made up \
of a number of slides using a simple notation for specifying \
material to appear on each slide within a frame. Short versions \
of title, authors, institute can also be specified as optional \
parameters. Whole frame graphics are supported by plain frames. \
The class supports figure and table environments, transparency \
effects, varying slide transitions and animations. Beamer also \
provides compatibility with other packages like prosper. The \
package now incorporates the functionality of the former \
translator package, which is used for customising the package \
for use in other language environments. Beamer depends on the \
following other packages: atbegshi, etoolbox, hyperref, ifpdf, \
pgf, and translator."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.77svn78101"

RPM_NAME = "texlive-beamer-2026.226.3.77svn78101-61.2.noarch.rpm"
RPM_HASH = "6cd28ccf76698a37e125f3e0c1e5b183bdd04dc0bc12c0dbb9bf829d2ea68f7365c34c9bf91953bf3f023af92b090d949ea81e5ef7ae3743b8bca6bb65cc75fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamer.cls \
tex-beamerarticle.sty \
tex-beamerbasearticle.sty \
tex-beamerbaseauxtemplates.sty \
tex-beamerbaseboxes.sty \
tex-beamerbasecolor.sty \
tex-beamerbasecompatibility.sty \
tex-beamerbasedecode.sty \
tex-beamerbasefont.sty \
tex-beamerbaseframe.sty \
tex-beamerbaseframecomponents.sty \
tex-beamerbaseframesize.sty \
tex-beamerbaselocalstructure.sty \
tex-beamerbasemisc.sty \
tex-beamerbasemodes.sty \
tex-beamerbasenavigation.sty \
tex-beamerbasenavigationsymbols.tex \
tex-beamerbasenotes.sty \
tex-beamerbaseoptions.sty \
tex-beamerbaseoverlay.sty \
tex-beamerbaserequires.sty \
tex-beamerbasesection.sty \
tex-beamerbasetemplates.sty \
tex-beamerbasethemes.sty \
tex-beamerbasetheorems.sty \
tex-beamerbasetitle.sty \
tex-beamerbasetoc.sty \
tex-beamerbasetranslator.sty \
tex-beamerbasetwoscreens.sty \
tex-beamerbaseverbatim.sty \
tex-beamercolorthemealbatross.sty \
tex-beamercolorthemebeaver.sty \
tex-beamercolorthemebeetle.sty \
tex-beamercolorthemecrane.sty \
tex-beamercolorthemedefault.sty \
tex-beamercolorthemedolphin.sty \
tex-beamercolorthemedove.sty \
tex-beamercolorthemefly.sty \
tex-beamercolorthemelily.sty \
tex-beamercolorthememonarca.sty \
tex-beamercolorthemeorchid.sty \
tex-beamercolorthemerose.sty \
tex-beamercolorthemeseagull.sty \
tex-beamercolorthemeseahorse.sty \
tex-beamercolorthemesidebartab.sty \
tex-beamercolorthemespruce.sty \
tex-beamercolorthemestructure.sty \
tex-beamercolorthemewhale.sty \
tex-beamercolorthemewolverine.sty \
tex-beamerfoils.sty \
tex-beamerfontthemedefault.sty \
tex-beamerfontthemeprofessionalfonts.sty \
tex-beamerfontthemeserif.sty \
tex-beamerfontthemestructurebold.sty \
tex-beamerfontthemestructureitalicserif.sty \
tex-beamerfontthemestructuresmallcapsserif.sty \
tex-beamericonarticle.tex \
tex-beamericonbook.tex \
tex-beamerinnerthemecircles.sty \
tex-beamerinnerthemedefault.sty \
tex-beamerinnerthemeinmargin.sty \
tex-beamerinnerthemerectangles.sty \
tex-beamerinnerthemerounded.sty \
tex-beamerouterthemedefault.sty \
tex-beamerouterthemeinfolines.sty \
tex-beamerouterthememiniframes.sty \
tex-beamerouterthemeshadow.sty \
tex-beamerouterthemesidebar.sty \
tex-beamerouterthemesmoothbars.sty \
tex-beamerouterthemesmoothtree.sty \
tex-beamerouterthemesplit.sty \
tex-beamerouterthemetree.sty \
tex-beamerpatchparalist.sty \
tex-beamerprosper.sty \
tex-beamerseminar.sty \
tex-beamertexpower.sty \
tex-beamerthemeAnnArbor.sty \
tex-beamerthemeAntibes.sty \
tex-beamerthemeBergen.sty \
tex-beamerthemeBerkeley.sty \
tex-beamerthemeBerlin.sty \
tex-beamerthemeBoadilla.sty \
tex-beamerthemeCambridgeUS.sty \
tex-beamerthemeCopenhagen.sty \
tex-beamerthemeDarmstadt.sty \
tex-beamerthemeDresden.sty \
tex-beamerthemeEastLansing.sty \
tex-beamerthemeFrankfurt.sty \
tex-beamerthemeGoettingen.sty \
tex-beamerthemeHannover.sty \
tex-beamerthemeIlmenau.sty \
tex-beamerthemeJuanLesPins.sty \
tex-beamerthemeLuebeck.sty \
tex-beamerthemeMadrid.sty \
tex-beamerthemeMalmoe.sty \
tex-beamerthemeMarburg.sty \
tex-beamerthemeMontpellier.sty \
tex-beamerthemePaloAlto.sty \
tex-beamerthemePittsburgh.sty \
tex-beamerthemeRochester.sty \
tex-beamerthemeSingapore.sty \
tex-beamerthemeSzeged.sty \
tex-beamerthemeWarsaw.sty \
tex-beamerthemebars.sty \
tex-beamerthemeboxes.sty \
tex-beamerthemeclassic.sty \
tex-beamerthemecompatibility.sty \
tex-beamerthemedefault.sty \
tex-beamerthemelined.sty \
tex-beamerthemeplain.sty \
tex-beamerthemeshadow.sty \
tex-beamerthemesidebar.sty \
tex-beamerthemesplit.sty \
tex-beamerthemetree.sty \
tex-multimedia.sty \
tex-multimediasymbols.sty \
tex-xmpmulti.sty \
texlive-beamer"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-atbegshi.sty \
tex-enumerate.sty \
tex-etoolbox.sty \
tex-hyperref.sty \
tex-ifpdf.sty \
tex-iftex.sty \
tex-inputenc.sty \
tex-keyval.sty \
tex-paralist.sty \
tex-pgf.sty \
tex-pgfcore.sty \
tex-pgfmath.sty \
tex-pgfpages.sty \
tex-sansmathaccent.sty \
tex-translator.sty \
tex-ucs.sty \
tex-xcolor.sty \
tex-xxcolor.sty \
texlive \
texlive-amscls \
texlive-amsfonts \
texlive-amsmath \
texlive-atbegshi \
texlive-etoolbox \
texlive-filesystem \
texlive-geometry \
texlive-hyperref \
texlive-iftex \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pgf \
texlive-scripts \
texlive-scripts-bin \
texlive-translator \
texlive-xcolor"

inherit rpm
