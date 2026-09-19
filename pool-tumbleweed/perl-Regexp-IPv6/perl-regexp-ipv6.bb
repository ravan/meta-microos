SUMMARY = "Regular expression for IPv6 addresses"
DESCRIPTION = "This module exports the $IPv6_re regular expression that matches any valid \
IPv6 address as described in 'RFC 2373 - 2.2 Text Representation of \
Addresses' but '::'. Any string not compliant with such RFC will be \
rejected. \
 \
To match full strings use '/^$IPv6_re$/'."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.03"

RPM_NAME = "perl-Regexp-IPv6-0.03-5.42.noarch.rpm"
RPM_HASH = "1f4e4c48c4ed9513a14b716f598fdc67bd536bece5cb52309f4b977447c520810aec1ee8a57718e63024328c66020648b166176236c4ab3df21896e86ec34648"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Regexp--IPv6 \
perl-Regexp-IPv6"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
