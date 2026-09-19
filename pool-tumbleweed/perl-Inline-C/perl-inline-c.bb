SUMMARY = "C Language Support for Inline"
DESCRIPTION = "'Inline::C' is a module that allows you to write Perl subroutines in C. \
Since version 0.30 the Inline module supports multiple programming \
languages and each language has its own support module. This document \
describes how to use Inline with the C programming language. It also goes a \
bit into Perl C internals. \
 \
If you want to start working with programming examples right away, check \
out Inline::C::Cookbook. For more information on Inline in general, see \
Inline."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.820.0"

RPM_NAME = "perl-Inline-C-0.820.0-1.4.aarch64.rpm"
RPM_HASH = "4853b532925752b556541842a902ea544a2bb4eea700e2fd870f930a490244c315d171f934f1676312dea4406d53ca8b47f927da38793f6d990c1a737df20dff"

RPROVIDES:${PN} += "perl-Inline--C \
perl-Inline--C--Parser \
perl-Inline--C--Parser--Pegex \
perl-Inline--C--Parser--Pegex--AST \
perl-Inline--C--Parser--Pegex--Grammar \
perl-Inline--C--Parser--RecDescent \
perl-Inline--C--Parser--RegExp \
perl-Inline-C"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-ExtUtils--MakeMaker \
perl-Inline \
perl-Parse--RecDescent \
perl-Pegex"

inherit rpm
