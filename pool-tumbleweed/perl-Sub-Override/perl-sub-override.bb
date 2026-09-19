SUMMARY = "Perl extension for easily overriding subroutines"
DESCRIPTION = "Perl extension for easily overriding subroutines"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.120.0"

RPM_NAME = "perl-Sub-Override-0.120.0-1.12.noarch.rpm"
RPM_HASH = "af35c9852597d6b1c9daf97c825ce6dda8229499bfc427e0805e1df9ac282c9eac49237f259575e77e1e1edddc047d53c4b96f59927ab11c74d31736de4cdc86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Sub--Override \
perl-Sub-Override"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Test--Fatal"

inherit rpm
