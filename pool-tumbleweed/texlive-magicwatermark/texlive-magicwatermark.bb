SUMMARY = "An easy and flexible way to set watermarks"
DESCRIPTION = "This package can flexibly set and clear watermarks. It is based \
on everypage and TikZ, encapsulated by LaTeX3. All watermark \
content is placed inside a TikZ node in the center of the page."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2bsvn76924"

RPM_NAME = "texlive-magicwatermark-2026.226.1.2bsvn76924-59.2.noarch.rpm"
RPM_HASH = "3e5a9fbfad4ef768ac9f4a8360d3231d6cf7774d0db44384ac6ee9858d447e24a5efd604b81f6773e502828f2383b6943e35e5fac79e08914116f3ea60ad1455"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-magicwatermark.sty \
texlive-magicwatermark"

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
