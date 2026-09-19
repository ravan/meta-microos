SUMMARY = "Recycle top matter"
DESCRIPTION = "Saves the arguments of \\author and \\title for reference (after \
\\maketitle) in a document. (\\maketitle simply disposes of the \
information, in the standard classes and some others.)"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn70885"

RPM_NAME = "texlive-rectopma-2026.226.svn70885-60.4.noarch.rpm"
RPM_HASH = "7343ab9e2770634a345526ed2659ed749e32af9906cd943f927ce72c68b544e88d5e6621ff6d9e4f6f71d17da4e6cd1c5821d92fc91ae3803f97e6c8f490a6a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rectopma.sty \
texlive-rectopma"

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
