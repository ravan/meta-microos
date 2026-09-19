SUMMARY = "Scheduler daemon for kanku"
DESCRIPTION = "A scheduler for kanku based on RabbitMQ."
LICENSE = "GPL-3.0-only"

PV = "1.0.0"

RPM_NAME = "kanku-scheduler-1.0.0-2.2.noarch.rpm"
RPM_HASH = "bedb435ade9c8812b3fd688e65bac13162d9fb3204ced37e82c274b77941cbf734fd09f5ebf6fc9019d0f048dd3fb6b35563a264141e42d495969529e87987c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kanku-scheduler \
perl-Kanku--Daemon--Scheduler"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
kanku-common \
kanku-common-server"

inherit rpm
