SUMMARY = "Framed or shaded regions that can break across pages"
DESCRIPTION = "The package creates three environments: framed, which puts an \
ordinary frame box around the region, shaded, which shades the \
region, and leftbar, which places a line at the left side. The \
environments allow a break at their start (the \\FrameCommand \
enables creation of a title that is 'attached' to the \
environment); breaks are also allowed in the course of the \
framed/shaded matter. There is also a command \\MakeFramed to \
make your own framed-style environments."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.96svn77682"

RPM_NAME = "texlive-framed-2026.226.0.0.96svn77682-60.2.noarch.rpm"
RPM_HASH = "9512c7db5c64955e31df1e25f53b120fff12148ffe991e6e0a47c6f2e3f727447733b328bc048447891feff9063fd86ad20124f14fafd918971e58fdafcb237d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-framed.sty \
texlive-framed"

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
