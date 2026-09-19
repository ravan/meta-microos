SUMMARY = "Spanish Translations for the quran package"
DESCRIPTION = "The package is designed for typesetting several Spanish \
translations of the Holy Quran. It extends the quran package by \
adding three additional Spanish translations."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.11svn74874"

RPM_NAME = "texlive-quran-es-2026.226.0.0.11svn74874-60.4.noarch.rpm"
RPM_HASH = "a8582f0fbd45e8ebf34fc93bd00854d4054e9611c6b28e8fe1e9d09023e2883e71f7ad774301975d8a1e9b513f3ae3cb8a8c11c8ada5dac42e879663cd5d123d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-quran-es.sty \
tex-qurantext-esi.translation.def \
tex-qurantext-esii.translation.def \
tex-qurantext-esiii.translation.def \
texlive-quran-es"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-biditools.sty \
tex-quran.sty \
tex-xkeyval.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
