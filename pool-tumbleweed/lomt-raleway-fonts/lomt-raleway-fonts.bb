SUMMARY = "Elegant sans-serif typeface family"
DESCRIPTION = "Raleway is a sans-serif typeface. It is a display face that features \
both old style and lining numerals, standard and discretionary \
ligatures, diacritics, as well as stylistic alternates inspired by \
more geometric sans-serif typefaces than it's neo-grotesque inspired \
default character set."
LICENSE = "OFL-1.1"

PV = "4.101"

RPM_NAME = "lomt-raleway-fonts-4.101-1.9.noarch.rpm"
RPM_HASH = "f425b49c94bf42d254f3594643d8d1bd34ee37286fd2536c6399d224c36b05987b5c531e3c6086463713ef05585ae7d97c29315e94561fc9d5e8a5eb7dfa49a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lomt-raleway-fonts \
raleway-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
