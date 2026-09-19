SUMMARY = "Chapter styles in memoir class"
DESCRIPTION = "A showcase of chapter styles available to users of memoir: the \
six provided in the class itself, plus many from elsewhere (by \
the present author and others). The package's resources apply \
only to memoir, but the package draws from a number of sources \
relating to standard classes, including the fncychap package, \
and Vincent Zoonekynd's tutorial on headings."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.7esvn59766"

RPM_NAME = "texlive-memoirchapterstyles-2026.226.1.7esvn59766-59.2.noarch.rpm"
RPM_HASH = "3e973c26a26017b0c39547efe77af91b5d1e5034992c5b960351b46caf740a238aa78f9f2a7c80e969aadc790aa8d77889fca487c29c6055218c8dde802f09f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-memoirchapterstyles"

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
