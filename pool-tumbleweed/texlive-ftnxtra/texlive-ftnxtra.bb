SUMMARY = "Extend the applicability of the \\footnote command"
DESCRIPTION = "The package treats footnotes in \\caption, the tabular \
environment, and \\chapter and other \\section-like commands."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn77682"

RPM_NAME = "texlive-ftnxtra-2026.226.0.0.1svn77682-60.2.noarch.rpm"
RPM_HASH = "99790bae28aeee7bcdacacb35fb83c609ffd7f1b95bdce49264acaed6f8cb98439e5fa0a0ee94112ee72806da6b4c8b96a6249bbc10d8af240cace72d5342071"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ftnxtra.sty \
texlive-ftnxtra"

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
