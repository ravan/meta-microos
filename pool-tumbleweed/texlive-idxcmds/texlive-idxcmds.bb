SUMMARY = "Semantic commands for adding formatted index entries"
DESCRIPTION = "The package provides commands for adding formatted index \
entries; it arises from the author's work on large documents."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2csvn54554"

RPM_NAME = "texlive-idxcmds-2026.226.0.0.2csvn54554-60.2.noarch.rpm"
RPM_HASH = "98f1494f1eca354ddaaddb2c91f64af3da54c02f78f7a2d69225ba9e9ee251e33a04745cf91e6596a34e411012ab9389a2713eee3d904112e9608cdf78c69fdb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-idxcmds.sty \
texlive-idxcmds"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-ltxcmds.sty \
tex-pgfopts.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
