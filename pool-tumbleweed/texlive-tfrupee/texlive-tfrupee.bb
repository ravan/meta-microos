SUMMARY = "A font offering the new (Indian) Rupee symbol"
DESCRIPTION = "The package provides LaTeX support for the (Indian) Rupee \
symbol font, created by TechFat. The original font has been \
converted to Adobe Type 1 format, and simple LaTeX support \
written for its use."
LICENSE = "GPL-2.0-or-later"

PV = "2026.227.1.02svn20770"

RPM_NAME = "texlive-tfrupee-2026.227.1.02svn20770-62.2.noarch.rpm"
RPM_HASH = "e0a95f90f75c6800949b60c7da3b549e719eca2ddbdeef2ce5554989c8bac1c5f2f156904e2fd5e635142cfeac7a5dfed276c63c42d22ad0e4464fbce75a1f8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tfrupee.map \
tex-tfrupee.sty \
tex-tfrupee.tfm \
texlive-tfrupee"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-tfrupee-fonts"

inherit rpm
