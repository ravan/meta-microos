SUMMARY = "Underline text allowing line breaking"
DESCRIPTION = "Provides commands \\Underline, \\Midline and \\Overline for \
underlining, striking out, and overlining their text arguments."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn19085"

RPM_NAME = "texlive-umoline-2026.226.svn19085-60.2.noarch.rpm"
RPM_HASH = "7fe4862dc55a0e5ca0b31b9e57f3e43fc4cca2d8d443c1383e40b4c265557dce21f071691d3420a7c492bab80e7d305797961306e90f5a10b579329c010b7eff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-umoline.sty \
texlive-umoline"

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
