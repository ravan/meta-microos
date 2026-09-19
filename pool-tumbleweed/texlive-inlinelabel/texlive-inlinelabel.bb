SUMMARY = "Assign equation numbers to inline equations"
DESCRIPTION = "This package can assign equation numbers to inline equations. \
When Japanese is supported, you can switch to circled equation \
numbers."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.1svn63853"

RPM_NAME = "texlive-inlinelabel-2026.226.1.2.1svn63853-60.2.noarch.rpm"
RPM_HASH = "5528c9543f816b75d8699e468e905cc38bc45337de05f1f41638150b7f706699f7e07acf6651a085b7a343ad507a3b8ed5fe64586a9f0515cf6599eeedd7d11f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-inlinelabel.sty \
texlive-inlinelabel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-luatexja-otf.sty \
tex-otf.sty \
tex-refcount.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
