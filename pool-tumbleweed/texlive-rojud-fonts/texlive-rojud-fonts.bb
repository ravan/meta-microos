SUMMARY = "Severed fonts for texlive-rojud"
DESCRIPTION = "The  separated fonts package for texlive-rojud"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn56895"

RPM_NAME = "texlive-rojud-fonts-2026.226.1.2svn56895-60.2.noarch.rpm"
RPM_HASH = "d73f4d13da8e499d6454e1f8f2b27e19739758bc5d3afdfe12250c638ef3938d959b53937f26731f2ed9490efc5734664dbad2b53767e111ebf13c7ea09587e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-rojud \
texlive-rojud-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
