SUMMARY = "Check fail2ban server and how many IPs are currently banned"
DESCRIPTION = "This plugin checks if the fail2ban server is running and how many IPs are \
currently banned.  You can use this plugin to monitor all the jails or just a \
specific jail. \
 \
How to use \
---------- \
Just have to run the following command: \
  $ ./check_fail2ban --help"
LICENSE = "GPL-2.0-or-later"

PV = "1.1.1"

RPM_NAME = "monitoring-plugins-fail2ban-1.1.1-3.1.noarch.rpm"
RPM_HASH = "fa1e9bba610a028b9e200da1d5a20402692e1f8ce2943f6bac173d824cc02d4711d2d267d8f3abebe89f2aedfa6abf1e45a111d2c2060c36b30771b7121b9520"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "monitoring-plugins-fail2ban \
nagios-plugins-fail2ban"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
