SUMMARY = "Proper MLA formatting"
DESCRIPTION = "The package formats articles using the MLA style ('MLA' = \
'Modern Language Association'). The aim is that students and \
other academics in the humanities should be able to typeset \
their materials, properly, with minimal effort on their part."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn54080"

RPM_NAME = "texlive-mla-paper-2026.226.svn54080-61.2.noarch.rpm"
RPM_HASH = "096657dd86e7209b57bbc928693b8f0381c7ba48282c376f290a520cf415c8c60b1cb6532ff7494eef1ff3df677e2c4d5963b73d2359b2195c5e2fcb387ac69d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mla.sty \
texlive-mla-paper"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-fancyhdr.sty \
tex-graphicx.sty \
tex-thumbpdf.sty \
tex-times.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
