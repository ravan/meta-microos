SUMMARY = "Assert that your Perl files compile OK"
DESCRIPTION = "'Test::Compile' lets you check the whether your perl modules and scripts \
compile properly, results are reported in standard 'Test::Simple' fashion. \
 \
The basic usage - as shown above, will locate your perl files and test that \
they all compile. \
 \
Module authors can (and probably should) include the following in a \
_t/00-compile.t_ file and have 'Test::Compile' automatically find and check \
all Perl files in a module distribution: \
 \
     \
    use strict; \
    use warnings; \
    use Test::Compile qw(); \
 \
    my $test = Test::Compile->new(); \
    $test->all_files_ok(); \
    $test->done_testing();"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "3.3.3"

RPM_NAME = "perl-Test-Compile-3.3.3-1.12.noarch.rpm"
RPM_HASH = "15dd662463fe8dc889c7afa922e8f971d37bec5c5153ed88e4046cf12bf31db768827a3c3afe43cba02cca32d3f69df91ea45c9de0d27be26a3f1760eebafd86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Compile \
perl-Test--Compile--Internal \
perl-Test-Compile"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Exporter \
perl-parent"

inherit rpm
