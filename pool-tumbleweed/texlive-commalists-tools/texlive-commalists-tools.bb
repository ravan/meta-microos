SUMMARY = "Manipulate numeral comma separated lists"
DESCRIPTION = "This package provides some macros for the basic manipulation of \
comma-separated lists (adding, removing, counting, etc.)"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.20asvn78008"

RPM_NAME = "texlive-commalists-tools-2026.226.0.0.20asvn78008-60.2.noarch.rpm"
RPM_HASH = "d62e0e4982b96817035f82f08795c6e1a3b48d87c4292c11b2278a50ad0735407f9cb6bd7b93a030aa54027f09458d2b2968d82d195f4a7d7c94f280f363a84a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-commalists-tools-l3.sty \
tex-commalists-tools.sty \
texlive-commalists-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-listofitems.sty \
tex-xintexpr.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
