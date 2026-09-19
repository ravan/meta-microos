SUMMARY = "System user and group 'prometheus'"
DESCRIPTION = "This package provides a shared system user for all Prometheus components \
like the Prometheus server itself and the Alertmanager"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "system-user-prometheus-1.0.0-2.3.noarch.rpm"
RPM_HASH = "e3cc6926f3912eea3fac44d0e5cc882034ea2b0c828dff87069442e7c215767f98a0a013b9aa82573c70a56b835891e37d0d14bd10fe560a031a25f166e1079f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-prometheus \
system-user-prometheus \
user-prometheus"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm
