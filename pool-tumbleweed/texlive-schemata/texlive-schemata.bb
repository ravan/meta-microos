SUMMARY = "Print topical diagrams"
DESCRIPTION = "The package facilitates the creation of 'topical schemata', \
i.e. outlines that use braces (or facsimiles thereof) to \
illustrate the breakdown of concepts and categories in \
Scholastic thought from late medieval and early modern periods."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn76178"

RPM_NAME = "texlive-schemata-2026.226.1.5svn76178-60.2.noarch.rpm"
RPM_HASH = "7edae46cf0901742eed4162b36d658800e5ad31e61d39ca7e7586a4e16fb96c8d62c864cf9e45b486c2da5169564f0a326c7dc28d96a93e6c7c69a87e82aad47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-schemata.sty \
texlive-schemata"

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
