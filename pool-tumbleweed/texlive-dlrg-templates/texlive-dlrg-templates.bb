SUMMARY = "Templates for the German Lifesaving Association (DLRG)"
DESCRIPTION = "This bundle provides templates for members of the German \
Lifesaving Association (DLRG). This includes the letter \
template, presentations, specialist publications and press \
releases. These templates are based on the current cooperative \
design. They can be adapted to the local structure with simple \
settings."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.0svn74633"

RPM_NAME = "texlive-dlrg-templates-2026.226.1.1.0svn74633-59.2.noarch.rpm"
RPM_HASH = "77bc608be8b7c4a4ff8594326c3c5847b4c70dceca6560d034e041e5b2faed07ff71f020bb84622ff3580b9fc610de34c8fc79ef248cb73ece889cc0d8d37c95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamercolorthemeDLRG.sty \
tex-beamerouterthemeDLRG.sty \
tex-beamerthemeDLRG.sty \
tex-dlrg.mod.Adler.code.tex \
tex-dlrg.mod.Adler.pakete.tex \
tex-dlrg.mod.Bauchbinde.code.tex \
tex-dlrg.mod.Bauchbinde.optionen.tex \
tex-dlrg.mod.Bauchbinde.pakete.tex \
tex-dlrg.mod.Farben.code.tex \
tex-dlrg.mod.Hausarbeit.code.tex \
tex-dlrg.mod.Hausarbeit.optionen.tex \
tex-dlrg.mod.Hausarbeit.pakete.tex \
tex-dlrg.mod.Paketbeschreibung.code.tex \
tex-dlrg.mod.Paketbeschreibung.pakete.tex \
tex-dlrg.mod.Personenicon.code.tex \
tex-dlrg.mod.Rettungssport.code.tex \
tex-dlrg.mod.Rettungssport.pakete.tex \
tex-dlrg.mod.Schrift.code.tex \
tex-dlrg.mod.Schrift.pakete.tex \
tex-dlrg.mod.Stoerer.code.tex \
tex-dlrg.mod.Stoerer.pakete.tex \
tex-dlrg.mod.Tabellen.code.tex \
tex-dlrg.mod.Tabellen.pakete.tex \
tex-dlrg.sty \
tex-dlrg.typ.beamer.code.tex \
tex-dlrg.typ.beamer.optionen.tex \
tex-dlrg.typ.beamer.pakete.tex \
tex-dlrg.typ.doc.code.tex \
tex-dlrg.typ.doc.pakete.tex \
tex-dlrg.typ.letter.code.tex \
tex-dlrg.typ.letter.pakete.tex \
tex-dlrg.typ.message.code.tex \
tex-dlrg.typ.message.optionen.tex \
tex-dlrg.typ.message.pakete.tex \
tex-dlrg.typ.pub.code.tex \
tex-dlrg.typ.pub.optionen.tex \
tex-dlrg.typ.pub.pakete.tex \
texlive-dlrg-templates"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-babel.sty \
tex-environ.sty \
tex-fontenc.sty \
tex-forarray.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-inputenc.sty \
tex-pgfopts.sty \
tex-silence.sty \
tex-tikz.sty \
tex-xcolor.sty \
tex-xifthen.sty \
tex-xparse.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
