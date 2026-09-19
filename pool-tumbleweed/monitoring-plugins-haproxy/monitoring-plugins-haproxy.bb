SUMMARY = "Plugin to check HAProxy (csv) stats url"
DESCRIPTION = "The plugin checks HAProxy statistic url (csv) and gets UP and DOWN services."
LICENSE = "GPL-2.0-or-later"

PV = "1.1g6790d7f"

RPM_NAME = "monitoring-plugins-haproxy-1.1g6790d7f-3.4.noarch.rpm"
RPM_HASH = "8887dd31a717792d3f805df9b68d10cbe6f9d0ff4a7476dd0e99699c3a91998f4cc58c3cedee8348e1dbe8bea76698fa79980ab100fb30f4921ff8a09d10d4f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-monitoring-plugins-haproxy \
monitoring-plugins-haproxy \
nagios-plugins-haproxy"

RDEPENDS:${PN} += "/usr/bin/perl \
perl-Data--Dumper \
perl-File--Basename \
perl-HTTP--Request \
perl-HTTP--Status \
perl-LWP--Protocol--https \
perl-LWP--UserAgent \
perl-Locale--gettext \
perl-Nagios--Plugin \
perl-Time--HiRes"

inherit rpm
