SUMMARY = "Kana parser for LuaTeX"
DESCRIPTION = "The package provides a kana parser for LuaTeX. It is a set of 4 \
macros that handle transliteration of text: from hiragana and \
katakana to Latin from Latin and katakana to hiragana from \
Latin and hiragana to katakana It can be used to write kana \
directly using only the ASCII character set or for education \
purposes. The package has support for obsolete and rarely used \
syllables, some only accessible via the provided toggle macro."
LICENSE = "BSD-3-Clause"

PV = "2026.226.1.0svn48052"

RPM_NAME = "texlive-kanaparser-2026.226.1.0svn48052-63.2.noarch.rpm"
RPM_HASH = "dc7e06eb65e4031522d5a215687db7e5d9c149b5fe7a4d94075b10b138786283921c6a963e1ef4a318fcad3abe1e9db98ff446e344d22688213cafb52fb2aa8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-kanaparser.tex \
texlive-kanaparser"

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
texlive-scripts-bin"

inherit rpm
