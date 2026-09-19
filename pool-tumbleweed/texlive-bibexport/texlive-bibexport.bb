SUMMARY = "Extract a BibTeX file based on a .aux file"
DESCRIPTION = "A Bourne shell script that uses BibTeX to extract bibliography \
entries that are \\cite'd in a document. It can also expand a \
BibTeX file, expanding the abbreviations (other than the \
built-in ones like month names) and following the \
cross-references."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.03svn50677"

RPM_NAME = "texlive-bibexport-2026.226.3.03svn50677-61.2.noarch.rpm"
RPM_HASH = "dd010b8d2e3896e5ff9179b8dbefa71ab7e181e4d6998b53acab9e831ade3801d33165386399224b262133eb3db41cf3314fd07085dc33ad07c9a4e5729a7e5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bibexport"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-bibexport-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
