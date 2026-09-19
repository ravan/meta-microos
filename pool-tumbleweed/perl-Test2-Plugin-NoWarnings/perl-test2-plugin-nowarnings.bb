SUMMARY = "Fail if tests warn"
DESCRIPTION = "Loading this plugin causes your tests to fail if there any warnings while \
they run. Each warning generates a new failing test and the warning content \
is outputted via 'diag'. \
 \
This module uses '$SIG{__WARN__}', so if the code you're testing sets this, \
then this module will stop working."
LICENSE = "Artistic-2.0"

PV = "0.100.0"

RPM_NAME = "perl-Test2-Plugin-NoWarnings-0.100.0-1.12.noarch.rpm"
RPM_HASH = "8dfa548ddd67b143be4b7ee1c63fe66b494864e1baf7278a6f1a4bd12aae52314c60cdaf78351c9b605051a61c1bff2d97169d75c2a7b0ff017da62611f7c845"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test2--Event--Warning \
perl-Test2--Plugin--NoWarnings \
perl-Test2-Plugin-NoWarnings"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Test2 \
perl-Test2--API \
perl-Test2--Event \
perl-Test2--Util--HashBase \
perl-parent"

inherit rpm
