SUMMARY = "Check your test requirements against the available version of Git"
DESCRIPTION = "Test::Requires::Git checks if the version of Git available for testing \
meets the given requirements. If the checks fail, then all tests will be \
_skipped_. \
 \
'use Test::Requires::Git' always calls 'test_requires_git' with the given \
arguments. If you don't want 'test_requires_git' to be called at import \
time, write this instead: \
 \
    use Test::Requires::Git -nocheck; \
 \
Passing the 'git' parameter (see test_requires_git below) to 'use \
Test::Requires::Git' will override it for the rest of the program run."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.008"

RPM_NAME = "perl-Test-Requires-Git-1.008-1.31.noarch.rpm"
RPM_HASH = "383592b182b9e210db6d6bdac50ea7544d04ee04ace9abede39e6e922e2728036ce5e3b67f8d581578157c600769aaeb15ff2fe11d669efe58b6b4d33db955d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Requires--Git \
perl-Test-Requires-Git"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Git--Version--Compare"

inherit rpm
