SUMMARY = "Adaptable tables"
DESCRIPTION = "The package allows data, text (including (La)TeX commands or \
environments) to be formatted into a array which may be split."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn30991"

RPM_NAME = "texlive-nox-2026.226.1.0svn30991-61.2.noarch.rpm"
RPM_HASH = "e57f3850d8c937f2c0d71b5cf5e1e28dfb9ba32309a5fe23c857a3051ea6fc929de36ccfbc9d8751573e9e1c34e2031f1cf3d8d8ff80e3decba700e774fe7c03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nox.sty \
texlive-nox"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-longtable.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
