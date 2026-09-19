SUMMARY = "A Preprocessor that generates note-spacing commands for MusiXTeX scores"
DESCRIPTION = "This program simplifies the creation of MusiXTeX scores by \
converting (non-standard) commands of the form \\anotes ... \\en \
into one or more conventional note-spacing commands, as \
determined by the note values themselves, with \\sk spacing \
commands inserted as necessary. The coding for an entire \
measure can be entered one part at a time, without concern for \
note-spacing changes within the part or spacing requirements of \
other parts. For example, \\anotes\\qa J\\qa K&\\ca l\\qa m\\ca n\\en \
generates \\Notes\\qa J\\sk\\qa K\\sk&\\ca l\\qa m\\sk\\ca n\\en ."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn77851"

RPM_NAME = "texlive-autosp-2026.226.svn77851-60.2.noarch.rpm"
RPM_HASH = "0de41fa13b00ad7168b5bc7d8ad146cb713abc53d8b37a20ea67366b2f18ce087b599f4d19c8aa8baae7643f7812c68cf836cdf98a5ab839d0c82dfcf3bbb954"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-autosp.1 \
man-tex2aspc.1 \
texlive-autosp"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-autosp-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
