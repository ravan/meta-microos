SUMMARY = "Prometheus exporter for PostgreSQL"
DESCRIPTION = "Prometheus exporter for PostgreSQL server metrics. Supported PostgreSQL versions: 9.1 and up."
LICENSE = "Apache-2.0"

PV = "0.10.1"

RPM_NAME = "prometheus-postgres_exporter-0.10.1-6.4.aarch64.rpm"
RPM_HASH = "3558f5c6b60a0e18ce6323c6fe8178c8b08274184f53becfe68f9c3278dacde2ecbdeb20e428d8590dbf0c810f78b4e55b74924b9e740d12f10c5f7c0345e034"

RPROVIDES:${PN} += "golang-github-wrouesnel-postgres-exporter \
prometheus-postgres-exporter"

RDEPENDS:${PN} += "/usr/bin/sh \
group-prometheus \
shadow \
systemd \
user-prometheus"

inherit rpm
