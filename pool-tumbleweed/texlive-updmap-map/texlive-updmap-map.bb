SUMMARY = "Auto-generated font map files"
DESCRIPTION = "These map files are regenerated every time a new font is added. \
There is no need to rebuild formats or update binaries because \
of such updates, hence this separate package."
LICENSE = "LPPL-1.0"

PV = "2026.222.svn54495"

RPM_NAME = "texlive-updmap-map-2026.222.svn54495-68.2.noarch.rpm"
RPM_HASH = "bd9e69ea9bb00262539fbae01acf7e2f1cfacdc8191510260d91ff5b42e0050f026283542777a4efd14bc893fb086328678414d6be347b101ebf54cb1f307133"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-builtin35.map \
tex-download35.map \
tex-kanjix.map \
tex-pdftex-dl14.map \
tex-pdftex-ndl14.map \
tex-pdftex.map \
tex-ps2pk.map \
tex-psfonts-pk.map \
tex-psfonts-t1.map \
tex-psfonts.map \
texlive-updmap-map"

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
