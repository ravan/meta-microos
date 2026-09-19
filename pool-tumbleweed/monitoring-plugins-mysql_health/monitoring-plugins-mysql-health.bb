SUMMARY = "Check various parameters of a MySQL database"
DESCRIPTION = "When using a database that are business critical it can be a good idea to \
monitor the internals. \
 \
This Nagios plugin allows you to monitor the internal details of your \
MySQL database."
LICENSE = "GPL-2.0+"

PV = "3.0.0.5"

RPM_NAME = "monitoring-plugins-mysql_health-3.0.0.5-1.23.noarch.rpm"
RPM_HASH = "6bdc3f94a1d6a06959ac28ebb3f03ffc2e0e21f1d1fb6c51394204d466fbdf034e3d07776c7f2699d574998c96ff0d78b12515400abbdf32fbbb89d9ba7158b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "monitoring-plugins-mysql-health \
nagios-plugins-mysql-health"

RDEPENDS:${PN} += "/usr/bin/perl \
mysql-client"

inherit rpm
