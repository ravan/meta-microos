SUMMARY = "Expect/check-style unit testing with object methods"
DESCRIPTION = "This package creates objects that assist in writing unit tests with mocked \
object instances. Each mock instance will expect to receive a given list of \
method calls. Each method call is checked that it received the right \
arguments, and will return a prescribed result. At the end of each test, \
each object is checked to ensure all the expected methods were called."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.80.0"

RPM_NAME = "perl-Test-ExpectAndCheck-0.80.0-1.5.noarch.rpm"
RPM_HASH = "66badc5a23c0f5e43a0c1d81ee0632feb54d9a98b5ad1bce8dbf8555151fe92bd0a9f431801c3f78fa8abd714f71aa45ae23f62670f0651c9c414a6d5d85ec45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--ExpectAndCheck \
perl-Test--ExpectAndCheck--Future \
perl-Test-ExpectAndCheck"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Test--Builder \
perl-Test--Deep \
perl-Test--Future--Deferred"

inherit rpm
