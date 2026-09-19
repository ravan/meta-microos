SUMMARY = "Transliterate text from 'other' alphabets"
DESCRIPTION = "The package will read text in one alphabet, and provide a \
transliterated version in another; this is useful for readers \
who cannot read the original alphabet. The package can make \
allowance for hyphenation."
LICENSE = "BSD-3-Clause"

PV = "2026.226.svn61127"

RPM_NAME = "texlive-context-transliterator-2026.226.svn61127-61.2.noarch.rpm"
RPM_HASH = "06f43a48da35413eee35cb4d8a231ee9b92c836c1b440b47f217b3410c83d567959b00108867f1add81765b3727276e994757e486cec6d9241b5642d300ff0a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-t-transliterator.tex \
texlive-context-transliterator"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/texlua \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-context \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
