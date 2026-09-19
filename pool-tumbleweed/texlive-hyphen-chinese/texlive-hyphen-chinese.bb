SUMMARY = "Chinese pinyin hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for unaccented transliterated Mandarin \
Chinese (pinyin) in T1/EC and UTF-8 encodings. The latter can \
hyphenate pinyin with or without tone markers; the former only \
without."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78069"

RPM_NAME = "texlive-hyphen-chinese-2026.226.svn78069-60.2.noarch.rpm"
RPM_HASH = "215599514076bb51dd8991dd6a776d2ed34bbd09b9b55a850e74db4f7423b6f85d88097688d2dda919f18228cff0ca5f5ef27258d90ce65978240c87760394aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-zh-latn-pinyin.ec.tex \
tex-hyph-zh-latn-pinyin.tex \
tex-loadhyph-zh-latn-pinyin.tex \
texlive-hyphen-chinese"

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
texlive-filesystem \
texlive-hyph-utf8 \
texlive-hyphen-base \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
