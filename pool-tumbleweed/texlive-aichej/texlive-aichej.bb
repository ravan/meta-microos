SUMMARY = "Bibliography style file for the AIChE Journal"
DESCRIPTION = "The style was generated using custom-bib, and implements the \
style of the American Institute of Chemical Engineers Journal \
(or AIChE Journal or AIChE J or AIChEJ)."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76790"

RPM_NAME = "texlive-aichej-2026.226.svn76790-61.2.noarch.rpm"
RPM_HASH = "d40924f737854fc9490f0587fbb0f360b93dd112e0f13353ad73e4ec3d8eebddda14f612c18c242b38f9f13ca6149e6791fe06848b69f1faace4a351c2bcbc98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-aichej"

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
