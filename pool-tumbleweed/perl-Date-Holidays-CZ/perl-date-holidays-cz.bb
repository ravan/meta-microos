SUMMARY = "Determine Czech holidays"
DESCRIPTION = "This module exports a single function named *holidays()* which returns a \
list of Czech holidays in a given year."
LICENSE = "BSD-3-Clause"

PV = "0.20"

RPM_NAME = "perl-Date-Holidays-CZ-0.20-2.28.noarch.rpm"
RPM_HASH = "6eb7e7f55d49e0343ae3f78e987ded6e37e62c8bb8c72befcb1b411c40bb9fa43c967f3e1d4356dafd0ca36f6389c4429dbf9dee90b5a43edc5662554ad51de9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Date--Holidays--CZ \
perl-Date-Holidays-CZ"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Date--Calc"

inherit rpm
