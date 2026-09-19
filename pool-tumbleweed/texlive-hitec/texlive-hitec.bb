SUMMARY = "Class for documentation"
DESCRIPTION = "An article-based class designed for use for documentation in \
high-technology companies."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.0betasvn15878"

RPM_NAME = "texlive-hitec-2026.226.0.0.0betasvn15878-60.4.noarch.rpm"
RPM_HASH = "75f5320b5ab80f684d0f7d5e2d62ff668a21cf433c07727250c6cd171f7f2f9867749e4aa5ea06dca3c6e93ee06791ddbf9abf2be46f7c52fc18510ef3249be3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hitec.cls \
texlive-hitec"

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
