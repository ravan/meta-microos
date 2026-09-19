SUMMARY = "Parse mime-types, match against media ranges"
DESCRIPTION = "This module provides basic functions for handling mime-types. It can handle \
matching mime-types against a list of media-ranges. See section 14.1 of the \
HTTP specification [RFC 2616] for a complete explanation: \
http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.1"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.006"

RPM_NAME = "perl-Parse-MIME-1.006-1.18.noarch.rpm"
RPM_HASH = "4b3662751a5382e7d79f138d57834bc17a205dc27e8b36f63455775b6e53347b13d304001b601c3fa0855522660bd907cbc0c3ee46d65f6e3364ac5487e2c999"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Parse--MIME \
perl-Parse-MIME"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
