SUMMARY = "Music packages"
DESCRIPTION = "Music-related fonts and packages."
LICENSE = "LPPL-1.0"

PV = "2026.222.svn76267"

RPM_NAME = "texlive-collection-music-2026.222.svn76267-68.2.noarch.rpm"
RPM_HASH = "cdc12e043448a9a69128f7f02d875066ca65dedd77da0319939420f0172cc41800f0c63cf7d3fb934014b98f358261f06a7341ae342cb3a5a21060be7a3a759a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
tex-music \
texlive-collection-music"

RDEPENDS:${PN} += "texlive-abc \
texlive-autosp \
texlive-bagpipe \
texlive-chordbars \
texlive-chordbox \
texlive-collection-latex \
texlive-ddphonism \
texlive-figbas \
texlive-fretplot \
texlive-gchords \
texlive-gregoriotex \
texlive-gtrcrd \
texlive-guitar \
texlive-guitarchordschemes \
texlive-guitartabs \
texlive-harmony \
texlive-latex4musicians \
texlive-leadsheets \
texlive-liederbuch \
texlive-lilyglyphs \
texlive-lyluatex \
texlive-m-tx \
texlive-musical \
texlive-musicography \
texlive-musixguit \
texlive-musixtex \
texlive-musixtex-fonts \
texlive-musixtnt \
texlive-octave \
texlive-piano \
texlive-pmx \
texlive-pmxchords \
texlive-recorder-fingering \
texlive-songbook \
texlive-songproj \
texlive-songs \
texlive-undar-digitacion \
texlive-xml2pmx \
texlive-xpiano"

inherit rpm
