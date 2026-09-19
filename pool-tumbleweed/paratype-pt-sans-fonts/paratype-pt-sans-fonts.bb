SUMMARY = "Sans Fonts for Minority Languages of Russia"
DESCRIPTION = "PT Sans is based on Russian sans serif types of the second part of \
the XX century, but at the same time has a very distinctive features of \
modern humanistic design. The family consists of 8 styles: 4 basic \
styles; 2 captions styles for small sizes and 2 narrows styles for \
economic setting. \
 \
The fonts beside standard Western, Central European and Cyrillic code \
pages contain characters of all title languages of Russian Federation \
that make them unique and very important tool of the modern digital \
communications."
LICENSE = "OFL-1.1"

PV = "2.005OFL"

RPM_NAME = "paratype-pt-sans-fonts-2.005OFL-3.25.noarch.rpm"
RPM_HASH = "6ec80b912209c1beeaec6aa05667e3ae14489bf5a732b78ce9be0c662eb3f58bdd9f90057a97ee09c1dd33de95e4aa29dceefa0240bbe3acb7e1d4b6294bcc7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "PTSans-fonts \
locale-be;ru;uk \
paratype-pt-sans-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
