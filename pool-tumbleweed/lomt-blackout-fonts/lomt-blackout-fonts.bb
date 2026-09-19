SUMMARY = "League Of Movable Type's 'Blackout' font family"
DESCRIPTION = "A font inspired by the author filling in sans-serif newspaper \
headlines."
LICENSE = "OFL-1.1"

PV = "0.20121218"

RPM_NAME = "lomt-blackout-fonts-0.20121218-8.15.noarch.rpm"
RPM_HASH = "3df6b7eeb0a4bc0d182f05750a9a7dc7eddc800cc27d20918333d6b501978a264d622222f2c3a78dba24a0ec54a928c848f118539116185488b62cb4a4dbf735"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lomt-blackout-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
