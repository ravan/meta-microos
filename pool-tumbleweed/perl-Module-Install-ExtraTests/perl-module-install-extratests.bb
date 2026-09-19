SUMMARY = "Contextual Tests That the Harness Can Ignore"
DESCRIPTION = "contextual tests that the harness can ignore"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.008"

RPM_NAME = "perl-Module-Install-ExtraTests-0.008-6.37.noarch.rpm"
RPM_HASH = "b4c8e8ede9c56d7011ac7deda86f5d89b608aee81959eacba3922391bac4e43c219f611922bf6f460414627fa413aedfed838eab0ab1d8861414d77bfe11e834"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Module--Install--ExtraTests \
perl-Module-Install-ExtraTests"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
