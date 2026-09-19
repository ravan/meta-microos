SUMMARY = "Diagram macros, using pict2e"
DESCRIPTION = "This is a development of the long-established diagmac package, \
using pict2e so that the restrictions on line direction are \
removed."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn15878"

RPM_NAME = "texlive-diagmac2-2026.226.2.1svn15878-59.2.noarch.rpm"
RPM_HASH = "0740ebd917578dbe5635e85367e325998127247fde74f766568968d266dab3e9a28157b9e4f00fd2ca7e433831571dad717d2236e6c499380647ab6c049b2ad5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-diagmac2.sty \
texlive-diagmac2"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pict2e.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
