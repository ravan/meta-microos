SUMMARY = "German"
DESCRIPTION = "Support for German."
LICENSE = "LPPL-1.0"

PV = "2026.222.svn74675"

RPM_NAME = "texlive-collection-langgerman-2026.222.svn74675-68.2.noarch.rpm"
RPM_HASH = "36cc9e88cfc7e6519a3c197e2691d03221fdff494108aa8a5ffc6d0af74300187bb82dafa2925471682cf0cc0275965dd0a0ab91bddf6ad30d5f41b02025cf51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
tex-german \
texlive-collection-langgerman"

RDEPENDS:${PN} += "texlive-apalike-german \
texlive-autotype \
texlive-babel-german \
texlive-bibleref-german \
texlive-booktabs-de \
texlive-collection-basic \
texlive-csquotes-de \
texlive-dehyph \
texlive-dehyph-exptl \
texlive-dhua \
texlive-dtk-bibliography \
texlive-etdipa \
texlive-etoolbox-de \
texlive-fifinddo-info \
texlive-fragoli \
texlive-german \
texlive-germbib \
texlive-germkorr \
texlive-hausarbeit-jura \
texlive-hyphen-german \
texlive-koma-script-examples \
texlive-l2picfaq \
texlive-l2tabu \
texlive-latexcheat-de \
texlive-lshort-german \
texlive-lualatex-doc-de \
texlive-microtype-de \
texlive-milog \
texlive-quran-de \
texlive-r-und-s \
texlive-schulmathematik \
texlive-templates-fenn \
texlive-templates-sommer \
texlive-termcal-de \
texlive-texlive-de \
texlive-tipa-de \
texlive-translation-arsclassica-de \
texlive-translation-biblatex-de \
texlive-translation-chemsym-de \
texlive-translation-ecv-de \
texlive-translation-enumitem-de \
texlive-translation-europecv-de \
texlive-translation-filecontents-de \
texlive-translation-moreverb-de \
texlive-udesoftec \
texlive-uhrzeit \
texlive-umlaute \
texlive-voss-mathcol"

inherit rpm
