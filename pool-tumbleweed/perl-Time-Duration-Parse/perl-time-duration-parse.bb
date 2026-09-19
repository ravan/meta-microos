SUMMARY = "Parse string that represents time duration"
DESCRIPTION = "Time::Duration::Parse is a module to parse human readable duration strings \
like _2 minutes and 3 seconds_ to seconds. \
 \
It does the opposite of Time::Duration/duration_exact function in \
Time::Duration and is roundtrip safe. So, the following is always true. \
 \
  use Time::Duration::Parse; \
  use Time::Duration; \
 \
  my $seconds = int rand 100000; \
  is( parse_duration(duration_exact($seconds)), $seconds );"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.160.0"

RPM_NAME = "perl-Time-Duration-Parse-0.160.0-1.7.noarch.rpm"
RPM_HASH = "c395153a47731bafad9258c8db835ec4c4893bb43d6bc8c2866d528976a0b75549f8eca2cc9b8033b95db2e1466dc66583e3035f6c299b3ccdb599d2adc25a9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Time--Duration--Parse \
perl-Time-Duration-Parse"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
