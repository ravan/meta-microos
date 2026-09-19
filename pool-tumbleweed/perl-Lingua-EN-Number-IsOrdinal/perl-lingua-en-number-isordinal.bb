SUMMARY = "detect if English number is ordinal or cardinal"
DESCRIPTION = "This module will tell you if a number, either in words or as digits, is a \
cardinal or the ordinal \
number|http://www.ego4u.com/en/cram-up/vocabulary/numbers/ordinal manpage. \
 \
This is useful if you e.g. want to distinguish these types of numbers found \
with the Lingua::EN::FindNumber manpage and take different actions."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.05"

RPM_NAME = "perl-Lingua-EN-Number-IsOrdinal-0.05-1.42.noarch.rpm"
RPM_HASH = "dc21d248e354958e3a88a8c9385918f917dfd9fe8f5948d0c5b28e6cde32531752ccf1627e48935b185045f7fa9192926e15a2b88f1ebc931ed07860ccd111d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Lingua--EN--Number--IsOrdinal \
perl-Lingua-EN-Number-IsOrdinal"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Lingua--EN--FindNumber"

inherit rpm
