SUMMARY = "Include a glossary into a document"
DESCRIPTION = "The package provides the means to include a glossary into a \
document. The glossary is prepared by an external program, such \
as xindy or makeindex, in the same way that an index is made."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-makeglos-2026.226.svn15878-59.2.noarch.rpm"
RPM_HASH = "67692922ef3850c97a07dd81e0ad1a3a92ca276c39c7a9a58e5f5eb45a72991addb7fdab1c7647b085ad2dd678b009287f04ed8eba941ca065de17bbf434284d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-makeglos.sty \
texlive-makeglos"

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
