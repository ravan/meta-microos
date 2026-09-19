SUMMARY = "Make sure you didn't emit any warnings while testing"
DESCRIPTION = "In general, your tests shouldn't produce warnings. This modules causes any \
warnings to be captured and stored. It automatically adds an extra test \
that will run when your script ends to check that there were no warnings. \
If there were any warnings, the test will give a 'not ok' and diagnostics \
of where, when and what the warning was, including a stack trace of what \
was going on when the it occurred. \
 \
If some of your tests *are supposed to* produce warnings then you should be \
capturing and checking them with Test::Warn, that way Test::NoWarnings will \
not see them and so not complain. \
 \
The test is run by an 'END' block in Test::NoWarnings. It will not be run \
when any forked children exit."
LICENSE = "LGPL-2.1-or-later"

PV = "1.60.0"

RPM_NAME = "perl-Test-NoWarnings-1.60.0-1.7.noarch.rpm"
RPM_HASH = "8ba9717a13baa1c2fa293c09cf04e18ce727d6ae72aae887b3f36483ef8c9daa36a859564fe37b30e52705e3ba582e66480d92d624cfcc46123f22520b71d515"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--NoWarnings \
perl-Test--NoWarnings--Warning \
perl-Test-NoWarnings"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Test--Builder"

inherit rpm
