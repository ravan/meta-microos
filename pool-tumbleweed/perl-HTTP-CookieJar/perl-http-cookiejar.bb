SUMMARY = "Minimalist HTTP user agent cookie jar"
DESCRIPTION = "This module implements a minimalist HTTP user agent cookie jar in \
conformance with at http://tools.ietf.org/html/rfc6265. \
 \
Unlike the commonly used HTTP::Cookies module, this module does not require \
use of HTTP::Request and HTTP::Response objects. An LWP-compatible adapter \
is available as HTTP::CookieJar::LWP."
LICENSE = "Apache-2.0"

PV = "0.14.0"

RPM_NAME = "perl-HTTP-CookieJar-0.14.0-2.6.noarch.rpm"
RPM_HASH = "c60a1593e029fb51cf13704a27b68ab73eed99d66028b36e28985f3f07395231178c109011ba103ad8a6c868a5815f345fdfee922fa5dbe067e778bc171042c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTTP--CookieJar \
perl-HTTP--CookieJar--LWP \
perl-HTTP-CookieJar"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-HTTP--Date \
perl-Time--Local \
perl-parent"

inherit rpm
