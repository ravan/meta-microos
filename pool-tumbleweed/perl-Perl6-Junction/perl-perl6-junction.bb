SUMMARY = "Perl6 style Junction operators in Perl5."
DESCRIPTION = "This is a lightweight module which provides 'Junction' operators, the most \
commonly used being 'any' and 'all'. \
 \
Inspired by the Perl6 design docs, the \
http://dev.perl.org/perl6/doc/design/exe/E06.html manpage. \
 \
Provides a limited subset of the functionality of the \
Quantum::Superpositions manpage, see the /'SEE ALSO' manpage for comment. \
 \
Notice in the the /SYNOPSIS manpage above, that if you want to match \
against a regular expression, you must use '==' or '!='. *Not* '=~' or \
'!~'. You must also use a regex object, such as 'qr/\\d/', not a plain regex \
such as '/\\d/'."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.60000"

RPM_NAME = "perl-Perl6-Junction-1.60000-3.42.noarch.rpm"
RPM_HASH = "42bed721b5c7f628fb8f2099954f8ab0b6c556e7f8a2c06a138501049a7b0d1c658a86736369628a5d9558d23733f0453cbdebc888f3976a5eaa6104eb76f1d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Perl6--Junction \
perl-Perl6--Junction--All \
perl-Perl6--Junction--Any \
perl-Perl6--Junction--Base \
perl-Perl6--Junction--None \
perl-Perl6--Junction--One \
perl-Perl6-Junction"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
