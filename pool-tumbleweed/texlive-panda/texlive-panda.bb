SUMMARY = "A package to estimate the blackness of fonts"
DESCRIPTION = "One challenge when drawing icons or symbols can be to make them \
blend in with the surrounding text. If their line widths look \
good with one font, they can stand out like a sore thumb with \
another font. The panda package provides tools to automatically \
adjust line widths etc. to fit in with the surrounding font."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn78101"

RPM_NAME = "texlive-panda-2026.226.0.0.3svn78101-58.2.noarch.rpm"
RPM_HASH = "f9f87af47230eb51d629e4bf054d85f7f21741fe2f520a21377e98d40a1ee63d0fb313fddc106d007e4da8f9ea473e3fa9f6cd52db1be206e6ee2eb4f64f1943"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-BusyPanda.sty \
tex-CleverPanda.sty \
tex-panda.sty \
texlive-panda"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expkv.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
