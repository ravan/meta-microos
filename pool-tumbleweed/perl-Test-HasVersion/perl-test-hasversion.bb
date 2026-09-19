SUMMARY = "Check Perl modules have version numbers"
DESCRIPTION = "Do you wanna check that every one of your Perl modules in a distribution \
has a version number? You wanna make sure you don't forget the brand new \
modules you just added? Well, that's the module you have been looking for. \
Use it! \
 \
Do you wanna check someone else's distribution to make sure the author have \
not committed the sin of leaving Perl modules without a version that can be \
used to tell if you have this or that feature? 'Test::HasVersion' is also \
for you, nasty little fellow. \
 \
There's a script _test_version_ which is installed with this distribution. \
You may invoke it from within the root directory of a distribution you just \
unpacked, and it will check every _.pm_ file in the directory and under \
_lib/_ (if any). \
 \
  $ test_version \
 \
You may also provide directories and files as arguments. \
 \
  $ test_version *.pm lib/ inc/ \
  $ test_version . \
 \
(Be warned that many Perl modules in a _t/_ directory do not receive \
versions because they are not used outside the distribution.) \
 \
Ok. That's not a very useful module by now. But it will be. Wait for the \
upcoming releases."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.014"

RPM_NAME = "perl-Test-HasVersion-0.014-1.41.noarch.rpm"
RPM_HASH = "0ccecb27fcc3edfc6d9db122cfddfeb7fd43fbe7912eae19d09fe7336b50bac21cab94005cb7cd4b1902477e66643410357908c153f339b68ea820b81f7568a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--HasVersion \
perl-Test-HasVersion"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0 \
perl-Test--Builder--Tester"

inherit rpm
