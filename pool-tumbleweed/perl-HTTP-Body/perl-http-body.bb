SUMMARY = "HTTP Body Parser"
DESCRIPTION = "HTTP::Body parses chunks of HTTP POST data and supports \
application/octet-stream, application/json, \
application/x-www-form-urlencoded, and multipart/form-data. \
 \
Chunked bodies are supported by not passing a length value to new(). \
 \
It is currently used by Catalyst, Dancer, Maypole, Web::Simple and Jedi."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.230.0"

RPM_NAME = "perl-HTTP-Body-1.230.0-1.12.noarch.rpm"
RPM_HASH = "221517c25c143aad280fd50b102ca91e4e9f2b5d2a40dc80337e33fae158cdf80e3ec61e6cae22d8e818d62b41475423cea401205ccf57b2979d8ab07f80090d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTTP--Body \
perl-HTTP--Body--MultiPart \
perl-HTTP--Body--OctetStream \
perl-HTTP--Body--UrlEncoded \
perl-HTTP--Body--XForms \
perl-HTTP--Body--XFormsMultipart \
perl-HTTP-Body"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-HTTP--Headers \
perl-IO--File"

inherit rpm
