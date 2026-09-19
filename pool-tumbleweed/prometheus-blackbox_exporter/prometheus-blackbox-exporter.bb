SUMMARY = "Prometheus blackbox prober exporter"
DESCRIPTION = "Prometheus blackbox exporter allows blackbox probing of endpoints over HTTP, HTTPS, DNS, TCP and ICMP."
LICENSE = "Apache-2.0"

PV = "0.26.0"

RPM_NAME = "prometheus-blackbox_exporter-0.26.0-8.1.aarch64.rpm"
RPM_HASH = "6af3cc0a2edbfa3fd5c08ca2ecda6e2db1f0cce60c392bf35d2a12f4e593241d4d447168a547198f20d86abc18ea801c98e23be0ad49d84a6a99bfceda05e038"

RPROVIDES:${PN} += "config-prometheus-blackbox-exporter \
prometheus-blackbox-exporter"

RDEPENDS:${PN} += "/usr/bin/sh \
group-prometheus \
permissions \
user-prometheus"

inherit rpm
