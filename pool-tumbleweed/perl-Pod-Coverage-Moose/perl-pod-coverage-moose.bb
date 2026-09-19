SUMMARY = "Pod::Coverage extension for Moose"
DESCRIPTION = "When using Pod::Coverage in combination with Moose, it will report any \
method imported from a role. This is especially bad when used in \
combination with Test::Pod::Coverage, since it takes away its ease of use. \
 \
To use this module in combination with Test::Pod::Coverage, use something \
like this: \
 \
  use Test::Pod::Coverage; \
  all_pod_coverage_ok({ coverage_class => 'Pod::Coverage::Moose'});"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.80.0"

RPM_NAME = "perl-Pod-Coverage-Moose-0.80.0-2.12.noarch.rpm"
RPM_HASH = "74c87673c1360e39adc851f24c785606ebe3ca000b95444676cde6564cd758740db74e9ce77c28d386d8c630402d80b9fba05193212d21d4260b74a24db13bdf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Pod--Coverage--Moose \
perl-Pod-Coverage-Moose"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Class--Load \
perl-Moose \
perl-Pod--Coverage \
perl-namespace--autoclean"

inherit rpm
