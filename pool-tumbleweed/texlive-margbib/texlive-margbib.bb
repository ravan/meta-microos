SUMMARY = "Display bibitem tags in the margins"
DESCRIPTION = "The package redefines the 'thebibliography' environment to \
place the citation key into the margin."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.0csvn15878"

RPM_NAME = "texlive-margbib-2026.226.1.0csvn15878-59.2.noarch.rpm"
RPM_HASH = "3ded45243d1cb2bec579122f0202a9e6bf79fda963eeac28a6bfee4b4343c8003677342ca055b0d34cbceb3a01b9a280b3710290052bf16deb4bae3b75979380"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-margbib.sty \
texlive-margbib"

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
