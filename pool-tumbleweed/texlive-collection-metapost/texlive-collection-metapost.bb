SUMMARY = "MetaPost and Metafont packages"
DESCRIPTION = "The collection-metapost package"
LICENSE = "LPPL-1.0"

PV = "2026.222.svn73627"

RPM_NAME = "texlive-collection-metapost-2026.222.svn73627-68.2.noarch.rpm"
RPM_HASH = "f235c0407be9dc74803e10303ab9cfaddfcc601d248307d2ad5b2e8ba88d9d40356a05ec7a5bd1921c98a3155ec5812e37ac311f50cb29b4a6bbd772c96c7c07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
tex-metapost \
texlive-collection-metapost"

RDEPENDS:${PN} += "texlive-automata \
texlive-bbcard \
texlive-blockdraw-mp \
texlive-bpolynomial \
texlive-cmarrows \
texlive-collection-basic \
texlive-drv \
texlive-dviincl \
texlive-emp \
texlive-epsincl \
texlive-expressg \
texlive-exteps \
texlive-featpost \
texlive-feynmf \
texlive-feynmp-auto \
texlive-fiziko \
texlive-garrigues \
texlive-gmp \
texlive-hatching \
texlive-hershey-mp \
texlive-huffman \
texlive-latexmp \
texlive-mcf2graph \
texlive-metago \
texlive-metaobj \
texlive-metaplot \
texlive-metapost \
texlive-metapost-colorbrewer \
texlive-metauml \
texlive-mfpic \
texlive-mfpic4ode \
texlive-minim-hatching \
texlive-mp-geom2d \
texlive-mp-neuralnetwork \
texlive-mp3d \
texlive-mparrows \
texlive-mpattern \
texlive-mpchess \
texlive-mpcolornames \
texlive-mpgraphics \
texlive-mpkiviat \
texlive-mptrees \
texlive-piechartmp \
texlive-repere \
texlive-roex \
texlive-roundrect \
texlive-shapes \
texlive-slideshow \
texlive-splines \
texlive-suanpan \
texlive-textpath \
texlive-threeddice"

inherit rpm
