SUMMARY = "Korean"
DESCRIPTION = "Support for Korean; additional packages in collection-langcjk."
LICENSE = "LPPL-1.0"

PV = "2026.222.svn54074"

RPM_NAME = "texlive-collection-langkorean-2026.222.svn54074-68.2.noarch.rpm"
RPM_HASH = "2e6947ffbd90a2175dae0c3b54dae29a1ff9750bd32e333693f56b29d14d39761a7bb573309f4404db7e2c150a984970367be936df0ed613a6c65e7ffffce433"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
tex-korean \
texlive-collection-langkorean"

RDEPENDS:${PN} += "texlive-baekmuk \
texlive-cjk-ko \
texlive-collection-langcjk \
texlive-kotex-oblivoir \
texlive-kotex-plain \
texlive-kotex-utf \
texlive-kotex-utils \
texlive-lshort-korean \
texlive-nanumtype1 \
texlive-pmhanguljamo \
texlive-uhc \
texlive-unfonts-core \
texlive-unfonts-extra"

inherit rpm
