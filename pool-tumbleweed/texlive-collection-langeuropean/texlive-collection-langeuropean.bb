SUMMARY = "Other European languages"
DESCRIPTION = "Support for a number of European languages; others (Greek, \
German, French, ...) have their own collections, depending \
simply on the size of the support."
LICENSE = "LPPL-1.0"

PV = "2026.222.svn73414"

RPM_NAME = "texlive-collection-langeuropean-2026.222.svn73414-68.2.noarch.rpm"
RPM_HASH = "77b51758808a4d810b56cd02800fd1a228e0d96dba96c9721c6f5b6cfa33de57228dd289f89d35c5d6b43183594811d6fbb512850b1b9eb09c1343601bf6d381"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
tex-european \
texlive-collection-langeuropean"

RDEPENDS:${PN} += "texlive-armtex \
texlive-babel-albanian \
texlive-babel-bosnian \
texlive-babel-breton \
texlive-babel-croatian \
texlive-babel-danish \
texlive-babel-dutch \
texlive-babel-estonian \
texlive-babel-finnish \
texlive-babel-friulan \
texlive-babel-hungarian \
texlive-babel-icelandic \
texlive-babel-irish \
texlive-babel-kurmanji \
texlive-babel-latin \
texlive-babel-latvian \
texlive-babel-lithuanian \
texlive-babel-macedonian \
texlive-babel-norsk \
texlive-babel-occitan \
texlive-babel-piedmontese \
texlive-babel-romanian \
texlive-babel-romansh \
texlive-babel-samin \
texlive-babel-scottish \
texlive-babel-slovenian \
texlive-babel-swedish \
texlive-babel-turkish \
texlive-babel-welsh \
texlive-collection-basic \
texlive-finbib \
texlive-gloss-occitan \
texlive-hrlatex \
texlive-huaz \
texlive-hulipsum \
texlive-hyphen-albanian \
texlive-hyphen-croatian \
texlive-hyphen-danish \
texlive-hyphen-dutch \
texlive-hyphen-estonian \
texlive-hyphen-finnish \
texlive-hyphen-friulan \
texlive-hyphen-hungarian \
texlive-hyphen-icelandic \
texlive-hyphen-irish \
texlive-hyphen-kurmanji \
texlive-hyphen-latin \
texlive-hyphen-latvian \
texlive-hyphen-lithuanian \
texlive-hyphen-macedonian \
texlive-hyphen-norwegian \
texlive-hyphen-occitan \
texlive-hyphen-piedmontese \
texlive-hyphen-romanian \
texlive-hyphen-romansh \
texlive-hyphen-slovenian \
texlive-hyphen-swedish \
texlive-hyphen-turkish \
texlive-hyphen-uppersorbian \
texlive-hyphen-welsh \
texlive-kaytannollista-latexia \
texlive-lithuanian \
texlive-lshort-dutch \
texlive-lshort-estonian \
texlive-lshort-finnish \
texlive-lshort-slovenian \
texlive-lshort-turkish \
texlive-nevelok \
texlive-rojud \
texlive-swebib \
texlive-turkmen"

inherit rpm
