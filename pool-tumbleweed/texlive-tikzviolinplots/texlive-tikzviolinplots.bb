SUMMARY = "Draws violin plots from data"
DESCRIPTION = "This package enables the user to draw violin plots, calculating \
the kernel density estimation from the data and plotting the \
resulting curve inside a tikzpicture environment. It supports \
different kernels, and allows the user to either set the \
bandwidth value for each plot or use a default value."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.10.0svn76451"

RPM_NAME = "texlive-tikzviolinplots-2026.226.0.0.10.0svn76451-59.2.noarch.rpm"
RPM_HASH = "9d64351f863fadc2dc769f78d80855351cb31d9d9b73990960c8e668fa845bb7e06dda6724838da4919f02337e56de783ae0cb51ed759129a8e0279ac59bb218"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzviolinplots.sty \
texlive-tikzviolinplots"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-pgfkeys.sty \
tex-pgfplots.sty \
tex-pgfplotstable.sty \
tex-stringstrings.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
