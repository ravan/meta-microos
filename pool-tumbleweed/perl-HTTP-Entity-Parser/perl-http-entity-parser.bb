SUMMARY = "PSGI compliant HTTP Entity Parser"
DESCRIPTION = "HTTP::Entity::Parser is a PSGI-compliant HTTP Entity parser. This module \
also is compatible with HTTP::Body. Unlike HTTP::Body, HTTP::Entity::Parser \
reads HTTP entities from PSGI's environment '$env->{'psgi.input'}' and \
parses it. This module supports application/x-www-form-urlencoded, \
multipart/form-data and application/json."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.250.0"

RPM_NAME = "perl-HTTP-Entity-Parser-0.250.0-1.3.noarch.rpm"
RPM_HASH = "746af5ffd82a0b2881574a73a77527f1c8857f1368c25d665848329ee2dc589aa5909ff84e923146a47a4a0f0b693ba374c4abd6a22fb7db3fda8e0830520a93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTTP--Entity--Parser \
perl-HTTP--Entity--Parser--JSON \
perl-HTTP--Entity--Parser--MultiPart \
perl-HTTP--Entity--Parser--OctetStream \
perl-HTTP--Entity--Parser--UrlEncoded \
perl-HTTP-Entity-Parser"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-HTTP--MultiPartParser \
perl-Hash--MultiValue \
perl-JSON--MaybeXS \
perl-Module--Load \
perl-Stream--Buffered \
perl-WWW--Form--UrlEncoded"

inherit rpm
