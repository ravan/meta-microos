SUMMARY = "Postgres monitoring script using check_postgres.pl"
DESCRIPTION = "This package contains the symlinks to execute special checks via the standard \
monitoring plugins way."
LICENSE = "GPL-2.0-or-later"

PV = "2.26.0"

RPM_NAME = "monitoring-plugins-postgres-2.26.0-1.18.noarch.rpm"
RPM_HASH = "40a62c839a25479d55d324f20841a3784dc84f4de855c54b03b6beec71aa859def9a02379842d8ce172ac151fb15a026cec08b4f750021c24d779c9d3550c20a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-monitoring-plugins-postgres \
monitoring-plugins-postgres \
nagios-plugins-postgres"

RDEPENDS:${PN} += "check-postgres"

inherit rpm
