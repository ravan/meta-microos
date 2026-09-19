SUMMARY = "LaTeX fundamental packages"
DESCRIPTION = "These packages are either mandated by the core LaTeX team, or \
very widely used and strongly recommended in practice."
LICENSE = "LPPL-1.0"

PV = "2026.222.svn77034"

RPM_NAME = "texlive-collection-latex-2026.222.svn77034-68.2.noarch.rpm"
RPM_HASH = "ca80efbe0242ca55b510b284e439d8752242b22304fe1faad1c12e526ccb0c09b1a49ecd3a2086e2e9414a3d98d4daa24feed8392eacbaa45b22f40e1fc1cc06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
tex-latex \
texlive-collection-latex"

RDEPENDS:${PN} += "texlive-ae \
texlive-amscls \
texlive-amsmath \
texlive-atbegshi \
texlive-atveryend \
texlive-auxhook \
texlive-babel \
texlive-babel-english \
texlive-babelbib \
texlive-bigintcalc \
texlive-bitset \
texlive-bookmark \
texlive-carlisle \
texlive-collection-basic \
texlive-colortbl \
texlive-epstopdf-pkg \
texlive-etexcmds \
texlive-etoolbox \
texlive-fancyhdr \
texlive-firstaid \
texlive-fix2col \
texlive-geometry \
texlive-gettitlestring \
texlive-graphics \
texlive-graphics-cfg \
texlive-grfext \
texlive-hopatch \
texlive-hycolor \
texlive-hypcap \
texlive-hyperref \
texlive-intcalc \
texlive-kvdefinekeys \
texlive-kvoptions \
texlive-kvsetkeys \
texlive-l3backend \
texlive-l3kernel \
texlive-l3packages \
texlive-latex \
texlive-latex-bin \
texlive-latex-fonts \
texlive-latex-lab \
texlive-latexconfig \
texlive-letltxmacro \
texlive-ltxcmds \
texlive-ltxmisc \
texlive-lua-uni-algos \
texlive-mfnfss \
texlive-mptopdf \
texlive-natbib \
texlive-oberdiek \
texlive-pagesel \
texlive-pdfescape \
texlive-pdftexcmds \
texlive-pslatex \
texlive-psnfss \
texlive-pspicture \
texlive-refcount \
texlive-rerunfilecheck \
texlive-stringenc \
texlive-tools \
texlive-uniquecounter \
texlive-url"

inherit rpm
