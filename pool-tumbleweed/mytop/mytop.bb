SUMMARY = "A top Clone for MySQL"
DESCRIPTION = "mytop is a console-based (non-GUI) tool for monitoring the threads and \
overall performance of MySQL 3.22.x, 3.23.x, and 4.x servers. \
 \
- With Term::ANSIColor installed you even get color. \
 \
- If you install Time::HiRes, get good real-time queries/second stats."
LICENSE = "GPL-2.0-or-later"

PV = "1.6"

RPM_NAME = "mytop-1.6-105.12.noarch.rpm"
RPM_HASH = "7fe9599cc87f2fd34c96bc314f80b58eb9858656c85a80ea1e95490cb2257d8e15f33da5f7b72a3a5416626591ec8ca1da20dcada7547c83ac5219f80c9a2b80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mytop"

RDEPENDS:${PN} += "/usr/bin/perl \
perl \
perl-DBD-mysql \
perl-DBI \
perl-TermReadKey"

inherit rpm
