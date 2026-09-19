SUMMARY = "Parse directory listing"
DESCRIPTION = "This module exports a single function called 'parse_dir', which can be used \
to parse directory listings."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "6.160.0"

RPM_NAME = "perl-File-Listing-6.160.0-2.12.noarch.rpm"
RPM_HASH = "1a2903268537012e83ae8eca1e3956d79ee99de0c82437fc0b35192415b670d0b14ff5ee02553a5caab5c92c30d449feffb8cdca50dbc157383867b055813d1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--Listing \
perl-File-Listing"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-HTTP--Date"

inherit rpm
