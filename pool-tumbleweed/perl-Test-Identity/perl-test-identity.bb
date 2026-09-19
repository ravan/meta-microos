SUMMARY = "Assert the Referential Identity of a Reference"
DESCRIPTION = "This module provides a single testing function, 'identical'. It asserts \
that a given reference is as expected; that is, it either refers to the \
same object or is 'undef'. It is similar to 'Test::More::is' except that it \
uses 'refaddr', ensuring that it behaves correctly even if the references \
under test are objects that overload stringification or numification. \
 \
It also provides better diagnostics if the test fails: \
 \
 $ perl -MTest::More=tests,1 -MTest::Identity -e'identical [], {}' \
 1..1 \
 not ok 1 \
  \
  \
  \
 \
 $ perl -MTest::More=tests,1 -MTest::Identity -e'identical [], []' \
 1..1 \
 not ok 1"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.01"

RPM_NAME = "perl-Test-Identity-0.01-1.40.noarch.rpm"
RPM_HASH = "b4bbe0a3f7f17a1206792a933917640a39fba3ca976f7605e8178b19be3b1e34e3d21e77a56dbad399536dbee1e5c2e2c17fcb6c5bc00143b2f7aea3fa544ce9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Identity \
perl-Test-Identity"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
