SUMMARY = "Basic cross-platform tests for scripts"
DESCRIPTION = "The intent of this module is to provide a series of basic tests for 80% of \
the testing you will need to do for scripts in the _script_ (or _bin_ as is \
also commonly used) paths of your Perl distribution. \
 \
It also provides similar functions for testing programs that are not Perl \
scripts. \
 \
Further, it aims to provide this functionality with perfect \
platform-compatibility, and in a way that is as unobtrusive as possible. \
 \
That is, if the program works on a platform, then *Test::Script* should \
always work on that platform as well. Anything less than 100% is considered \
unacceptable. \
 \
In doing so, it is hoped that *Test::Script* can become a module that you \
can safely make a dependency of all your modules, without risking that your \
module won't install on some platform because of the dependency. \
 \
Where a clash exists between wanting more functionality and maintaining \
platform safety, this module will err on the side of platform safety."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.310.0"

RPM_NAME = "perl-Test-Script-1.310.0-1.5.noarch.rpm"
RPM_HASH = "34e4189c9755ea98abc62d140304354f656e44420d8263d3dbee1a2eb261ac2c018e8f5731a091170920f41cbb92d05977ba4ac58e13fc3f9bd0c8e7ea881c0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Script \
perl-Test-Script"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Capture--Tiny \
perl-Probe--Perl \
perl-Test2--API"

inherit rpm
