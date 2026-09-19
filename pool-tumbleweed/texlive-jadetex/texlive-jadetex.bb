SUMMARY = "Macros supporting Jade DSSSL output"
DESCRIPTION = "Macro package on top of LaTeX to typeset TeX output of the Jade \
DSSSL implementation."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.13svn71409"

RPM_NAME = "texlive-jadetex-2026.226.3.13svn71409-63.2.noarch.rpm"
RPM_HASH = "abc6b8ce819272505dae9cc31c751b2787da35eecd4eada75e195904547c8c52f21b1f6c088941855dbe701cb4cb8388e5dd45409da7c8f02b60c88f3a3013ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dsssl.def \
tex-uentities.sty \
tex-ut1omlgc.fd \
texlive-jadetex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-language.dat \
tex-language.dat.lua \
tex-language.def \
texlive \
texlive-amsfonts \
texlive-babel \
texlive-bigintcalc \
texlive-bitset \
texlive-cm \
texlive-colortbl \
texlive-courier \
texlive-cyrillic \
texlive-dehyph \
texlive-ec \
texlive-etoolbox \
texlive-fancyhdr \
texlive-filesystem \
texlive-firstaid \
texlive-gettitlestring \
texlive-graphics \
texlive-graphics-cfg \
texlive-graphics-def \
texlive-helvetic \
texlive-hycolor \
texlive-hyperref \
texlive-hyph-utf8 \
texlive-hyphen-base \
texlive-iftex \
texlive-infwarerr \
texlive-intcalc \
texlive-jadetex-bin \
texlive-knuth-lib \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-kvdefinekeys \
texlive-kvoptions \
texlive-kvsetkeys \
texlive-l3backend \
texlive-l3kernel \
texlive-latex \
texlive-latex-fonts \
texlive-ltxcmds \
texlive-marvosym \
texlive-passivetex \
texlive-pdfescape \
texlive-pdftex \
texlive-pdftexcmds \
texlive-psnfss \
texlive-refcount \
texlive-rerunfilecheck \
texlive-scripts \
texlive-scripts-bin \
texlive-stmaryrd \
texlive-stringenc \
texlive-symbol \
texlive-tex \
texlive-tex-ini-files \
texlive-times \
texlive-tipa \
texlive-tools \
texlive-ulem \
texlive-unicode-data \
texlive-uniquecounter \
texlive-url \
texlive-wasysym \
texlive-zapfding"

inherit rpm
