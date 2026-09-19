SUMMARY = "Metapackage to cause installation of the GAP Distribution"
DESCRIPTION = "GAP is a system for computational discrete algebra, with particular \
emphasis on Computational Group Theory. \
 \
This subpackage will pull in all optional packages of the GAP distribution."
LICENSE = "GPL-2.0-or-later"

PV = "4.16.1"

RPM_NAME = "gap-full-4.16.1-1.1.noarch.rpm"
RPM_HASH = "e57762331e0ca0c49cb29963492aac7448389cca3cf4b5111bf73f539cf320bda9e2f278637970f9c94632d5abfb3632a33cdad4971a372b6263b2e8c130016f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-full"

RDEPENDS:${PN} += "gap \
gap-4ti2interface \
gap-ace \
gap-aclib \
gap-agt \
gap-alco \
gap-alnuth \
gap-anupq \
gap-atlasrep \
gap-autodoc \
gap-automata \
gap-automgrp \
gap-autpgrp \
gap-browse \
gap-cap \
gap-caratinterface \
gap-cddinterface \
gap-circle \
gap-classicalmaximals \
gap-classicpres \
gap-cohomolo \
gap-congruence \
gap-corefreesub \
gap-corelg \
gap-crime \
gap-crisp \
gap-crypting \
gap-cryst \
gap-crystcat \
gap-ctbllib \
gap-cubefree \
gap-curlinterface \
gap-cvec \
gap-datastructures \
gap-deepthought \
gap-design \
gap-difsets \
gap-digraphs \
gap-edim \
gap-example \
gap-examplesforhomalg \
gap-factint \
gap-ferret \
gap-fga \
gap-fining \
gap-float \
gap-format \
gap-forms \
gap-fplsa \
gap-fr \
gap-fwtree \
gap-gapdoc \
gap-gauss \
gap-gaussforhomalg \
gap-gbnp \
gap-generalizedmorphismsforcap \
gap-genss \
gap-gradedmodules \
gap-gradedringforhomalg \
gap-grape \
gap-groupoids \
gap-grpconst \
gap-guarana \
gap-guava \
gap-hap \
gap-hapcryst \
gap-hecke \
gap-help \
gap-homalg \
gap-homalgtocas \
gap-ibnp \
gap-idrel \
gap-images \
gap-inducereduce \
gap-intpic \
gap-io \
gap-io-forhomalg \
gap-irredsol \
gap-itc \
gap-json \
gap-kan \
gap-kbmag \
gap-laguna \
gap-liealgdb \
gap-liepring \
gap-liering \
gap-linearalgebraforcap \
gap-lins \
gap-localizeringforhomalg \
gap-localnr \
gap-loops \
gap-lpres \
gap-majoranaalgebras \
gap-mapclass \
gap-matgrp \
gap-matricesforhomalg \
gap-modisom \
gap-modulargroup \
gap-modules \
gap-monoidalcategories \
gap-nconvex \
gap-nilmat \
gap-nock \
gap-nofoma \
gap-normalizinterface \
gap-nq \
gap-numericalsgps \
gap-openmath \
gap-orb \
gap-patternclass \
gap-permut \
gap-polenta \
gap-polycyclic \
gap-polymaking \
gap-primgrp \
gap-profiling \
gap-qdistrnd \
gap-qpa \
gap-quagroup \
gap-radiroot \
gap-rcwa \
gap-rds \
gap-recog \
gap-repndecomp \
gap-repsn \
gap-resclasses \
gap-ringsforhomalg \
gap-sco \
gap-scscp \
gap-semigroups \
gap-sglppow \
gap-sgpviz \
gap-simpcomp \
gap-singular \
gap-sl2reps \
gap-sla \
gap-smallantimagmas \
gap-smallclassnr \
gap-smallgrp \
gap-smallsemi \
gap-sonata \
gap-sophus \
gap-sotgrps \
gap-spinsym \
gap-standardff \
gap-symbcompcc \
gap-thelma \
gap-tomlib \
gap-toolsforhomalg \
gap-toric \
gap-transgrp \
gap-twistedconjugacy \
gap-typeset \
gap-ugaly \
gap-unipot \
gap-unitlib \
gap-utils \
gap-uuid \
gap-walrus \
gap-wedderga \
gap-wpe \
gap-xgap \
gap-xmod \
gap-xmodalg \
gap-yangbaxter \
gap-zeromqinterface"

inherit rpm
