SUMMARY = "Unofficial bibliography style file for the Institute of Electrical Engineers of Japan"
DESCRIPTION = "This package provides an unofficial BibTeX style for authors of \
the Institute of Electrical Engineers of Japan (IEEJ) \
transactions journals and conferences."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.19svn76790"

RPM_NAME = "texlive-ieejtran-2026.226.0.0.19svn76790-60.2.noarch.rpm"
RPM_HASH = "7072400e3a8bf6ffb916571248ce08cd1ddfb754c54e10698fb6d29274fd6001aac5b23dfbd65d8ab925957d2034e05496ff05fa0eae0f2986cbe8d6ef460070"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ieejtran"

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
