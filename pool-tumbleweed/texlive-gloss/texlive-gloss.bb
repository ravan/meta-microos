SUMMARY = "Create glossaries using BibTeX"
DESCRIPTION = "A glossary package using BibTeX with \\cite replaced by \\gloss."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5.2svn75240"

RPM_NAME = "texlive-gloss-2026.226.1.5.2svn75240-60.4.noarch.rpm"
RPM_HASH = "ea8a325dc9db1ac73ae86a83f71f7117d6b5257555723091e6cfdc57dc773d1f603784d020980475ecf2f533b96d46e65e9c936a4f862b91bccc5c0cdbcb1cf3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gloss.sty \
texlive-gloss"

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
