SUMMARY = "Parses .pm file as PAUSE does"
DESCRIPTION = "The most of the code of this module is taken from the PAUSE code as of \
April 2013 almost verbatim. Thus, the heart of this module should be quite \
stable. However, I made it not to use pipe ('-|') as well as I stripped \
database-related code. If you encounter any issue, that's most probably \
because of my modification. \
 \
This module doesn't provide features to extract a distribution or parse \
meta files intentionally."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.480.0"

RPM_NAME = "perl-Parse-PMFile-0.480.0-1.4.noarch.rpm"
RPM_HASH = "5f4b82f8a3f16441259d917967c6c1e9e3fde2a1527179aa532ff4d929660ced4922640c4f8d54aaaa5e02870ad14970a918abd92368c42b5b44b24f92b3072e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Parse--PMFile \
perl-Parse-PMFile"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-JSON--PP \
perl-version"

inherit rpm
