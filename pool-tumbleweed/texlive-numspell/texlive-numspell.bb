SUMMARY = "Spelling cardinal and ordinal numbers"
DESCRIPTION = "This package supports the spelling of cardinal and ordinal \
numbers. Supported languages are English, French, German, \
Hungarian, Italian, and Latin. The package requires xstring and \
iflang."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.9svn77682"

RPM_NAME = "texlive-numspell-2026.226.1.9svn77682-61.2.noarch.rpm"
RPM_HASH = "2abaac6b5a4997e73c4fd337adcc70d2c7753d234d982cc0f79cdf064091e19c15d8e4a62114f618390324aeb6625ce1f6b29e31b66b90eac9cd6fb3f75bc3f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-numspell-english.sty \
tex-numspell-french.sty \
tex-numspell-german.sty \
tex-numspell-italian.sty \
tex-numspell-latin.sty \
tex-numspell-magyar.sty \
tex-numspell.sty \
texlive-numspell"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iflang.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
