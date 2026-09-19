SUMMARY = "Babel support for typesetting Slovak"
DESCRIPTION = "The package provides the language definition file for support \
of Slovak in babel, including Slovak variants of LaTeX \
built-in-names. Shortcuts are also defined."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.1asvn30292"

RPM_NAME = "texlive-babel-slovak-2026.226.3.1asvn30292-60.2.noarch.rpm"
RPM_HASH = "c895f04dfccea990ec975669ae74e61628be77b5a5ffa229123069df0e285810023cfd31047610e13ff554d8d2f0a8d4e636b46072737b647e1884312e2a8d6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-slovak.ldf \
texlive-babel-slovak"

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
