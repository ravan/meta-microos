SUMMARY = "List modules and versions loaded if tests fail"
DESCRIPTION = "Assuming you shipped your module to CPAN with working tests, test failures \
from at http://www.cpantesters.org/ might be due to platform issues, Perl \
version issues or problems with dependencies. This module helps you \
diagnose deep dependency problems by showing you exactly what modules and \
versions were loaded during a test run."
LICENSE = "Apache-2.0"

PV = "0.010"

RPM_NAME = "perl-Test-DiagINC-0.010-1.19.noarch.rpm"
RPM_HASH = "b744bcb16ddc7730ae8cfbcb1017155dbaa5f56a0d4b7250d85a6c8b9776ded4af1fc95b17b774cbda17808cbf34286063ba908436f18520423b8b6a03a23535"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--DiagINC \
perl-Test-DiagINC"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
