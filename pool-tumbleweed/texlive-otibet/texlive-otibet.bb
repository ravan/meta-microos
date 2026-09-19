SUMMARY = "Support for Tibetan using Omega"
DESCRIPTION = "The otibet package"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn45777"

RPM_NAME = "texlive-otibet-2026.226.svn45777-61.2.noarch.rpm"
RPM_HASH = "84dbeaf8b0c7294885bf60ddc49dbcc921cc6e659de48337fe0f1f96e15adcdecab0f7b95b820d94ad03ddb1176241b30acac8d5d812b9fd110575d7fbc57ad5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ot1tib.fd \
tex-otibet.sty \
tex-otibet.tex \
tex-t1tib.fd \
tex-tibetan.tfm \
texlive-otibet"

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
