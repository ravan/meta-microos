SUMMARY = "Typesetting leadsheets and songbooks"
DESCRIPTION = "This LaTeX package offers support for typesetting simple \
leadsheets of songs, i.e. song lyrics and the corresponding \
chords."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.7svn61504"

RPM_NAME = "texlive-leadsheets-2026.226.0.0.7svn61504-61.2.noarch.rpm"
RPM_HASH = "7f1260570cff7543e41b0b8b7b138df993be132bda72bdd78b2da6133f3c303e4f002bb328e9683d820169b1ff81fd45b22eeeeaf64396d4181a16be833211a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-leadsheet.cls \
tex-leadsheets.library.chordnames.code.tex \
tex-leadsheets.library.chords.code.tex \
tex-leadsheets.library.external.code.tex \
tex-leadsheets.library.musejazz.code.tex \
tex-leadsheets.library.musicsymbols.code.tex \
tex-leadsheets.library.properties.code.tex \
tex-leadsheets.library.shorthands.code.tex \
tex-leadsheets.library.songs.code.tex \
tex-leadsheets.library.templates.code.tex \
tex-leadsheets.library.translations.code.tex \
tex-leadsheets.library.transposing.code.tex \
tex-leadsheets.sty \
texlive-leadsheets"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-scrlayer-scrpage.sty \
tex-translations.sty \
tex-xparse.sty \
tex-zref-totpages.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
