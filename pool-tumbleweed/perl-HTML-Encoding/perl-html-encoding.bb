SUMMARY = "Determine the encoding of HTML/XML/XHTML documents"
DESCRIPTION = "HTML::Encoding helps to determine the encoding of HTML and XML/XHTML \
documents."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.61"

RPM_NAME = "perl-HTML-Encoding-0.61-9.1.aarch64.rpm"
RPM_HASH = "7c02dfba60cb954662e04afd9d8217f47fe8845ffdb928c374a6581acd174c45e2da30883a525dfc0987c181377816f28ed74592f7425df91a727b41a925c358"

RPROVIDES:${PN} += "perl-HTML--Encoding \
perl-HTML-Encoding"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
