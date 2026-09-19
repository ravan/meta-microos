SUMMARY = "A small collection of minimal DTX examples"
DESCRIPTION = "A collection of files that demonstrate simple things that are \
possible with the flexible and under-appreciated docstrip file \
format. Each file of the collection is provided as a .dtx file \
and as the corresponding .pdf. The set is intended as a \
companion to Scott Pakin's excellent and influential dtxtut \
example of producing LaTeX packages in this way."
LICENSE = "LPPL-1.0"

PV = "2026.226.1svn49504"

RPM_NAME = "texlive-dtxgallery-2026.226.1svn49504-59.2.noarch.rpm"
RPM_HASH = "3138f266dc12e9af7446256dacae94f0aa7572863670f22af9132e43766c11fccb4e2ab6d9607036abcd7f65627551a44964d3e2c30e750f0de5a814cfbd0b96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dtxgallery \
texlive-dtxgallery-doc"

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
