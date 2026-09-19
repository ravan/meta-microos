SUMMARY = "Check syntax, presence of use strict; and test coverage"
DESCRIPTION = "The most basic test one can write is 'does it compile ?'. This module tests \
if the code compiles and play nice with Test::Simple modules. \
 \
Another good practice this module can test is to 'use strict;' in all perl \
files. \
 \
By setting a minimum test coverage through 'all_cover_ok()', a code author \
can ensure his code is tested above a preset level of _kwality_ throughout \
the development cycle. \
 \
Along with Test::Pod, this module can provide the first tests to setup for \
a module author. \
 \
This module should be able to run under the -T flag for perl >= 5.6. All \
paths are untainted with the following pattern: 'qr|^([-+@\\w./:\\\\]+)$|' \
controlled by '$Test::Strict::UNTAINT_PATTERN'."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.540.0"

RPM_NAME = "perl-Test-Strict-0.540.0-1.7.noarch.rpm"
RPM_HASH = "a7b45ce70562418ac09cc83da5dc3f530d1e29de5f47eeaa44f94e721446736be432116b9ab0a4e589e8b92cf650f99858da87042ac794299eeda95f12ee6740"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Strict \
perl-Test-Strict"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
