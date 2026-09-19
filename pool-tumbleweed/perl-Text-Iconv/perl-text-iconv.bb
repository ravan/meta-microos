SUMMARY = "Perl interface to iconv() codeset conversion function"
DESCRIPTION = "The *Text::Iconv* module provides a Perl interface to the iconv() function \
as defined by the Single UNIX Specification. \
 \
The convert() method converts the encoding of characters in the input \
string from the _fromcode_ codeset to the _tocode_ codeset, and returns the \
result. \
 \
Settings of _fromcode_ and _tocode_ and their permitted combinations are \
implementation-dependent. Valid values are specified in the system \
documentation; the iconv(1) utility should also provide a *-l* option that \
lists all supported codesets."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.700.0"

RPM_NAME = "perl-Text-Iconv-1.700.0-1.10.aarch64.rpm"
RPM_HASH = "d0fa20c5ca91d90648f56c7c14d50a1f9ef1c70b7f07b0beb210becf78af5e8596f5dc8abbb6951bc76ec5a9c45e5a087309b6b19984266d441f151dfd997861"

RPROVIDES:${PN} += "perl-Text--Iconv \
perl-Text-Iconv"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
