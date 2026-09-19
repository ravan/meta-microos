SUMMARY = "An easy way to typeset any part of The Holy Quran"
DESCRIPTION = "This package offers the user an easy way to typeset The Holy \
Quran. It has been inspired by the lipsum and ptext packages \
and provides several macros for typesetting the whole or any \
part of the Quran based on its popular division, including \
surah, ayah, juz, hizb, quarter, and page. Besides the Arabic \
original, translations to English, German, French, and Persian \
are provided, as well as an English transliteration."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.41svn75029"

RPM_NAME = "texlive-quran-2026.226.2.41svn75029-60.4.noarch.rpm"
RPM_HASH = "0006d1e7b03f242c8e0d6c12d79e4a65b9bc27193a3e1479fe9bf5b407d7b36d64faf426318766a4a1dcb4546701ccf61780a449672cd924c7de0539f8465fcf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-quran-transde.def \
tex-quran-transen.def \
tex-quran-transfa.def \
tex-quran-transfr.def \
tex-quran-translt.def \
tex-quran.sty \
tex-qurantext-de.translation.def \
tex-qurantext-en.translation.def \
tex-qurantext-en.transliteration.def \
tex-qurantext-fa.translation.def \
tex-qurantext-fr.translation.def \
tex-qurantext-simple.def \
tex-qurantext-uthmani-min.def \
tex-qurantext-uthmani.def \
texlive-quran"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-biditools.sty \
tex-ifxetex.sty \
tex-listofitems.sty \
tex-xkeyval.sty \
tex-xparse.sty \
tex-xspace.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
