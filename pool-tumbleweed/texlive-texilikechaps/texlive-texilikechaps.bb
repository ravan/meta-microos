SUMMARY = "Format chapters with a texi-like format"
DESCRIPTION = "The package enables the user to reduce the size of the rather \
large chapter headings in standard classes into a texi-like \
smaller format. Details of the format may be controlled with \
internal commands."
LICENSE = "LPPL-1.0"

PV = "2026.227.1.0asvn28553"

RPM_NAME = "texlive-texilikechaps-2026.227.1.0asvn28553-62.2.noarch.rpm"
RPM_HASH = "3b93508f05ee0921f826c8f321a0ba2574c2eace371c961483bc9a1f091515616d086a6eec1e3bd7a65a2bbcb5b2738438e2d6a4a720656e7476dd1b6f77f0b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-texilikechaps.sty \
texlive-texilikechaps"

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
