SUMMARY = "Verify requirements in a CPAN::Meta object"
DESCRIPTION = "This module verifies if requirements described in a CPAN::Meta object are \
present."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.18.0"

RPM_NAME = "perl-CPAN-Meta-Check-0.18.0-3.7.noarch.rpm"
RPM_HASH = "854d69cd454d147b4faaebf2c8a1589e291537d060829a58f6d87a33acad1b6d6508c307eee1e449275463dbc141a0cf0100885d06da96f190d3ac3cf32c9cd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-CPAN--Meta--Check \
perl-CPAN-Meta-Check"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-CPAN--Meta--Prereqs \
perl-CPAN--Meta--Requirements \
perl-Module--Metadata"

inherit rpm
