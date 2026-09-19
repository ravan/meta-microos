SUMMARY = "Tidy YAML files"
DESCRIPTION = "yamltidy is a linter or rather a formatter for YAML files. \
 \
It can adjust formatting without removing comments or blank lines. \
 \
For examples see https://perlpunk.github.io/yamltidy \
 \
The code can be found at https://github.com/perlpunk/yamltidy."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.11.0"

RPM_NAME = "perl-YAML-Tidy-0.11.0-1.8.noarch.rpm"
RPM_HASH = "d8b5f1de35d826b670431160b3cd7f33f7a1192bfade309ea1fd62e3db235aa3e89461236fa0d6658c7e679f96bdb9df5763f6e68f6cefdd36a02976e703ec48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-YAML--Tidy \
perl-YAML--Tidy--Config \
perl-YAML--Tidy--Node \
perl-YAML--Tidy--Node--Alias \
perl-YAML--Tidy--Node--Collection \
perl-YAML--Tidy--Node--Leaf \
perl-YAML--Tidy--Node--Scalar \
perl-YAML--Tidy--Run \
perl-YAML-Tidy"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0 \
perl-Getopt--Long--Descriptive \
perl-YAML--LibYAML--API \
perl-YAML--LibYAML--API--XS \
perl-YAML--PP--Common \
perl-YAML--PP--Highlight \
perl-YAML--PP--Parser \
perl-experimental"

inherit rpm
