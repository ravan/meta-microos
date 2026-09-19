SUMMARY = "Performance Co-Pilot (PCP) metrics for RabbitMQ queues"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about RabbitMQ message queues."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-pmda-rabbitmq-6.3.8-3.1.noarch.rpm"
RPM_HASH = "d360f8254135f9c5d7f4d859be298238ccbb663c83bff8f52ba567ecedd2a8d97d946476af107d7706ac5c90b4c77c26b2b4f6b56a07fb0446dde77c48e9b7a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-pcp-pmda-rabbitmq \
pcp-pmda-rabbitmq"

RDEPENDS:${PN} += "/usr/bin/pmpython \
/usr/bin/sh \
python3-pcp"

inherit rpm
