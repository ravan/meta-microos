SUMMARY = "Find keys in a given path 'recursively'"
DESCRIPTION = "The command \\pgfkeysvalueof, unlike \\pgfkeys, does not use the \
.unknown handler, but raises an error if a key is not defined \
in the given path. It neither offers an option to search for \
the key in other paths. This package defines commands that \
allow to retrieve the value of a key, recursively searching for \
it in a list of paths."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn77050"

RPM_NAME = "texlive-pgfkeysearch-2026.226.1.5svn77050-58.2.noarch.rpm"
RPM_HASH = "28d95cfd217ea5ee2dcd26cba22f7fd9bc032f19389906efc4286a89e90711a7f316654ac40815e96006416f0dcb269fd976026670535be4f82be1698f7de077"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pgfkeysearch.sty \
texlive-pgfkeysearch"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pkginfograb.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
