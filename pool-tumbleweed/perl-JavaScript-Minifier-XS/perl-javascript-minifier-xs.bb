SUMMARY = "XS based JavaScript minifier"
DESCRIPTION = "'JavaScript::Minifier::XS' is a JavaScript 'minifier'; its designed to \
remove unnecessary whitespace and comments from JavaScript files, which \
also *not* breaking the JavaScript. \
 \
'JavaScript::Minifier::XS' is similar in function to \
'JavaScript::Minifier', but is substantially faster as its written in XS \
and not just pure Perl."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.160.0"

RPM_NAME = "perl-JavaScript-Minifier-XS-0.160.0-1.4.aarch64.rpm"
RPM_HASH = "085af2810abd5aa4bea94b0d840d94b26c47300d60034d319d7457f721bd4d9f3b7ff68b9ba88aefe368b61ceba8ddd9c60439a6c15129b740b6b80e1d8b064a"

RPROVIDES:${PN} += "perl-JavaScript--Minifier--XS \
perl-JavaScript-Minifier-XS"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
