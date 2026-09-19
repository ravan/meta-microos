SUMMARY = "Colorizes text using ANSI colors"
DESCRIPTION = "colorizes text using ANSI colors"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.0.3"

RPM_NAME = "perl-Template-Plugin-Filter-ANSIColor-0.0.3-1.27.noarch.rpm"
RPM_HASH = "c9a468b0cd7b954972118ebae54de28833adb3282d5d01f385efe13b2d40117adeac45ea79558db1fc761fade8766e285b29e2e8e20bcebb2ae147d10dc86088"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Template--Plugin--Filter--ANSIColor \
perl-Template-Plugin-Filter-ANSIColor"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Template \
perl-Term--ANSIColor \
perl-Term--Terminfo"

inherit rpm
