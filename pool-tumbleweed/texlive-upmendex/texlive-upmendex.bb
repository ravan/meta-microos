SUMMARY = "Multilingual index processor"
DESCRIPTION = "The package is a multilingual index processor with the \
following features: Mostly compatible with makeindex and upper \
compatible with mendex. Supports UTF-8 and works with upLaTeX, \
XeLaTeX and LuaLaTeX. Supports Latin (including non-English), \
Greek, Cyrillic, Korean Hangul and Chinese Han (Hanzi \
ideographs) scripts, as well as Japanese Kana. Supports four \
kinds of sort orders (Pinyin, Radical-Stroke, Stroke and \
Zhuyin) for Chinese Han scripts (Hanzi ideographs). Support \
Brahmic (Bengali, Devanagari, Gurmukhi, Gujarati, Kannada, Lao, \
Malayalam, Oriya, Sinhala, Tamil, Telugu, Thai), Arabic and \
Hebrew scripts (experimental). Applies International Components \
for Unicode (ICU) for sorting process."
LICENSE = "BSD-3-Clause"

PV = "2026.226.1.22svn77845"

RPM_NAME = "texlive-upmendex-2026.226.1.22svn77845-60.2.noarch.rpm"
RPM_HASH = "8a6bf16fa291824884a206778f4fcfc5775fa49c6f9f5c417f92085c89256729d3b1b5967723ea9e9a869ee874449a01e71810390d4f8f8bae8f9ae733de437c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-upmendex.1 \
texlive-upmendex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-upmendex-bin"

inherit rpm
