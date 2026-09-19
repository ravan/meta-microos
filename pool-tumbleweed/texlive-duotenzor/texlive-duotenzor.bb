SUMMARY = "Drawing package for circuit and duotensor diagrams"
DESCRIPTION = "This is a drawing package for circuit and duotensor diagrams \
within LaTeX documents. It consists of about eighty commands, \
calling on TikZ for support."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.00svn76130"

RPM_NAME = "texlive-duotenzor-2026.226.1.00svn76130-59.2.noarch.rpm"
RPM_HASH = "3e000c052bca3a3eefb0bc4f12e3363c330e1242f6e75060509f8440a96bfbcbca810a4ff52ebafffc3dde4937964280d2dfb9ec2f2613947765d095bd7eb796"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-duotenzor.sty \
texlive-duotenzor"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
