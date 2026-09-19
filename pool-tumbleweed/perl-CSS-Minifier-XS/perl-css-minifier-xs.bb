SUMMARY = "XS based CSS minifier"
DESCRIPTION = "'CSS::Minifier::XS' is a CSS 'minifier'; its designed to remove unnecessary \
whitespace and comments from CSS files, while also *not* breaking the CSS. \
 \
'CSS::Minifier::XS' is similar in function to 'CSS::Minifier', but is \
substantially faster as its written in XS and not just pure Perl."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.150.0"

RPM_NAME = "perl-CSS-Minifier-XS-0.150.0-1.3.aarch64.rpm"
RPM_HASH = "dc2b0c220b4d137b67fd7c81d85daf85044418c6066b9c80561ea99710b140980a60346c88d4492bf5fbadad121350abe2df895607bf8d3018bfd3973118b20e"

RPROVIDES:${PN} += "perl-CSS--Minifier--XS \
perl-CSS-Minifier-XS"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
