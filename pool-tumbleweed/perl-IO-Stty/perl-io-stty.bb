SUMMARY = "Change and print terminal line settings"
DESCRIPTION = "This is the PERL POSIX compliant stty."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.80.0"

RPM_NAME = "perl-IO-Stty-0.80.0-1.3.noarch.rpm"
RPM_HASH = "aef8cd3d1ec009d360517eb44d14db74e70024c15d85ccbc637b97bc0ef4e88b8ad1a2c231fcb0d0982445e54fa9f6b5b9c382f5b41736f07fe266c389184c39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-IO--Stty \
perl-IO-Stty"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
