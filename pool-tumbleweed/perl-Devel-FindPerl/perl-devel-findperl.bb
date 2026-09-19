SUMMARY = "Find the path to your perl"
DESCRIPTION = "This module tries to find the path to the currently running perl. It \
(optionally) exports the following functions:"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.016"

RPM_NAME = "perl-Devel-FindPerl-0.016-1.20.noarch.rpm"
RPM_HASH = "c9401a4e9ca2bd3c032a12ec191146d0e5e93b75635e546e1570aa0f946235df72e5ed476942d6637abacceee9c9d04fd569d4b566ae4506b47bdc27d63aad57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Devel--FindPerl \
perl-Devel-FindPerl"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
