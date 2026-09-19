SUMMARY = "Getopt::Long, but simpler and more powerful"
DESCRIPTION = "Getopt::Long::Descriptive is yet another Getopt library. It's built atop \
Getopt::Long, and gets a lot of its features, but tries to avoid making you \
think about its huge array of options. \
 \
It also provides usage (help) messages, data validation, and a few other \
useful features."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.117.0"

RPM_NAME = "perl-Getopt-Long-Descriptive-0.117.0-1.4.noarch.rpm"
RPM_HASH = "f672ce679b2d6ebfe7678980fd549d22b19b0d1d9019c02191596a730c57916c3f585dfe3019ffcc268fefbc4c7baddc7eb0d0680b7ef2c17d8dddfdb77506b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Getopt--Long--Descriptive \
perl-Getopt--Long--Descriptive--Opts \
perl-Getopt--Long--Descriptive--Usage \
perl-Getopt-Long-Descriptive"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Getopt--Long \
perl-Params--Validate \
perl-Sub--Exporter \
perl-Sub--Exporter--Util"

inherit rpm
