SUMMARY = "Compile differently based on the filename"
DESCRIPTION = "This package allows to compile a document differently depending \
on the portion of the document's file name (internally, the \
\\jobname) that comes after the first '-' character. This allows \
one to have one source file and multiple links to this source \
file that each compile differently."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn64797"

RPM_NAME = "texlive-jobname-suffix-2026.226.1.0svn64797-63.2.noarch.rpm"
RPM_HASH = "692a8df1682e15b4239da0660361feb2d32bbacd3c7608506e068535c3f01b25f6402c8f0cedc7ff764e4e0386eaf72d64d65d8c0c2419921ad350af30cbe86e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-jobname-suffix.sty \
texlive-jobname-suffix"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
