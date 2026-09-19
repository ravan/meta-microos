SUMMARY = "Prevent page numbers on part pages"
DESCRIPTION = "The package bundles the answer to the long-standing FAQ about \
removing page numbers on \\part pages. The package accepts no \
options and defines no user commands; the user needs only to \
load it, and the requirement is met."
LICENSE = "LPPL-1.0"

PV = "2026.226.1svn77682"

RPM_NAME = "texlive-nonumonpart-2026.226.1svn77682-61.2.noarch.rpm"
RPM_HASH = "4bdfb13a384308066703dbf6afa3dce97fef3a5af0e629dbdd469da5a19a45e0b4bfe8853af3caabaff1137bee65bbd7ecd616902d010d912cae692051aa7f59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nonumonpart.sty \
texlive-nonumonpart"

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
