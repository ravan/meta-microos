SUMMARY = "A build system for tex4ht"
DESCRIPTION = "make4ht is a simple build system for tex4ht, a TeX to XML \
converter. It provides a command line tool that drives the \
conversion process. It also provides a library which can be \
used to create customized conversion tools."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4esvn78133"

RPM_NAME = "texlive-make4ht-2026.226.0.0.4esvn78133-59.2.noarch.rpm"
RPM_HASH = "96cab1d37476c9a50da5fa555a98dfcce69e84f42dcd3952707854091a28a80773b0e833c3d78963e7ddedd451275671f0815224dad7094983968f20fdf5ffb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-make4ht"

RDEPENDS:${PN} += "/usr/bin/luatex \
/usr/bin/sh \
/usr/bin/texlua \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-make4ht-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-tex4ht"

inherit rpm
