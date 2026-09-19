SUMMARY = "Uppercase the first letter of a word"
DESCRIPTION = "The package provides commands \\makefirstuc that uppercases the \
first letter in its argument (with a check for a semantic \
markup command at the start of the argument), and \
\\xmakefirstuc, which expands the argument before uppercasing. \
It also provides \\capitalisewords{phrase} which applies \
\\makefirstuc to each word in the phrase, where the words are \
separated by regular spaces. (Exceptions can be made for words \
that shouldn't be converted.)"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.09svn77682"

RPM_NAME = "texlive-mfirstuc-2026.226.2.09svn77682-61.2.noarch.rpm"
RPM_HASH = "27f20e825d0cdf9f615466e6f1d0ee2cd0f1bbf6cf3de6c0e930a835de129873071a1d2b39227422e6fc4cd880e10a48f6a7a127c547cbe6bba99b1b102ca064"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mfirstuc-2021-10-15.sty \
tex-mfirstuc-english.sty \
tex-mfirstuc.sty \
texlive-mfirstuc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
