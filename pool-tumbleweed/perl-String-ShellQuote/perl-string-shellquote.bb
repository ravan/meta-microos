SUMMARY = "Quote strings for passing through the shell"
DESCRIPTION = "This module contains some functions which are useful for quoting strings \
which are going to pass through the shell or a shell-like object."
LICENSE = "Artistic-1.0 | GPL-2.0+"

PV = "1.04"

RPM_NAME = "perl-String-ShellQuote-1.04-6.34.noarch.rpm"
RPM_HASH = "9118dfcabb9ecff98b096ba02c22779f7d06d78bdf7602811057526df1dbc613163685846bfe76f48034cc21b2535e02ff01e6338e4bf52553985d7de7869316"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-String--ShellQuote \
perl-String-ShellQuote"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
