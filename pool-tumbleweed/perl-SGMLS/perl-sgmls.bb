SUMMARY = "SGML/XML Parsers"
DESCRIPTION = "SGMLSpm is a Perl script that reads ESIS output (from parsers like SP) \
and offers an event-based interface to the parser. As long as the \
parser can parse XML this also works for XML."
LICENSE = "GPL-2.0"

PV = "1.1"

RPM_NAME = "perl-SGMLS-1.1-1.33.aarch64.rpm"
RPM_HASH = "5f829bf6e6d032c6a01a0d5fa0e4f95effd395b6f0fc91f3e5f25f121714f4b2819d1122aa7508ac999e483d4e5bd591b1d4665cf4d068304dba09f503231853"

RPROVIDES:${PN} += "perl-SGMLS \
perl-SGMLS--Output \
perl-SGMLS--Refs \
perl-SGMLS-Attribute \
perl-SGMLS-Element \
perl-SGMLS-Entity \
perl-SGMLS-Event \
perl-SGMLS-Notation"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
