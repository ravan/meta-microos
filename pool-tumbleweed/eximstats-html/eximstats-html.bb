SUMMARY = "Create HTML reports of exim logs"
DESCRIPTION = "If this package is installed alongside the exim MTA, and you enable \
EXIM_REPORT_WEEKLY_HTML in /etc/sysconfig/exim, logrotate/cron will \
create HTML reports in /srv/www/eximstats. \
 \
You can edit /etc/apache2/conf.d/eximstats.conf to configure your \
webserver for the reports. \
 \
The script /usr/sbin/eximstats-html-update.py can create the reports \
for log files that were rotated in the past. (You would only run this \
once, if at all. The rest is done by logrotate / cron.)"
LICENSE = "GPL-2.0-or-later"

PV = "4.98.2"

RPM_NAME = "eximstats-html-4.98.2-4.7.aarch64.rpm"
RPM_HASH = "50a2733f9254a9555e4c7777abd2260df588d025e46f76b07bb51cd2775bf709540e759a39f9436c049bf65837c5d312d68cb17f5d5e3e003fc1a6517e9dc4de"

RPROVIDES:${PN} += "config-eximstats-html \
eximstats-html"

RDEPENDS:${PN} += "/usr/bin/python3 \
group-www \
perl-GD \
perl-GDGraph \
perl-GDTextUtil"

inherit rpm
