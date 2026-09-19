SUMMARY = "Add test failures if warnings are caught"
DESCRIPTION = "This module hooks '$SIG{__WARN__}' and converts warnings to the Test::More \
manpage 'fail()' calls. It is designed to be used with 'done_testing', when \
you don't need to know the test count in advance. \
 \
Just as with the Test::NoWarnings manpage, this does not catch warnings if \
other things localize '$SIG{__WARN__}', as this is designed to catch \
_unhandled_ warnings."
LICENSE = "Apache-2.0"

PV = "0.008"

RPM_NAME = "perl-Test-FailWarnings-0.008-3.42.noarch.rpm"
RPM_HASH = "74251f6b42c447b6fae9a13d85410e6be496e1a85d86f264569ee3229ae7f7fe19c0a26ca8135b9056e25ce82d25798690fd6720ec61b66f6789a56ec90957df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--FailWarnings \
perl-Test-FailWarnings"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Test--More"

inherit rpm
