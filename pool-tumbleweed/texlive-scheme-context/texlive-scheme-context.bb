SUMMARY = "ConTeXt scheme"
DESCRIPTION = "This is the TeX Live scheme for installing ConTeXt. It's \
intended to give essentially the same results as the ConTeXt \
standalone distribution. In addition to collection-context, \
includes fonts and other packages commonly used with ConTeXt. \
TeX Live uses the ConTeXt repackaging as distributed from \
https://github.com/gucci-on-fleek/context-packaging. See \
https://contextgarden.net and https://pragma-ade.com for \
information about ConTeXt."
LICENSE = "LPPL-1.0"

PV = "2026.222.svn75426"

RPM_NAME = "texlive-scheme-context-2026.222.svn75426-68.2.noarch.rpm"
RPM_HASH = "fe263d1c484e1f12262fa154e69ef6dc2bcaf6e48b0cb94095e22f67ebefdd21a5b8acd56c929f826fe182151ebf8a18a5cb2d7fc6a1b2ffb5f6db8549daf25d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
tex-context \
texlive-scheme-context"

RDEPENDS:${PN} += "texlive-almfixed \
texlive-antt \
texlive-circuitikz \
texlive-cm-unicode \
texlive-collection-context \
texlive-collection-metapost \
texlive-concmath-otf \
texlive-context-animation \
texlive-context-calendar-examples \
texlive-context-collating-marks \
texlive-context-cyrillicnumbers \
texlive-context-filter \
texlive-context-gnuplot \
texlive-context-handlecsv \
texlive-context-letter \
texlive-context-mathsets \
texlive-context-pocketdiary \
texlive-context-simpleslides \
texlive-context-squares \
texlive-context-sudoku \
texlive-context-transliterator \
texlive-context-vim \
texlive-context-visualcounter \
texlive-dejavu \
texlive-ebgaramond \
texlive-erewhon \
texlive-erewhon-math \
texlive-euler-math \
texlive-fontawesome \
texlive-garamond-math \
texlive-gentium-sil \
texlive-iwona \
texlive-kpfonts-otf \
texlive-kurier \
texlive-libertinus-fonts \
texlive-lm \
texlive-lm-math \
texlive-lua-widow-control \
texlive-marvosym \
texlive-oldstandard \
texlive-pgf \
texlive-pgfplots \
texlive-plex \
texlive-poltawski \
texlive-tex-gyre \
texlive-tex-gyre-math \
texlive-xcharter \
texlive-xcharter-math \
texlive-xits"

inherit rpm
