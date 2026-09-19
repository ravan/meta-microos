SUMMARY = "German translation of the User Guide for BibLaTeX"
DESCRIPTION = "A German translation of the User Guide for BibLaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.15bsvn59382"

RPM_NAME = "texlive-translation-biblatex-de-2026.226.3.15bsvn59382-59.2.noarch.rpm"
RPM_HASH = "e3c72cb192b23ebd02a5c709ccd263518fae2da1c9b4bd81de652e4fa6e6b259ea249f0c7df5640d7ef55e4550cc73203527f8aa1edaf2f817752bcf5c8ba391"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-translation-biblatex-de"

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
