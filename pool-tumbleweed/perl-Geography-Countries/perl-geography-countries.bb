SUMMARY = "2-letter, 3-letter, and numerical codes for countries"
DESCRIPTION = "This module maps country names, and their 2-letter, 3-letter and numerical \
codes, as defined by the ISO-3166 maintenance agency [1], and defined by \
the UNSD."
LICENSE = "MIT"

PV = "2009041301"

RPM_NAME = "perl-Geography-Countries-2009041301-1.42.noarch.rpm"
RPM_HASH = "6fb48f72f21352f27e3dd3d5a039ca6841e00956030dc17ecb111c7094079977392de8645f9dea41f2120d5fe28cb480b01dc8a0cbc16cfce28a37e65e37e5e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Geography--Countries \
perl-Geography-Countries"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
