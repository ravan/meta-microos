SUMMARY = "Use short forms of fields with BibLaTeX"
DESCRIPTION = "The BibLaTeX package provides shortseries and shortjournal \
field, but the default styles don't use them. It also provides \
a mechanism to print the equivalence between short forms of \
fields and long fields (\\printbiblist), but this mechanism does \
not allow to mix between different type of short fields, for \
example, between short forms of journal title and short forms \
of series titles. This package provides a solution to these two \
problems: If a shortjournal field is defined, it prints it \
instead of the \\journal field. If a shortseries field is \
defined, it prints it instead of the \\series field. It provides \
a \\printbibshortfields command to print a list of the sort \
forms of the fields. This list also includes the claves defined \
with the biblatex-claves package version 1.2 or later."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.1svn45858"

RPM_NAME = "texlive-biblatex-shortfields-2026.226.1.0.1svn45858-61.2.noarch.rpm"
RPM_HASH = "c3aefa93d1c3e7d7c13cf10d947913cab52c4abc9147f23e3c802949862502ac49acb45620f4d8f3dcd3b347ec30ba8f24ba29ee92d3af8cc109c6d9362f4a16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-biblatex-shortfields.sty \
texlive-biblatex-shortfields"

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
