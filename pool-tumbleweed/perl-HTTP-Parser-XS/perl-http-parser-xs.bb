SUMMARY = "Fast, primitive HTTP request parser"
DESCRIPTION = "HTTP::Parser::XS is a fast, primitive HTTP request/response parser. \
 \
The request parser can be used either for writing a synchronous HTTP server \
or a event-driven server. \
 \
The response parser can be used for writing HTTP clients. \
 \
Note that even if this distribution name ends '::XS', *pure Perl* \
implementation is supported, so you can use this module on compiler-less \
environments."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.170.0"

RPM_NAME = "perl-HTTP-Parser-XS-0.170.0-1.7.aarch64.rpm"
RPM_HASH = "d0183dfe864a42f958c52c200e13eb3ada92b88184a8c49f01c050e09803dedb3bb5e764d58cce9957d363db4b86a34399ba848510e256f4c1ba2dbd7485b738"

RPROVIDES:${PN} += "perl-HTTP--Parser--XS \
perl-HTTP--Parser--XS--PP \
perl-HTTP-Parser-XS"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
