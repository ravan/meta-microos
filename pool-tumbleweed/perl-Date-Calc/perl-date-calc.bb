SUMMARY = "Gregorian calendar date calculations"
DESCRIPTION = "  * 'use Date::Calc qw( Days_in_Year Days_in_Month ... );' \
 \
  * 'use Date::Calc qw(:all);' \
 \
You can either specify the functions you want to import explicitly by \
enumerating them between the parentheses of the ''qw()'' operator, or you \
can use the '':all'' tag instead to import *ALL* available functions."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "6.400.0"

RPM_NAME = "perl-Date-Calc-6.400.0-1.9.noarch.rpm"
RPM_HASH = "8a6261d5f8bfd4030f67aeedd789a023c10a797ef2c6b3c0a6269f554a61df35f4754f87065a2dac7598bf0c5943311e56fd527016e39a2bba4c8c81b301d693"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Date--Calc \
perl-Date--Calc--Object \
perl-Date--Calc--PP \
perl-Date--Calendar \
perl-Date--Calendar--Profiles \
perl-Date--Calendar--Year \
perl-Date-Calc"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Bit--Vector \
perl-Carp--Clan"

inherit rpm
