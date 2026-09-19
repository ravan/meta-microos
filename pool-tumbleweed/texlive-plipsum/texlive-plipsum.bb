SUMMARY = "'Lorem ipsum' for Plain TeX developers"
DESCRIPTION = "The package provides a paragraph generator designed for use in \
Plain TeX documents. The paragraphs generated contain many \
'f-groups' (ff, fl etc.) so the text can act as a test of the \
ligatures of the font in use."
LICENSE = "LPPL-1.0"

PV = "2026.226.4.3svn30353"

RPM_NAME = "texlive-plipsum-2026.226.4.3svn30353-59.2.noarch.rpm"
RPM_HASH = "e33d24cf0c7e6f7204d22513ed23832c072380b903fadd9cfac08cb8961d35dcb1d49201e8284f6ecbc43b38d72cfe01ccaae50313c0d35783d439f2f5b3b4ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-plipsum.tex \
texlive-plipsum"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
