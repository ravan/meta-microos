SUMMARY = "Perl Development"
DESCRIPTION = "Tools and libraries for software development using the Perl programming language."
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-devel-perl-devel_perl-20170319-2.21.aarch64.rpm"
RPM_HASH = "04efc102da1a9882c920358763664f16023c90530af7c7eda3ae30d18cf0fe410f99504d84a9912423750cb352563a6364b7f874cb4aa4e7179a94c1e42d43f2"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-devel-perl-devel-perl"

RDEPENDS:${PN} += ""

inherit rpm
