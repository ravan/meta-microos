SUMMARY = "Print a number in 'appropriate' format"
DESCRIPTION = "The package defines two macros which decide to typeset a number \
either as an Arabic number or as a word (or words) for the \
number. If the number is between zero and twelve (including \
zero and twelve) then words will be used; if the number is \
outside that range, it will be typeset using the package \
numprint Words for English representation of numbers are \
generated within the package, while those for German are \
generated using the package zahl2string."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1asvn77682"

RPM_NAME = "texlive-fnumprint-2026.226.1.1asvn77682-60.2.noarch.rpm"
RPM_HASH = "557044e8fb444ff824113e1716c28bf05dc6512f8f91ecf0d9c7b43f2e1638de0ee004be5380b675df972fe105dcead5e279a6edeb8d365ba2343c85362f3c0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fnumprint.sty \
texlive-fnumprint"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-numprint.sty \
tex-xifthen.sty \
tex-zahl2string.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
