SUMMARY = "A font providing the 'recyclable' logo"
DESCRIPTION = "This single-character font is provided as Metafont source, and \
in Adobe Type 1 format. It is accompanied by a trivial LaTeX \
package to use the logo at various sizes."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-recycle-2026.226.svn15878-60.4.noarch.rpm"
RPM_HASH = "af893c8c5933fe90b2435bd9b50a8100095d265163d673f9451235e80208bdc2b69e5c845b6d89d42c52f528b19ca617ba54d025c160adaa3fd01e67246e7845"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-recycle.map \
tex-recycle.sty \
tex-recycle.tfm \
texlive-recycle"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-recycle-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
