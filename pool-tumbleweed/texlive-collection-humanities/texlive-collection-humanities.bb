SUMMARY = "Humanities packages"
DESCRIPTION = "Packages for law, linguistics, social sciences, humanities, \
etc."
LICENSE = "LPPL-1.0"

PV = "2026.222.svn75384"

RPM_NAME = "texlive-collection-humanities-2026.222.svn75384-68.2.noarch.rpm"
RPM_HASH = "fbce6add23df405c0359afd49315da9215bd5467b9f1bbc5811379579b5f698beca9c18b017632171ca3df86af8d9659563b65fa8a656840614a151a4dbb1fe5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
tex-humanities \
texlive-collection-humanities"

RDEPENDS:${PN} += "texlive-adtrees \
texlive-bibleref \
texlive-bibleref-lds \
texlive-bibleref-mouth \
texlive-bibleref-parse \
texlive-collection-latex \
texlive-covington \
texlive-diadia \
texlive-dramatist \
texlive-dvgloss \
texlive-ecltree \
texlive-edfnotes \
texlive-edmac \
texlive-eledform \
texlive-eledmac \
texlive-expex \
texlive-expex-glossonly \
texlive-gb4e \
texlive-gb4e-next \
texlive-gmverse \
texlive-interlinear \
texlive-jura \
texlive-juraabbrev \
texlive-juramisc \
texlive-jurarsp \
texlive-langnames \
texlive-ledmac \
texlive-lexikon \
texlive-lexref \
texlive-ling-macros \
texlive-linguex \
texlive-linguistix \
texlive-liturg \
texlive-liturgy-cw \
texlive-metrix \
texlive-nnext \
texlive-opbible \
texlive-parallel \
texlive-parrun \
texlive-phonrule \
texlive-plari \
texlive-play \
texlive-poemscol \
texlive-poetry \
texlive-poetrytex \
texlive-qobitree \
texlive-qtree \
texlive-reledmac \
texlive-rrgtrees \
texlive-rtklage \
texlive-screenplay \
texlive-screenplay-pkg \
texlive-sides \
texlive-stage \
texlive-textglos \
texlive-thalie \
texlive-theatre \
texlive-tree-dvips \
texlive-verse \
texlive-xyling"

inherit rpm
