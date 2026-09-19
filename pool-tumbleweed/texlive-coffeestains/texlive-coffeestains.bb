SUMMARY = "Add coffee stains to documents"
DESCRIPTION = "This package provides an essential feature that LaTeX has been \
missing for too long: It adds coffee stains to your documents. \
A lot of time can be saved by printing stains directly on the \
page rather than adding them manually."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.0.0.5.1svn59703"

RPM_NAME = "texlive-coffeestains-2026.226.0.0.5.1svn59703-60.2.noarch.rpm"
RPM_HASH = "e0372496229da6cd20d4436050dff9777b4ac67eb346380a6d3c1e0ed0afe50eff7fbb8562ae3d9fbe9e2ca1bf96fb71b53f0bb9a153d4dae26041ee460fa915"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-coffeestains.sty \
texlive-coffeestains"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
