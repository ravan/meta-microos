SUMMARY = "Pack your dependencies onto your script file"
DESCRIPTION = "pack your dependencies onto your script file"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.10.8"

RPM_NAME = "perl-App-FatPacker-0.10.8-1.7.noarch.rpm"
RPM_HASH = "7452f733b92d20d77e82576decc90305780a53b006dc4dbfca011716b8c3967bb71883f30b98d61b346932a75933cc50f99e1ce00265b4912a6afbb6fb377f11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-App--FatPacker \
perl-App--FatPacker--Trace \
perl-App-FatPacker"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
