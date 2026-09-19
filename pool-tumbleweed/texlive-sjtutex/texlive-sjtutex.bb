SUMMARY = "LaTeX classes for Shanghai Jiao Tong University"
DESCRIPTION = "SJTUTeX aims to establish a simple and easy-to-use collection \
of document classes for Shanghai Jiao Tong University, \
including the thesis document class sjtuthesis, as well as the \
regular document classes sjtuarticle and sjtureport."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.3.1svn78164"

RPM_NAME = "texlive-sjtutex-2026.226.2.3.1svn78164-64.2.noarch.rpm"
RPM_HASH = "19413b2bba24bd3a302eeef6c9bf84cb3e7c9faf4f8ffc476f3ec27deb4d24aec8d9c8dbbe78ef87022bc27636b968b5ecc8f4f1ab60571057b2076da396d13b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sjtu-article-preset-base.def \
tex-sjtu-cjk-font-adobe.def \
tex-sjtu-cjk-font-fandol.def \
tex-sjtu-cjk-font-founder.def \
tex-sjtu-cjk-font-hanyi.def \
tex-sjtu-cjk-font-mac.def \
tex-sjtu-cjk-font-ubuntu.def \
tex-sjtu-cjk-font-windows.def \
tex-sjtu-lang-de.def \
tex-sjtu-lang-en.def \
tex-sjtu-lang-ja.def \
tex-sjtu-lang-zh.def \
tex-sjtu-math-font-cambria.def \
tex-sjtu-math-font-libertinus.def \
tex-sjtu-math-font-lm.def \
tex-sjtu-math-font-newcm.def \
tex-sjtu-math-font-newpx.def \
tex-sjtu-math-font-newtx.def \
tex-sjtu-math-font-stixtwo.def \
tex-sjtu-math-font-times.def \
tex-sjtu-math-font-xits.def \
tex-sjtu-report-preset-base.def \
tex-sjtu-scheme-de.def \
tex-sjtu-scheme-en.def \
tex-sjtu-scheme-ja.def \
tex-sjtu-scheme-zh.def \
tex-sjtu-text-font-cambria.def \
tex-sjtu-text-font-libertinus.def \
tex-sjtu-text-font-lm.def \
tex-sjtu-text-font-newcm.def \
tex-sjtu-text-font-newpx.def \
tex-sjtu-text-font-newtx.def \
tex-sjtu-text-font-stixtwo.def \
tex-sjtu-text-font-times.def \
tex-sjtu-text-font-xits.def \
tex-sjtu-thesis-preset-base.def \
tex-sjtuarticle.cls \
tex-sjtureport.cls \
tex-sjtuthesis.cls \
texlive-sjtutex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-amssymb.sty \
tex-bm.sty \
tex-cmupint.sty \
tex-libertinust1math.sty \
tex-mathptmx.sty \
tex-newpxmath.sty \
tex-newpxtext.sty \
tex-newtxmath.sty \
tex-newtxtext.sty \
tex-pageslts.sty \
tex-pdfpages.sty \
tex-stix2.sty \
tex-translations.sty \
tex-unicode-math.sty \
tex-upgreek.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
