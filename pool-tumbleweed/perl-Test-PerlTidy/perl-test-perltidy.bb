SUMMARY = "Check that all your files are tidy"
DESCRIPTION = "This test submodule runs perltidy on files and reports errors if any \
of the files differ after having been tidied. It does not permanently \
modify the files being tested. \
 \
By default, perltidy will be run on files under the current directory \
and its subdirectories with extensions matching: .pm .pl .PL .t."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "20260110.0.0"

RPM_NAME = "perl-Test-PerlTidy-20260110.0.0-1.5.noarch.rpm"
RPM_HASH = "ddc1d777cf1c4473e839a7f3dd3e17c52ee67c97b5866c66cbfefed6f73a11bef0dfa6a62b5167d585ceb45bbd9664c8345509b54467ab9c446400d5a517d8f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--PerlTidy \
perl-Test-PerlTidy"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Path--Tiny \
perl-Perl--Tidy \
perl-Text--Diff \
perl-parent"

inherit rpm
