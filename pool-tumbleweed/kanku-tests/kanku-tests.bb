SUMMARY = "Test cases for kanku"
DESCRIPTION = "Test cases for kanku to run in a installed and configured kanku environment \
SEE README.md for further information."
LICENSE = "GPL-3.0-only"

PV = "1.0.0"

RPM_NAME = "kanku-tests-1.0.0-2.2.noarch.rpm"
RPM_HASH = "cebc56cc973f11f5b68316ba216860c05876705695dc1d175def7662891dfff4cc4558a2ad6a725c8f5ed38fa2b3b6c5e064ffbf3d54b54b7737c66ce33e7310"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kanku-tests \
perl-Kanku--MyDaemon \
perl-Kanku--Test--MockConsole \
perl-Kanku--Test--MockLogger"

RDEPENDS:${PN} += "kanku-common"

inherit rpm
