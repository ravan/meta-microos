SUMMARY = "Test Classes the easy way"
DESCRIPTION = "When people write test classes with the excellent 'Test::Class', you often \
see the following at the top of the code: \
 \
  package Some::Test::Class; \
 \
  use strict; \
  use warnings; \
  use base 'My::Test::Class'; \
  use Test::More; \
  use Test::Exception; \
 \
   \
 \
That's a lot of boilerplate and I don't like boilerplate. So now you can do \
this: \
 \
  use Test::Class::Most parent => 'My::Test::Class'; \
 \
That automatically imports the strict manpage and the warnings manpage for \
you. It also gives you all of the testing goodness from the Test::Most \
manpage."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.08"

RPM_NAME = "perl-Test-Class-Most-0.08-1.39.noarch.rpm"
RPM_HASH = "96b212af9bee7ab16ab57c69eeaf035a040caa5ff9b3054d08a90a048a9229f7342e7c8757f88b0daec986922e60a5f9ec437f4259916ff36a6490ac099a95f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Class--Most \
perl-Test-Class-Most"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Test--Class \
perl-Test--Most"

inherit rpm
