SUMMARY = "GDTextUtil Perl module"
DESCRIPTION = "GDTextUtil Perl module"
LICENSE = "Artistic-1.0 | GPL-2.0-or-later"

PV = "0.86"

RPM_NAME = "perl-GDTextUtil-0.86-99.34.noarch.rpm"
RPM_HASH = "c982034a3b9d38083f336e9920ef56b41875044d2c76ce7e394e7177026e1bda5ac247b23d187739975215d4b90c5a204092636c8d82585a9b315b01076f8125"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-GD--Text \
perl-GD--Text--Align \
perl-GD--Text--Wrap \
perl-GDTextUtil"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-GD"

inherit rpm
