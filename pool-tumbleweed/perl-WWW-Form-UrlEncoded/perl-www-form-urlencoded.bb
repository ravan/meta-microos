SUMMARY = "Parser and builder for application/x-www-form-urlencoded"
DESCRIPTION = "WWW::Form::UrlEncoded provides application/x-www-form-urlencoded parser and \
builder. This module aims to have compatibility with other CPAN modules \
like HTTP::Body's urlencoded parser. \
 \
This module try to use WWW::Form::UrlEncoded::XS by default and fail to it, \
use WWW::Form::UrlEncoded::PP instead"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.260.0"

RPM_NAME = "perl-WWW-Form-UrlEncoded-0.260.0-1.3.aarch64.rpm"
RPM_HASH = "edbe25f7d695b18f0c8423de77563056fc5ddcac5c8cb37b8dbc1fec69174fefc7329d200c483141fb512c6f1d0e4516695996b562f5177087f8d82177da4768"

RPROVIDES:${PN} += "perl-WWW--Form--UrlEncoded \
perl-WWW--Form--UrlEncoded--PP \
perl-WWW-Form-UrlEncoded"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
