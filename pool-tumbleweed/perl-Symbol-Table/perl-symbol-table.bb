SUMMARY = "An easy interface to symbol tables"
DESCRIPTION = "Symbol::Table allows the user to manipulate Perl's symbol table \
 \
 \
 \
Authors: \
-------- \
    Greg London"
LICENSE = "Artistic-1.0"

PV = "1.01"

RPM_NAME = "perl-Symbol-Table-1.01-64.46.aarch64.rpm"
RPM_HASH = "0b0e800320c1ec40cd67a1da6027b514710b4a891ff8ef809c3f2f4a4e802a9e656191a70b30e8d22421cf320bfbd7629595095fa69e7182af831fcfdacc84ad"

RPROVIDES:${PN} += "perl-Symbol--Table \
perl-Symbol--Table--Tie \
perl-Symbol-Table"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
