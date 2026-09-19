SUMMARY = "A Grotesque Sans Serif Font"
DESCRIPTION = "Work Sans is a typeface family with 9 weights, and based loosely on \
early Grotesques — for example, Stephenson Blake, Miller & Richard \
and Bauerschen Giesserei. \
 \
Work Sans had been updated between 2018–2020 with accompanying italics, variable \
font files and the character set had been expanded to the Google Latin Expert \
glyph set, which supports Vietnamese."
LICENSE = "OFL-1.1"

PV = "2.010"

RPM_NAME = "google-worksans-fonts-2.010-1.15.noarch.rpm"
RPM_HASH = "34d10cb0107831b9260d994a2aa83d59e75fa46603b44cd9dc844413181ce27bfaba57140b285ae92b7d97c92ceaed0fdbfacbc0a49b28eb5d45fa8e2e8686f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-worksans-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
