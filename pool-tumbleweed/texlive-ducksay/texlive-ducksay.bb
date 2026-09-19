SUMMARY = "Draw ASCII art of animals saying a specified message"
DESCRIPTION = "The package draws ASCII art of animals saying a specified \
message. The following macros are available: \\ducksay \
\\duckthink \\DefaultAnimal \\AddAnimal \\DucksayOptions Multi-line \
messages are now fully supported. The package comes with two \
versions, choosable with the version key."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.8svn76911"

RPM_NAME = "texlive-ducksay-2026.226.2.8svn76911-59.2.noarch.rpm"
RPM_HASH = "0558bf914a891840cdf1f20a9aa0ec92239db0db252aea1885ce8542edc80865f5b0453ed36dd722883a9def36417db3f753603dd725dbdec520f7e0c84b79cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ducksay.animals.tex \
tex-ducksay.code.v1.tex \
tex-ducksay.code.v2.tex \
tex-ducksay.sty \
texlive-ducksay"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-l3keys2e.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
