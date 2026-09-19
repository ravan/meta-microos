SUMMARY = "Localisation support for TeX and LaTeX documents"
DESCRIPTION = "This package uses both tracklang and texosquery to look up the \
locale information from the operating system and provide \
commands that can access locale-dependent information, such as \
the currency symbol and decimal separator. The file \
tex-locale.tex provides generic TeX code. The LaTeX package \
tex-locale.sty can additionally load babel or polyglossia with \
the locale's language setting, as well as various other \
packages such as fontspec (XeLaTeX/LuaLaTeX) or fontenc + \
inputenc (pdfLaTeX)."
LICENSE = "LPPL-1.0"

PV = "2026.227.1.0svn77682"

RPM_NAME = "texlive-tex-locale-2026.227.1.0svn77682-62.2.noarch.rpm"
RPM_HASH = "a68f5a7f01694992ca1b88e72c89eec6be706a78dbd358ec727548fa1fc6e1e81c76361be184c6ba15c8fad48f050066ed03714f1cc0d9a33c952a1af0d133ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tex-locale-encodings.def \
tex-tex-locale-scripts-enc.def \
tex-tex-locale-support.def \
tex-tex-locale.sty \
tex-tex-locale.tex \
texlive-tex-locale"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-CJK.sty \
tex-CJKutf8.sty \
tex-babel.sty \
tex-datetime2.sty \
tex-etoolbox.sty \
tex-fontenc.sty \
tex-fontspec.sty \
tex-ifluatex.sty \
tex-ifxetex.sty \
tex-inputenc.sty \
tex-pinyin.sty \
tex-polyglossia.sty \
tex-texosquery.sty \
tex-tracklang-scripts.sty \
tex-tracklang.sty \
tex-xeCJK.sty \
tex-xfor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
