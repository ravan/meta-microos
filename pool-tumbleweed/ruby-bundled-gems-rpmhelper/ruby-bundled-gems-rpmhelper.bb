SUMMARY = "A little helper to add provides for intree gems during a ruby build"
DESCRIPTION = "Just a little helper to add provides for intree gems during a ruby build"
LICENSE = "MIT"

PV = "0.0.6"

RPM_NAME = "ruby-bundled-gems-rpmhelper-0.0.6-1.6.noarch.rpm"
RPM_HASH = "4dc3984d422273dfc03d40bfb2c2aaf2ff9b56753a2121de7f273f24665eba520b064e7c52d22ac20834f7a61c0b399a70033be0b02bc51ff82626eddcb6a593"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ruby-bundled-gems-rpmhelper"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
