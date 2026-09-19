SUMMARY = "Work with International Standard Book Numbers"
DESCRIPTION = "This modules handles International Standard Book Numbers, including ISBN-10 \
and ISBN-13. \
 \
The data come from Business::ISBN::Data, which means you can update the \
data separately from the code. Also, you can use Business::ISBN::Data with \
whatever _RangeMessage.xml_ you like if you have updated data. See that \
module for details."
LICENSE = "Artistic-2.0"

PV = "3.14.0"

RPM_NAME = "perl-Business-ISBN-3.14.0-1.3.noarch.rpm"
RPM_HASH = "2eafdefead19473c785d5b13a676551d31e5787a7e45181468c91443ffecaad9520b48ea122e6b2b9a71d7a836f80b87438e47a855caa3161bc6f3c1866f213f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Business--ISBN \
perl-Business--ISBN10 \
perl-Business--ISBN13 \
perl-Business-ISBN"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Business--ISBN--Data"

inherit rpm
