SUMMARY = "Typeset and index linguistic gloss abbreviations"
DESCRIPTION = "The leipzig package provides a set of macros for standard \
glossing abbreviations, with options to create new ones. They \
are mnemonic (e.g. \\Acc{} for accusative, abbreviated acc). \
These abbre can be used alone or on top of the glossaries \
package for easy indexing and glossary printing."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.3svn52450"

RPM_NAME = "texlive-leipzig-2026.226.2.3svn52450-61.2.noarch.rpm"
RPM_HASH = "ecb6c47290b59654e0c9804e85f02ceec5a9cdef2de671402c2d385b915b717c612df4cd3ba5fa38c7d501d3ffe0a31d02f00ecc8664a8b92565271e8b532ec2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-leipzig.sty \
tex-leipzig.tex \
texlive-leipzig"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-glossaries.sty \
tex-glossary-inline.sty \
tex-glossary-mcols.sty \
tex-glossary-tree.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
