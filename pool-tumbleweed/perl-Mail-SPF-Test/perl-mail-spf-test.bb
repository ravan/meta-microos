SUMMARY = "SPF test-suite class"
DESCRIPTION = "  *Mail::SPF::Test* is a class for reading and manipulating SPF test-suite \
  data."
LICENSE = "BSD-3-Clause"

PV = "1.001"

RPM_NAME = "perl-Mail-SPF-Test-1.001-8.40.noarch.rpm"
RPM_HASH = "5dd6a362194e1c526f9194c57bdce860f5ac4882b7eb78c0d0a49f804097c957f2a2607e00e6e516dafd99fa0803775bace1ed215d8fa0435f0171d00421604c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mail--SPF--Test \
perl-Mail--SPF--Test--Base \
perl-Mail--SPF--Test--Case \
perl-Mail--SPF--Test--Scenario \
perl-Mail-SPF-Test"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Net--DNS \
perl-NetAddr--IP \
perl-YAML \
perl-version"

inherit rpm
