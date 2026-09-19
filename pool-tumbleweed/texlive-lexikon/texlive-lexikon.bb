SUMMARY = "Macros for a two language dictionary"
DESCRIPTION = "The lexikon package"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0csvn17364"

RPM_NAME = "texlive-lexikon-2026.226.1.0csvn17364-61.2.noarch.rpm"
RPM_HASH = "9ead1ecf6d7d5b4d2bf2654b71fe9ddf3fea42d5685891bac2afaef9d89fee6fcca6c7d0f6b93dede27d616b383b93ae675ac6c433ba3d70ffb6ed4bda4e88ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lexikon.sty \
texlive-lexikon"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ipa.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
