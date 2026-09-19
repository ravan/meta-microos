SUMMARY = "Convenient and uniform references to legal provisions"
DESCRIPTION = "The package is aimed at continental lawyers (especially those \
in Switzerland and Germany), allowing the user to make \
references to legal provisions conveniently and uniformly. The \
package also allows the user to add cited Acts to a \
nomenclature list (automatically), and to build specific \
indexes for each cited Act. The package is still under \
development, and should be treated as an 'alpha'-release."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1asvn36026"

RPM_NAME = "texlive-lexref-2026.226.1.1asvn36026-61.2.noarch.rpm"
RPM_HASH = "35ff17f229b919a5abae79f25193f9a682e73649f8dca231b20c71368c80fec6b9c7773d8198feedc8a175653d1bfcdd766ba695fe39f828ba913401fbf40a73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lexref.sty \
texlive-lexref"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-ifthen.sty \
tex-nomencl.sty \
tex-splitidx.sty \
tex-stringstrings.sty \
tex-xargs.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
