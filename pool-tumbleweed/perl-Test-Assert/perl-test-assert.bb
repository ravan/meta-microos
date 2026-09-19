SUMMARY = "Assertion methods for those who like JUnit."
DESCRIPTION = "This class provides a set of assertion methods useful for writing tests. \
The API is based on JUnit4 and the Test::Unit::Lite manpage and the methods \
die on failure. \
 \
These assertion methods might be not useful for common the Test::Builder \
manpage-based (the Test::Simple manpage, the Test::More manpage, etc.) test \
units. \
 \
The assertion methods can be used in class which is derived from \
'Test::Assert' or used as standard Perl functions after importing them into \
user's namespace. \
 \
'Test::Assert' can also wrap standard the Test::Simple manpage, the \
Test::More manpage or other the Test::Builder manpage-based tests. \
 \
The assertions can be also used for run-time checking."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.0504"

RPM_NAME = "perl-Test-Assert-0.0504-9.40.noarch.rpm"
RPM_HASH = "6fc6eee15b4d5a3f50737d879fa4a45e5b35c20fb49b4f9925a66deedf301406ee3fc4f64086552ddc5a880e9d91919ff62ae1ea4c105e181c7169320bd80fe8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Exception--Assertion \
perl-Test--Assert \
perl-Test-Assert"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Exception--Base \
perl-Symbol--Util \
perl-constant--boolean"

inherit rpm
