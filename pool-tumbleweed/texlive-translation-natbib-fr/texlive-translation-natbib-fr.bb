SUMMARY = "French translation of the documentation of natbib"
DESCRIPTION = "A French translation of the documentation of natbib."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn25105"

RPM_NAME = "texlive-translation-natbib-fr-2026.226.svn25105-59.2.noarch.rpm"
RPM_HASH = "9030ec92f5038e8b4b180898df7704e2e0eb7af3d4d8fd9746ffc8aee788f02a85ecb6e27870cf69f7e113dc9636353791d5109189217b56ac7f9783579f8de5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-translation-natbib-fr"

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
