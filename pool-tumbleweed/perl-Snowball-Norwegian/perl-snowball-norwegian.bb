SUMMARY = "Porters stemming algorithm for norwegian"
DESCRIPTION = "Porters stemming algorithm for norwegian."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.200.0"

RPM_NAME = "perl-Snowball-Norwegian-1.200.0-1.10.noarch.rpm"
RPM_HASH = "5f350725d873c0049b1ec921869b71ed94a3116e4e81aa4e4cd67f70679e160ce178174f22e69610ac1dba0a0ebf02289b0e34730ee5566b4f154299354ce656"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Lingua--Stem--Snowball--No \
perl-Snowball-Norwegian"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
