SUMMARY = "Conditionally include text"
DESCRIPTION = "Defines macros \\includeversion{NAME} and \\excludeversion{NAME}, \
each of which defines an environment NAME whose text is to be \
included or excluded from compilation. Although the command \
syntax is very similar to that of comment, comment.sty is to be \
preferred to version.sty for documents where significant chunks \
of text may be excluded."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn77682"

RPM_NAME = "texlive-version-2026.226.2.0svn77682-60.2.noarch.rpm"
RPM_HASH = "766b8ff9cd0af0826d3c8e47f81d35d5f9604e76631cc101b8846e36a78844876a6d5ab339e9e0f2ef7623cea719a3a454742b27072d8e33d4f33ad75f582df3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-version.sty \
texlive-version"

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
