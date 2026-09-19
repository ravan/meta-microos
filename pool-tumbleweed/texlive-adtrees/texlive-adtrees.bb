SUMMARY = "Macros for drawing adpositional trees"
DESCRIPTION = "This package provides a means to write adpositional trees, a \
formalism devoted to representing natural language expressions. \
The package relies on epic and cancel."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.1svn51618"

RPM_NAME = "texlive-adtrees-2026.226.1.1svn51618-61.2.noarch.rpm"
RPM_HASH = "f1b14da82a654a381eb8a06f8cc6facaa2f60847fb838517e87f5c926296890178ee3749e7eeeb9a1ad68f7590343e39569f94610a6f149047531d9eb911d917"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-adtrees.sty \
texlive-adtrees"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-cancel.sty \
tex-epic.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
