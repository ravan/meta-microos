SUMMARY = "Build custom test packages with only the features you want"
DESCRIPTION = "Test::Kit allows you to create a single module in your project which gives \
you access to all of the testing functions you want. \
 \
Its primary goal is to reduce boilerplate code that is currently littering \
the top of all your test files. \
 \
It also allows your testing to be more consistent; for example it becomes a \
trivial change to include Test::FailWarnings in all of your tests, and \
there is no danger that you forget to include it in a new test."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.160.0"

RPM_NAME = "perl-Test-Kit-2.160.0-2.12.noarch.rpm"
RPM_HASH = "49d58cd50cd8f63b535547b70cbbfbc9d34dcba689e1b73c69c3455c87502bc3b105177c2df16cb32200822490fb0ce655bd107b416e8189c659da678fc91220"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Kit \
perl-Test-Kit"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Hook--LexWrap \
perl-Import--Into \
perl-Module--Runtime \
perl-Sub--Delete"

inherit rpm
