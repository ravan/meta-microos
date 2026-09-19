SUMMARY = "Convert from POD to AsciiDoc"
DESCRIPTION = "Convert from POD to AsciiDoc"
LICENSE = "Apache-2.0"

PV = "0.102003"

RPM_NAME = "perl-Pod-AsciiDoctor-0.102003-1.5.noarch.rpm"
RPM_HASH = "88b6490ebd4f873366260b3f218285a86352d2b34b5fa3e2839cefe32a1ba790552624b6fdd2c9c54f83d38327c712f08a26079490fedac750c91d8269c5d93a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Pod--AsciiDoctor \
perl-Pod-AsciiDoctor"

RDEPENDS:${PN} += "/usr/bin/env \
perl--MODULE-COMPAT-5.44.0 \
perl-Path--Tiny \
perl-Pod--Parser \
perl-autodie \
perl-parent"

inherit rpm
