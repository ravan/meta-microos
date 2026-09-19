SUMMARY = "Comparisons against multiple values"
DESCRIPTION = "This is a lightweight module which provides 'Junction' operators, the most \
commonly used being 'any' and 'all'. \
 \
Inspired by the Perl 6 design docs, \
https://web.archive.org/web/20230922160729/https://raku.org/archive/doc/des \
ign/exe/E06.html#The%20Wonderful%20World%20of%20Junctions. \
 \
Provides a limited subset of the functionality of Quantum::Superpositions, \
see 'SEE ALSO' for comment. \
 \
Notice in the SYNOPSIS above, that if you want to match against a regular \
expression, you must use '==' or '!='. *Not* '=~' or '!~'. You must also \
use a regex object, such as 'qr/\\d/', not a plain regex such as '/\\d/'."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.003009"

RPM_NAME = "perl-Syntax-Keyword-Junction-0.003009-1.10.noarch.rpm"
RPM_HASH = "d0d62b76881c0568761a2cbfe5f5eea0b5f22041a54f7a43662db1c50a0218760f460e73c2010496726fb1d1c655841ca84f71e696170cd770bbe05378d4d94f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Syntax--Feature--Junction \
perl-Syntax--Keyword--Junction \
perl-Syntax--Keyword--Junction--All \
perl-Syntax--Keyword--Junction--Any \
perl-Syntax--Keyword--Junction--Base \
perl-Syntax--Keyword--Junction--None \
perl-Syntax--Keyword--Junction--One \
perl-Syntax-Keyword-Junction"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Sub--Exporter--Progressive \
perl-parent"

inherit rpm
