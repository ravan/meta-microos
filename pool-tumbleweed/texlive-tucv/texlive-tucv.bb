SUMMARY = "Support for typesetting a CV or resumee"
DESCRIPTION = "The package provides commands for typesetting a CV or resume. \
It provides commands for general-purpose headings, entries, and \
item/description pairs, as well as more specific commands for \
formatting sections, with explicit inclusion of school, degree, \
employer, job, conference, and publications entries. It tends \
to produce a somewhat long and quite detailed document but may \
also be suitable to support a shorter resume. The package \
relies on a 'sufficiently recent' copy of the l3kernel and \
l3packages bundles."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn20680"

RPM_NAME = "texlive-tucv-2026.226.1.0svn20680-59.2.noarch.rpm"
RPM_HASH = "200f3682703d65a88a6f4cd63555a351b363bfffe17f968fff1dc11f0e26bbb511f5f53e860ac7c325f384de024469b7f7799167834684f97c40dd618866e66a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tucv.sty \
texlive-tucv"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-calc.sty \
tex-color.sty \
tex-fancyhdr.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
