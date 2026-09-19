SUMMARY = "Check mail queues"
DESCRIPTION = "This plugin checks the number of messages in the mail queue (supports multiple \
sendmail queues, qmail)."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.4.0"

RPM_NAME = "monitoring-plugins-mailq-2.4.0-5.1.aarch64.rpm"
RPM_HASH = "c726f099ca926b17d89ee6864d1706a857f7012efc26bf86b9d408b614c5c75f2ca21f2bd283376bdc151dda4e09ca0e3505063ff4ad0e233879c35ba79b405a"

RPROVIDES:${PN} += "config-monitoring-plugins-mailq \
monitoring-plugins-mailq \
nagios-plugins-mailq"

RDEPENDS:${PN} += "/usr/bin/perl \
monitoring-plugins-common \
perl \
smtp-daemon"

inherit rpm
