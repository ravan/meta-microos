SUMMARY = "Automatically punctuate lists"
DESCRIPTION = "This package provides the autopunc option in the enumitem \
environments itemize, enumerate, and description to \
automatically punctuate the items. It uses lua pattern matching \
to modify the environment's contents."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn63045"

RPM_NAME = "texlive-autopuncitems-2026.226.svn63045-60.2.noarch.rpm"
RPM_HASH = "5305a685c815481c5c2341892687c2316132a740f03e2788d2859eb2172c5b0be69cca16b8f9dc354c6261be7d4dd603ac3ed59cdf61a0e07113b312d2cf88ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-autopuncitems.sty \
texlive-autopuncitems"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-enumitem.sty \
tex-etoolbox.sty \
tex-luacode.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
