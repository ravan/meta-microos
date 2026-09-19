SUMMARY = "A PSTricks-compatible graphicx for use with Plain TeX"
DESCRIPTION = "The package provides a version of graphicx that avoids loading \
the graphics bundle's (original) keyval package, which clashes \
with pstricks' use of xkeyval."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.02svn21717"

RPM_NAME = "texlive-pst-graphicx-2026.226.0.0.02svn21717-59.2.noarch.rpm"
RPM_HASH = "f80ac826644d63d779419cbe37cc64a93a8f9044bd758aaf2bff4133f51dd154c5b645ec0325991ea706739d9ce9800bc0a4cde06be1958f58d03950ef56b78b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-graphicx.tex \
texlive-pst-graphicx"

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
