SUMMARY = "Simply Sending Email"
DESCRIPTION = "This module provides a very simple, very clean, very specific interface to \
multiple Email mailers. The goal of this software is to be small and \
simple, easy to use, and easy to extend."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.202.0"

RPM_NAME = "perl-Email-Send-2.202.0-1.10.noarch.rpm"
RPM_HASH = "f06e9a11e731bf242cbfbed2c8aa94ab826985be2b403a8fd0708e33f655846d12ae676559c737d977509872e0c76bbd2736f06af3e37ee3bf48b0541808a71a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Email--Send \
perl-Email--Send--NNTP \
perl-Email--Send--Qmail \
perl-Email--Send--SMTP \
perl-Email--Send--Sendmail \
perl-Email--Send--Test \
perl-Email-Send"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Email--Abstract \
perl-Email--Address \
perl-Email--Simple \
perl-Module--Pluggable \
perl-Return--Value"

inherit rpm
