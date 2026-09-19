SUMMARY = "Convert MusicXML to PMX and MusiXTeX"
DESCRIPTION = "This program translates MusicXML files to input suitable for \
PMX and MusiXTeX processing. This package supports Windows, \
MacOS and Linux systems."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn57972"

RPM_NAME = "texlive-xml2pmx-2026.226.svn57972-59.4.noarch.rpm"
RPM_HASH = "1739e2afd11863358dc072eaad14213d3c3235884933b6cbf362f754c3e0826c7075cf6de7f2262c287607fa73a24f369dc518a6ef66fb6248c70bc453baaf9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-xml2pmx.1 \
texlive-xml2pmx"

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
texlive-scripts-bin \
texlive-xml2pmx-bin"

inherit rpm
