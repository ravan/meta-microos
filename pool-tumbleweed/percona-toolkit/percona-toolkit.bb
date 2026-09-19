SUMMARY = "Advanced MySQL and system command-line tools"
DESCRIPTION = "Percona Toolkit is a collection of advanced command-line tools used by \
Percona (http://www.percona.com/) support staff to perform a variety of \
MySQL and system tasks that are too difficult or complex to perform manually. \
 \
These tools are ideal alternatives to private or 'one-off' scripts because \
they are professionally developed, formally tested, and fully documented. \
They are also fully self-contained, so installation is quick and easy and \
no libraries are installed. \
 \
Percona Toolkit is developed and supported by Percona Inc.  For more \
information and other free, open-source software developed by Percona, \
visit http://www.percona.com/software/. \
 \
This collection was formerly known as Maatkit."
LICENSE = "GPL-2.0-only"

PV = "3.7.1"

RPM_NAME = "percona-toolkit-3.7.1-2.4.aarch64.rpm"
RPM_HASH = "ca6c9fcd5d9e10938b854ca0ebc338f3a91afc4909e63bf2311ef8b249490628974c6781e2b814d0dbf5eb2fd1b910e7470dae689ed19b4648bf8526d95ff301"

RPROVIDES:${PN} += "config-percona-toolkit \
maatkit \
percona-toolkit"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0 \
perl-DBD--mysql \
perl-DBI \
perl-IO--Socket--SSL \
perl-Term--ReadKey \
perl-Time--HiRes"

inherit rpm
