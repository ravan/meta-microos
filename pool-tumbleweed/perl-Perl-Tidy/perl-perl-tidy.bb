SUMMARY = "Indent and reformat perl scripts"
DESCRIPTION = "This module makes the functionality of the perltidy utility available to \
perl scripts. Any or all of the input parameters may be omitted, in which \
case the @ARGV array will be used to provide input parameters as described \
in the perltidy(1) man page. \
 \
For example, the perltidy script is basically just this: \
 \
    use Perl::Tidy; \
    Perl::Tidy::perltidy(); \
 \
The call to *perltidy* returns a scalar *$error_flag* which is TRUE if an \
error caused premature termination, and FALSE if the process ran to normal \
completion. Additional discuss of errors is contained below in the ERROR \
HANDLING section."
LICENSE = "GPL-2.0-or-later"

PV = "20260826.0.0"

RPM_NAME = "perl-Perl-Tidy-20260826.0.0-1.1.noarch.rpm"
RPM_HASH = "fe9603fa743184851f4b604dfc1fa4febf60b7a296c80e00f05ec3ca641799d67318ef4286bd926563f5fd1e98750094e674af727200b709d8e39f17e4b7f858"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Perl--Tidy \
perl-Perl--Tidy--Debugger \
perl-Perl--Tidy--Diagnostics \
perl-Perl--Tidy--FileWriter \
perl-Perl--Tidy--Formatter \
perl-Perl--Tidy--HtmlWriter \
perl-Perl--Tidy--IOScalar \
perl-Perl--Tidy--IOScalarArray \
perl-Perl--Tidy--IndentationItem \
perl-Perl--Tidy--Logger \
perl-Perl--Tidy--Tokenizer \
perl-Perl--Tidy--VerticalAligner \
perl-Perl--Tidy--VerticalAligner--Alignment \
perl-Perl--Tidy--VerticalAligner--Line \
perl-Perl-Tidy"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
