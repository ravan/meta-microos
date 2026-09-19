SUMMARY = "French"
DESCRIPTION = "Support for French and Basque."
LICENSE = "LPPL-1.0"

PV = "2026.222.svn72499"

RPM_NAME = "texlive-collection-langfrench-2026.222.svn72499-68.2.noarch.rpm"
RPM_HASH = "52422b93309699af64fc4c1f4fe96c4db654b54634e795f0ca133659a0d8369ddcd80c7f2da81ace11f34fe3223eff1d6ded09de5bebb1590184e5987e9345bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
tex-french \
texlive-collection-langfrench"

RDEPENDS:${PN} += "texlive-aeguill \
texlive-annee-scolaire \
texlive-apprendre-a-programmer-en-tex \
texlive-apprends-latex \
texlive-babel-basque \
texlive-babel-french \
texlive-basque-book \
texlive-basque-date \
texlive-bib-fr \
texlive-bibleref-french \
texlive-booktabs-fr \
texlive-cahierprof \
texlive-collection-basic \
texlive-couleurs-fr \
texlive-droit-fr \
texlive-e-french \
texlive-epslatex-fr \
texlive-expose-expl3-dunkerque-2019 \
texlive-facture \
texlive-faq-fr \
texlive-faq-fr-gutenberg \
texlive-formation-latex-ul \
texlive-frenchmath \
texlive-frletter \
texlive-frpseudocode \
texlive-hyphen-basque \
texlive-hyphen-french \
texlive-impatient-fr \
texlive-impnattypo \
texlive-l2tabu-french \
texlive-latex2e-help-texinfo-fr \
texlive-letgut \
texlive-lshort-french \
texlive-mafr \
texlive-matapli \
texlive-panneauxroute \
texlive-profcollege \
texlive-proflabo \
texlive-proflycee \
texlive-profsio \
texlive-tabvar \
texlive-tdsfrmath \
texlive-texlive-fr \
texlive-translation-array-fr \
texlive-translation-dcolumn-fr \
texlive-translation-natbib-fr \
texlive-translation-tabbing-fr \
texlive-variations \
texlive-visualfaq-fr \
texlive-visualtikz"

inherit rpm
