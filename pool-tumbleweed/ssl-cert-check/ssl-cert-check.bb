SUMMARY = "Shell script to send notifications when SSL certificates are about to expire"
DESCRIPTION = "ssl-cert-check is a Bourne shell script that can be used to report on expiring \
SSL certificates. The script was designed to be run from cron and can e-mail \
warnings or log alerts through nagios."
LICENSE = "GPL-2.0-only"

PV = "5.0"

RPM_NAME = "ssl-cert-check-5.0-1.1.noarch.rpm"
RPM_HASH = "7ba099c0eb2b28718f946c112d290b7410f72831fb474da1cd79a53f89604f7a32d46976e8bbbc02ca61253c2e4b6f6c50cc43c581e74ba0d5fd1e25e618d5c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "monitoring-plugins-ssl-cert-check \
ssl-cert-check"

RDEPENDS:${PN} += "/usr/bin/bash \
bash \
coreutils \
findutils \
gawk \
grep \
openssl \
sed"

inherit rpm
