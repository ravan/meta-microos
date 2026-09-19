SUMMARY = "Iran Manual of Style Citation Guide for BibTeX"
DESCRIPTION = "The iran-bibtex package, designed for LaTeX, provides BibTeX \
styles in accordance with the guidelines outlined in the Iran \
Manual of Style (1st edn., 2016)--citation guide to Persian, \
and English information sources. A collection of illustrative \
examples showcasing the usage of this package has been \
meticulously prepared and is accessible in the package's GitHub \
repository under the 'examples' sub-directory. To facilitate \
alphabetical sorting of references, prioritizing Persian/Farsi \
items ahead of English/Latin ones, a dedicated file named \
iran-bibtex-cp1256fa.csf is provided for use with this package. \
This file, derived from the ascii.csf file, serves the purpose \
of arranging references in the desired order. It is important \
to note that this package relies on the natbib package, which \
is automatically loaded."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4.3svn76790"

RPM_NAME = "texlive-iran-bibtex-2026.226.0.0.4.3svn76790-63.2.noarch.rpm"
RPM_HASH = "994b689e765f9d1993b0aa1448f76ae366859028acc27891c496a6ab52ec1b7c702f765c19b2da9a2bf7cc26a26373bd7d77adde2c8678d9a9126778be65c3c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-iran-bibtex.sty \
texlive-iran-bibtex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-natbib.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
