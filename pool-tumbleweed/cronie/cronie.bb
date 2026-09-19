SUMMARY = "Cron Daemon"
DESCRIPTION = "cron automatically starts programs at specific times. Add new entries \
with 'crontab -e'. (See 'man 5 crontab' and 'man 1 crontab' for \
documentation.) \
 \
Under /etc, find the directories cron.hourly, cron.daily, cron.weekly, \
and cron.monthly.  Scripts and programs that are located there are \
started automatically."
LICENSE = "BSD-3-Clause & GPL-2.0-only & MIT"

PV = "1.7.2"

RPM_NAME = "cronie-1.7.2-100.3.aarch64.rpm"
RPM_HASH = "06436f5b35db140f09d506763a09d692d5280c7a6bae14e653a60f0dbda29bdbf8f9ea62c4b2ac4169f512c1d9feabfe425b1b1bfcae9ca77f9e0a2eca751162"

RPROVIDES:${PN} += "config-cronie \
cronie"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
cron \
debianutils \
fillup \
group-trusted \
ld-linux-aarch64.so.1 \
libaudit.so.1 \
libc.so.6 \
libpam.so.0 \
libselinux.so.1 \
mail \
permissions \
systemd"

inherit rpm
