SUMMARY = "A short document about TeX principles"
DESCRIPTION = "This document is meant for users who are looking for \
information about the basics of TeX. Its main goal is its \
brevity. The pure TeX features are described, no features \
provided by macro extensions. Only the last section gives a \
summary of plain TeX macros."
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "2026.227.0.0.10svn70375"

RPM_NAME = "texlive-tex-nutshell-2026.227.0.0.10svn70375-62.2.noarch.rpm"
RPM_HASH = "2886f8fbf6d536b06d2de134d673a85d38213d4ffa13b0add7b7b11fd2b5ce8c5824385fcc00505e046708d30575743641558b61e82c8eff83ccaba3aa9333a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tex-nutshell"

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
