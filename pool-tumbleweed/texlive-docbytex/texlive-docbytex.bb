SUMMARY = "Creating documentation from source code"
DESCRIPTION = "The package creates documentation from C source code, or other \
programming languages."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn34294"

RPM_NAME = "texlive-docbytex-2026.226.svn34294-59.2.noarch.rpm"
RPM_HASH = "e2207f11c8ca8765ca0d3ea5301cc314a92efafbc53f15a0b0597e8f46ffcc9b2c3d988fa83cfb94eff329f791bc2d6188b36f55bd2a480b819b7afadf07ae54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-docby.tex \
texlive-docbytex"

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
