SUMMARY = "Support for Indonesian within babel"
DESCRIPTION = "This is the babel style for Indonesian."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0nsvn77682"

RPM_NAME = "texlive-babel-indonesian-2026.226.1.0nsvn77682-60.2.noarch.rpm"
RPM_HASH = "70f60df7f44a2b7ad1aa4c78f88f66bdc4e36592287a7de8e97c4d6ddc8c2c73133010b18b44ecd562e4450e05d9f106f3115f6949318f4660bf64c11a2b2da8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bahasa.ldf \
tex-bahasai.ldf \
tex-indon.ldf \
tex-indonesian.ldf \
texlive-babel-indonesian"

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
