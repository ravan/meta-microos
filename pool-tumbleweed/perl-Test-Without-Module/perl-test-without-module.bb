SUMMARY = "Test fallback behaviour in absence of modules"
DESCRIPTION = "This module allows you to deliberately hide modules from a program even \
though they are installed. This is mostly useful for testing modules that \
have a fallback when a certain dependency module is not installed."
LICENSE = "Artistic-2.0"

PV = "0.230.0"

RPM_NAME = "perl-Test-Without-Module-0.230.0-1.11.noarch.rpm"
RPM_HASH = "918efb127eec0f93eb6215f5ed40d96586a83eef2eeeebfa7b43c0851e636966e953780e289a067efa323c7f43aaee9665cecd7c602c19afbd3d01d6bfc8c846"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Without--Module \
perl-Test-Without-Module"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
