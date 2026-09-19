SUMMARY = "Font with Basic Icon Glyphs"
DESCRIPTION = "Unidings contains glyphs that may be used in a Last Resort font, as well as \
icon glyphs for control and special characters, encoded in F200..F3B4 and \
F400..F5B4 of the Private Use Area in BMP. Block names are from “Roadmaps, \
a snapshot as of 2011-05-30”, http://std.dkuug.dk/JTC1/SC2/WG2/docs/n4056.htm"
LICENSE = "SUSE-Permissive"

PV = "9.17"

RPM_NAME = "gdouros-unidings-fonts-9.17-1.26.noarch.rpm"
RPM_HASH = "bbf28db24f013db4d1f28f12eaa4e7c4094cdba95becd86801ec8c3634cf54b18ee6bf1cb828454889c5c0c6884d29dda39d02ed8b08fb679f91e57d9c4f6890"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gdouros-unidings-fonts \
unidings-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
