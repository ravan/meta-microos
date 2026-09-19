SUMMARY = "Produce RFC 2822 date strings"
DESCRIPTION = "This module provides a simple means for generating an RFC 2822 compliant \
datetime string. (In case you care, they're not RFC 822 dates, because they \
use a four digit year, which is not allowed in RFC 822.)"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.8.0"

RPM_NAME = "perl-Email-Date-Format-1.8.0-1.7.noarch.rpm"
RPM_HASH = "f4eddac7cd5b66f6406331b2e680b05b57e63b86f5954d36827ac157478a502389022c8e1c383361f84ce57d8024d528e93df5c410ae01c4c6e34c36c816f6ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Email--Date--Format \
perl-Email-Date-Format"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Time--Local"

inherit rpm
