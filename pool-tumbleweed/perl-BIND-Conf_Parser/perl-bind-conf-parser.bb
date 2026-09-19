SUMMARY = "Parser class for BIND configuration files"
DESCRIPTION = "This module implements a virtual base class for parsing BIND server \
version 8 configuration files (named.conf)."
LICENSE = "ISC"

PV = "0.97"

RPM_NAME = "perl-BIND-Conf_Parser-0.97-517.12.aarch64.rpm"
RPM_HASH = "312e96870188b0017ccc313b5e966bb4484bf1b271446def8ea727514449a34521d71f59cfebffb370a6df304c4bd73b3b3a8b9bbd4489032f8fb810253333f3"

RPROVIDES:${PN} += "perl-BIND--Conf-Parser \
perl-BIND-Conf-Parser"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
