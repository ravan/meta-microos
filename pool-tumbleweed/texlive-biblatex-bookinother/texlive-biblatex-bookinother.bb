SUMMARY = "Manage book edited in other entry type"
DESCRIPTION = "This package provides new BibLaTeX entry types and fields for \
book edited in other types, like for instance @bookinarticle. \
It offers more types than the older package \
biblatex-bookinarticle which it supersedes."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.3.3svn76924"

RPM_NAME = "texlive-biblatex-bookinother-2026.226.2.3.3svn76924-61.2.noarch.rpm"
RPM_HASH = "5f6b4afc76ba9952b1d7374bef926c5c963103940e40b62f0c78b062fc374a83d365f3b4d15e304c14283916c7caf7616ae0903eff999e82dd193b3bfc4c6809"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bookinother.bbx \
texlive-biblatex-bookinother"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
