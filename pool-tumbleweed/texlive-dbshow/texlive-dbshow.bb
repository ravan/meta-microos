SUMMARY = "A package to store and display data with custom filters, orders, and styles"
DESCRIPTION = "The package provides four core functions: data storage and \
display data filtering data sorting data display All data is \
saved once and then you can display these data with custom \
filters, orders and styles. The package can be used, for \
example, to record and display something you'd like to review, \
maybe the question you always answered incorrectly or some \
forgettable knowledge. But obviously, the package is much more \
powerful and extensible for more interesting tasks depending on \
the individual."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn76924"

RPM_NAME = "texlive-dbshow-2026.226.1.5svn76924-59.2.noarch.rpm"
RPM_HASH = "b5b77b16494a1f0e259bcb90e47f944642b1d1c8a80140592761c56be120db9b1d9d96f65906a6f130b45342f84ec5776918ede9c02828fa97c8ddaf0bdb5b3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dbshow.sty \
texlive-dbshow"

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
