SUMMARY = "Monospaced Fonts for Minority Languages of Russia"
DESCRIPTION = "PT Mono was developed for the special needs — for use in forms, tables, \
work sheets etc. Equal widths of characters are very helpful in setting \
complex documents, with such font you may easily calculate size of entry \
fields, column widths in tables and so on. One of the most important \
area of use is Web sites of “electronic governments“ where visitors have \
to fill different request forms. Currently PT Mono consists of Regular \
and Bold styles. \
 \
The fonts beside standard Western, Central European and Cyrillic code \
pages contain characters of all title languages of Russian Federation \
that make them unique and very important tool of the modern digital \
communications."
LICENSE = "OFL-1.1"

PV = "1.003OFL"

RPM_NAME = "paratype-pt-mono-fonts-1.003OFL-3.25.noarch.rpm"
RPM_HASH = "cb2f54147c8aadd9334605c5a2271ad413eb70415ca4276877d196cb47593b1c58bbfb43f15ebfd1ea4baba15b70152af7b695ab8d0ae1cb44e6280744b07882"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-be;ru;uk \
paratype-pt-mono-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
