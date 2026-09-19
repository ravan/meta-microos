SUMMARY = "Minimal XML parser / schema checker / pretty-printer using C internally"
DESCRIPTION = "This module is a 'Bare' XML parser. It is implemented in C. The parser \
itself is a simple state engine that is less than 500 lines of C. The \
parser builds a C struct tree from input text. That C struct tree is \
converted to a Perl hash by a Perl function that makes basic calls back to \
the C to go through the nodes sequentially. \
 \
The parser itself will only cease parsing if it encounters tags that are \
not closed properly. All other inputs will parse, even invalid inputs. To \
allowing checking for validity, a schema checker is included in the module \
as well. \
 \
The schema format is custom and is meant to be as simple as possible. It is \
based loosely around the way multiplicity is handled in Perl regular \
expressions."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.53"

RPM_NAME = "perl-XML-Bare-0.53-7.2.aarch64.rpm"
RPM_HASH = "82765815dec3a2c14279af4862df6610c17eebd552f6d56e6e768998ccb908226178c29a3e5306f01dd326b50de75d4713cf21edb728f138cf21efeb08db7931"

RPROVIDES:${PN} += "perl-XML--Bare \
perl-XML--Bare--Object \
perl-XML-Bare"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
