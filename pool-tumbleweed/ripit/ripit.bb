SUMMARY = "Perl Script to Create .ogg or .mp3 Files from an Audio CD"
DESCRIPTION = "This Perl script makes it easy to create MP3 files from an audio CD. It \
tries to find the artist and song titles with the help of CDDB."
LICENSE = "GPL-2.0-or-later"

PV = "3.9.90"

RPM_NAME = "ripit-3.9.90-3.7.noarch.rpm"
RPM_HASH = "6472d8aede6f0cf06721d0abb7239a44da2f5e8a87b27d9ef48235f8893a79f971e0b7ffcccc0fa904f8b18fe47cbeed000972325dbe359162595c4cd31e7c39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-ripit \
ripit"

RDEPENDS:${PN} += "/usr/bin/env \
cdparanoia \
perl-CDDB-get \
perl-libwww-perl \
vorbis-tools"

inherit rpm
