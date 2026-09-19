SUMMARY = "A contemporary serif typeface family for long-form reading"
DESCRIPTION = "League Spartan is The League Of Moveable Type's interpretation of Matt Bailey's Spartan, a typeface based on early 20th century American geometric sans serifs."
LICENSE = "OFL-1.1"

PV = "2.220"

RPM_NAME = "lomt-leaguespartan-fonts-2.220-1.9.noarch.rpm"
RPM_HASH = "55a846525abc98c8e4002bfe3c4fcdd1651b7cd8dab4d5157ce47e0cf519f02aa99535c3c986c160003e7dceae93d4e0face46f2df9e46d63a5ec0a7aa067336"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lomt-leaguespartan-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
