SUMMARY = "UNAM Thesis LaTeX Template"
DESCRIPTION = "The bundle provides a template for UNAM's College of \
Engineering Theses. The work is based on Harish Bhanderi's \
PhD/MPhil template, then University of Cambridge."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2.0svn76790"

RPM_NAME = "texlive-unamth-template-2026.226.2.0svn76790-60.2.noarch.rpm"
RPM_HASH = "e23aa3639b499dc288a927b93853f308eab2229c9cc38c704ba211ca5f96499a821cfdc3ff7a5d965342094c939a471fde25635157d2b9e33ac99545783a30d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-unamth-template"

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
