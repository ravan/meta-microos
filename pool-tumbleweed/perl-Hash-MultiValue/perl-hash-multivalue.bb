SUMMARY = "Store multiple values per key"
DESCRIPTION = "Hash::MultiValue is an object (and a plain hash reference) that may contain \
multiple values per key, inspired by MultiDict of WebOb."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.160.0"

RPM_NAME = "perl-Hash-MultiValue-0.160.0-1.3.noarch.rpm"
RPM_HASH = "ed89e3ba3a481a9fc9d66ae2ecafa8d30a57bb8ed526bf1d3c477a7b86db7a5a203f911ebe9ae98a9d33e035bc17b2208e159bc0292bbd96f34e6f29b2363545"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Hash--MultiValue \
perl-Hash-MultiValue"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
