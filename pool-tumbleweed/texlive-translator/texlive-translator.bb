SUMMARY = "Easy translation of strings in LaTeX"
DESCRIPTION = "This LaTeX package provides a flexible mechanism for \
translating individual words into different languages. For \
example, it can be used to translate a word like 'figure' into, \
say, the German word 'Abbildung'. Such a translation mechanism \
is useful when the author of some package would like to \
localize the package such that texts are correctly translated \
into the language preferred by the user. This package is not \
intended to be used to automatically translate more than a few \
words."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.12dsvn77682"

RPM_NAME = "texlive-translator-2026.226.1.12dsvn77682-59.2.noarch.rpm"
RPM_HASH = "1adda8efa9be2fe4f7450e20a6e35cb10fb4e74bbc8281dd2a4876bb535be7d85a88a68bee8171805085aaa006d1aba47f7a27b4b72a2ff8136819cc8fc284ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-translator.sty \
texlive-translator"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
