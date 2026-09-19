SUMMARY = "Porters stemming algorithm for Denmark"
DESCRIPTION = "The stem function takes a scalar as a parameter and stems the word \
according to Martin Porters Danish stemming algorithm, which can be found \
at the Snowball website: http://snowball.tartarus.org/."
LICENSE = "GPL-2.0"

PV = "1.01"

RPM_NAME = "perl-Lingua-Stem-Snowball-Da-1.01-1.40.noarch.rpm"
RPM_HASH = "9b215a7e35fe9a462fcb2058b0b1f5b68631edf60ca72479f4d6d3e369f13dd0a28e0f1f714d5e3075d652b4dc1398613d878fd5ccca82d48cfd039e739badbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Lingua--Stem--Snowball--Da \
perl-Lingua-Stem-Snowball-Da"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
