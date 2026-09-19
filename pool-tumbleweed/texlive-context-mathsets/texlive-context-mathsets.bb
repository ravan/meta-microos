SUMMARY = "Set notation in ConTeXt"
DESCRIPTION = "Typeset good-looking set notation (e.g., {x|x \\in Y}), as well \
as similar things such as Dirac bra-ket notation, conditional \
probabilities, etc. The package is at least inspired by braket."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn47085"

RPM_NAME = "texlive-context-mathsets-2026.226.svn47085-61.2.noarch.rpm"
RPM_HASH = "c37a48b87879d5a35e69015eb3e8d6596f3d1073b37ed4e60eb31807e9075d12d7980d6a2a7a5729d53236b6d22dac64e4dc11d49def92f967a0e1a0ccb388a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-t-mathsets.tex \
texlive-context-mathsets"

RDEPENDS:${PN} += "/usr/bin/sh \
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
