SUMMARY = "Systemd generator to create timer units"
DESCRIPTION = "Systemd generator to create timer units from scripts in \
/etc/cron.{hourly,daily,weekly,monthly,yearly} \
 \
Using this method alleviates the need to install cron to run those \
scripts. The cron implementation uses a shell script that wakes up \
every hour, even when there's nothing to do. Timers on the other \
hand are created only for scripts that actually exist and trigger at \
the specific time the scripts must run."
LICENSE = "MIT"

PV = "0"

RPM_NAME = "systemd-generator-cron2timer-0-1.9.noarch.rpm"
RPM_HASH = "e26d1370b730e99a0143af9a03bdac2f398afb8f56f812ceadeb7a1eca6542ab027d997aefbeae78fc1f648391dcd539d6cd26f5bc67c705c7a7229545539033"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "systemd-generator-cron2timer"

RDEPENDS:${PN} += "/usr/bin/bash \
systemd"

inherit rpm
