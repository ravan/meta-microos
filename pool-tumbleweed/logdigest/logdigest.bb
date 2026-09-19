SUMMARY = "Mail Digests of System Log Files to the System Administrator"
DESCRIPTION = "Logdigest, run by daily as a systemd timer, greps through system log files \
(/var/log/messages, /var/log/mail, etc.) to find 'interesting' content. \
 \
Lines matching the regular expressions in /etc/logdigest/ignore are simply \
ignored. More expressions can be added to /etc/logdigest/ignore.local. \
See /etc/logdigest/config for some general settings. \
 \
The results are mailed to the sysadmin daily."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.4"

RPM_NAME = "logdigest-0.2.4-21.11.aarch64.rpm"
RPM_HASH = "9ba31dfd92af733d1b4fb31b5d8167d085d040c3f70f4c36de23c43acb725b1b21292c5c7a0afe3239a47f2b301004ca04bd9445b2ccf08c6263881b0b44e75c"

RPROVIDES:${PN} += "config-logdigest \
logdigest"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/chmod \
/usr/bin/sh \
/usr/bin/touch \
logtail"

inherit rpm
