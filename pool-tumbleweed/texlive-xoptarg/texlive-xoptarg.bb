SUMMARY = "Expandable macros that take an optional argument"
DESCRIPTION = "Commands that take an optional argument are not ordinarily \
expandable; this package allows such commands to be expandable \
provided that they have at least one mandatory argument."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn15878"

RPM_NAME = "texlive-xoptarg-2026.226.1.0svn15878-59.4.noarch.rpm"
RPM_HASH = "c683dfa48c5c228d3c009a2ac5114d7c48fdf53907810e16a3ad6bd17ef2dee64d47da643a478449098d7a200f6dfd7c7bfd7d108e5e7ee891397083c1637b51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xoptarg.sty \
texlive-xoptarg"

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
