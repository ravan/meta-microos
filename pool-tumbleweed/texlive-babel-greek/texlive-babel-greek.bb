SUMMARY = "Babel support for the Greek language and script"
DESCRIPTION = "The bundle provides comprehensive support for the Greek \
language and script via the Babel system. Document authors can \
select between the monotonic (single-diacritic), polytonic \
(multiple-diacritic), and ancient orthography of the Greek \
language. Included are the packages grmath for Greek function \
names in mathematics, and athnum for Attic numerals."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.15svn78101"

RPM_NAME = "texlive-babel-greek-2026.226.1.15svn78101-60.2.noarch.rpm"
RPM_HASH = "3f277c1b98e1bf96d8673425d29c5739a2707ca6390b03c0e7cc3cf1ed4464e34b11cd972c3fd11d7bc575bb4e79540c5241002baae407552994d06051967d7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-athnum.sty \
tex-greek.ldf \
tex-grmath.sty \
texlive-babel-greek"

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
