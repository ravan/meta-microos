SUMMARY = "Simple generic namespace processor"
DESCRIPTION = "This module offers a simple to process namespaced XML names (unames) from \
within any application that may need them. It also helps maintain a prefix \
to namespace URI map, and provides a number of basic checks. \
 \
The model for this module is SAX2's NamespaceSupport class, readable at \
http://www.saxproject.org/namespaces.html It adds a few perlisations where \
we thought it appropriate."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.120.0"

RPM_NAME = "perl-XML-NamespaceSupport-1.120.0-1.3.noarch.rpm"
RPM_HASH = "88e88c3a902482628787b274d1ec26a06c13fa40e11466b2d80d019f99fff6c51a9dc39bcb48670527aabca58a28d9515a65a56ccea9d3629dcad2c87437aa89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--NamespaceSupport \
perl-XML-NamespaceSupport"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
