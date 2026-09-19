SUMMARY = "SSL support for Net::SMTP"
DESCRIPTION = "Implements the same API as Net::SMTP, but uses IO::Socket::SSL for its \
network operations. Due to the nature of 'Net::SMTP''s 'new' method, it is \
not overridden to make use of a default port for the SMTPS service. Perhaps \
future versions will be smart like that. Port '465' is usually what you \
want, and it's not a pain to specify that. \
 \
For interface documentation, please see Net::SMTP."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.04"

RPM_NAME = "perl-Net-SMTP-SSL-1.04-1.39.noarch.rpm"
RPM_HASH = "0f0e195299a8efcd8bac4da73421e40530302341d9d2aa4ffba664c93dd2864e8a9aed086d09e59dacce09289fe33bb608be5ce26ae9f9c570d467f4f652f4ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--SMTP--SSL \
perl-Net-SMTP-SSL"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-IO--Socket--SSL"

inherit rpm
