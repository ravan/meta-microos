SUMMARY = "LaTeX encoding tools for Bookhands fonts"
DESCRIPTION = "The package characterises and defines the author's B1 encoding \
for use with LaTeX when typesetting things using his Bookhands \
fonts."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn21271"

RPM_NAME = "texlive-b1encoding-2026.226.1.0svn21271-60.2.noarch.rpm"
RPM_HASH = "f4b4001edc0568410ffce067a0f042f6862f17462904315cd0e87b493e78695d07399d0cbef7e362f1c91a5e438daa3bd2017ae224038a1bdd4f1c567ab81faf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-TeXB1.enc \
tex-b1cmr.fd \
tex-b1enc.def \
texlive-b1encoding"

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
