SUMMARY = "Luxury frontend to the \\index command"
DESCRIPTION = "Provides a convenient front-end for the \\index command. For \
example, with it you can generate multiple index entries in \
almost any form by a single command. The package is highly \
customizable, and works with all versions of LaTeX and probably \
most other TeX formats."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.3svn32262"

RPM_NAME = "texlive-varindex-2026.226.2.3svn32262-60.2.noarch.rpm"
RPM_HASH = "744bac1b09bb6770c74fd568c450c879b38cfe06477de391c53dbb72a283a44e9a4ef5e280bc257b3c31b112c6373fb1576cb54e50f215b7db515f2783022e85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-varindex.sty \
texlive-varindex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-toolbox.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
