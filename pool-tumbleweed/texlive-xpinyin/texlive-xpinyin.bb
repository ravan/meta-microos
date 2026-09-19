SUMMARY = "Automatically add pinyin to Chinese characters"
DESCRIPTION = "The package is written to simplify the input of Hanyu Pinyin. \
Macros are provided that automatically add pinyin to Chinese \
characters."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.1svn77682"

RPM_NAME = "texlive-xpinyin-2026.226.3.1svn77682-59.4.noarch.rpm"
RPM_HASH = "dde6f968896a4de9671471222bac8b6815f5497570258a51f4e9c4873f0de4ad132c5a410ec76842249b686f3675a4097230b6af7333cd44f1425b345dd83d18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xpinyin-database.def \
tex-xpinyin.sty \
texlive-xpinyin"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-CJKutf8.sty \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-xCJK2uni.sty \
tex-xeCJK.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
