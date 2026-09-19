SUMMARY = "Detect pTeX and its derivatives"
DESCRIPTION = "The package provides commands for detecting pTeX and its \
derivatives (e-pTeX, upTeX, e-upTeX, and ApTeX). Both LaTeX and \
plain TeX are supported."
LICENSE = "SUSE-TeX"

PV = "2026.226.0.0.2svn46153"

RPM_NAME = "texlive-ifxptex-2026.226.0.0.2svn46153-60.2.noarch.rpm"
RPM_HASH = "91c87af924bb109bab727b4b5a61d78fe12ef2d020ecee20f7e9ba5be07d9e7298f595a29b9a1cdd8a0606c38c2261fc05d5a10cfe7675f761b2a6f54fa6529d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ifxptex.sty \
texlive-ifxptex"

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
